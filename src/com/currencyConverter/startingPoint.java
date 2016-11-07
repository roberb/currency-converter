package com.currencyConverter;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class startingPoint extends Activity implements OnClickListener,OnItemSelectedListener {

	private static final String TAG = "CurrencyConverter";
	Spinner list1;
	Spinner list2;
	Button convertButton;
	EditText value1;
	TextView value2;
	String s1;
	String s2;
	double [][] table,table2;
	String background;
	ArrayList<String> currencyStringNames;
	Currency[] currencies;
	Converter converter;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.min_currency);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_header);
        initComponents();        
        //fillTable();
     	fillLists();
        convertButton.setOnClickListener(this);
        list2.setOnItemSelectedListener(this);
        /*
        if(!getIntent().getExtras().isEmpty()){
			Bundle b = getIntent().getExtras();
			this.background=b.getString("key");
			if(background.equals("userBg"))
		        getWindow().setBackgroundDrawable(Drawable.createFromPath("res/userBg.jpg"));

		}*/
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		menu.add(Menu.NONE, ITEM_ABOUT, 0,
//				getString(R.string.menu_about)).setIcon(android.R.drawable.ic_menu_help);
//		menu.add(Menu.NONE, ITEM_CONTACT, 0,
//				getString(R.string.menu_contact)).setIcon(android.R.drawable.ic_menu_send);
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUP = getMenuInflater();
		blowUP.inflate(R.menu.menu, menu);
		return true;
    	
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case R.id.about:
	            viewAboutPage();
	            break;
	        case R.id.contact:
	            viewContactPage();
	            break;
	        case R.id.camera:
	        	viewCameraPage();
	    }
	    return false;
	}

	private void viewCameraPage() {
		Intent openContactPage = new Intent("com.currencyConverter.CAMERA");
		startActivity(openContactPage);
		
	}

	private void viewContactPage() {
		Intent openContactPage = new Intent("com.currencyConverter.EMAIL");
		startActivity(openContactPage);
	}

	private void viewAboutPage() {
		Intent openAboutPage = new Intent("com.currencyConverter.ABOUT");
		startActivity(openAboutPage);
		
	}
    
    private void fillLists() {
    	
    	// Create an ArrayAdapter using the string array and a default spinner layout
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.currencies, android.R.layout.simple_spinner_item);
    	currencyStringNames = Currency.getStringCurrency();
    	
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,currencyStringNames);
     	
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        // Apply the adapter to the spinner
        list1.setAdapter(adapter);
        
        // Apply the adapter to the spinner
        list2.setAdapter(adapter);
		
	}

	private void initComponents() {
        //Conversion table
		this.currencyStringNames=Currency.getStringCurrency();
		this.converter = new Converter();
		this.currencies = Currency.values();
    	//table=new double[currency.size()][currency.size()];
    	
    	list1=(Spinner) findViewById(R.id.spinner1);
        list2=(Spinner) findViewById(R.id.spinner2);
        convertButton = (Button) findViewById(R.id.button1);
        value1=(EditText) findViewById(R.id.editText2);
        value2= (TextView) findViewById(R.id.textView2);
	}

//	private void fillTable() {
//		Currency[] curr = Currency.values();
//		Converter converter = new Converter();
//		 //Convert 12GBP to USD and print the result to console
//		double gbp_cad=converter.getConvertedValue(12, Currency.British_Pound.getCurrencyCode(),
//		        Currency.Canadian_Dollar.getCurrencyCode());
		
//		for(int i=0;i<curr.length;i++)
//		{
//			for(int j=0;j<curr.length;j++)
//			{
//				if (i==j){
//					this.table[i][j]=1;
//				}
//				else{
//					this.table[i][j] = converter.getConvertedValue(1, curr[i].getCurrencyCode(),
//					        curr[j].getCurrencyCode());
//				}
//			}
//		}
//		
		
		
		
//		//0-Dollar,1-Euro,2-GBP
//    	this.table[0][0]=1;
//    	this.table[0][1]=(double) 0.80258;
//    	this.table[0][2]=(double) 0.64288;
//    	this.table[1][0]=(double) 1.24598;
//    	this.table[1][1]=1;
//    	this.table[1][2]=(double) 0.64288;
//    	this.table[2][0]=(double) 1.55561;
//    	this.table[2][1]=(double) 1.24794;
//    	this.table[2][2]=1;
    	
//    	Converter converter = new Converter();
//		 //Convert 12GBP to USD and print the result to console
//		double gbp_cad=converter.getConvertedValue(12, Currency.British_Pound.getCurrencyCode(),
//		        Currency.Canadian_Dollar.getCurrencyCode());
//		double gbp_eur=converter.getConvertedValue(12, Currency.British_Pound.getCurrencyCode(),
//                Currency.Euro.getCurrencyCode());
//		double gbp_hkd=converter.getConvertedValue(12, Currency.British_Pound.getCurrencyCode(),
//                Currency.Hong_Kong_Dollar.getCurrencyCode());
//		double gbp_jpy=converter.getConvertedValue(12, Currency.British_Pound.getCurrencyCode(),
//                Currency.Japanese_Yen.getCurrencyCode());
//		double gbp_chf=converter.getConvertedValue(12, Currency.British_Pound.getCurrencyCode(),
//                Currency.Swiss_Franc.getCurrencyCode());
//		double gbp_usd=converter.getConvertedValue(12, Currency.British_Pound.getCurrencyCode(),
//                Currency.US_Dollar.getCurrencyCode());
    	
//    	//0-GBP,1-CAD,2-EUR,3-HKD,4-JPY,5-CHF,6-USD
//    	double fila0[]={1,(double)0.6269,(double)0.8069,(double)0.08213,(double)0.007986,(double)0.6718,(double)0.637};
//    	double fila1[]={(double)1.5978,1,(double)1.2887,(double)0.1311,(double)0.012754,(double)1.073,(double)1.0171};
//    	double fila2[]={(double)1.2408,(double)0.7774,1,(double) 0.1019,(double)0.0099,(double)0.8328,(double)0.7899};
//    	double fila3[]={(double)12.1885,(double)7.6356,(double)9.825,1,(double)0.09729,(double)8.1847,(double)7.7586};
//    	double fila4[]={(double)125.422,(double)78.5806,(double)101.108,(double)10.2953,1,(double)84.2041,(double)79.8466};
//    	double fila5[]={(double)1.4906,(double)0.9339,(double)1.2018,(double)0.1224,(double)0.011897,1,(double)0.9489};
//    	double fila6[]={(double)1.571,(double)0.9841,(double)1.267,(double)0.1289,(double)0.01254,(double)1.0549,1};
//    	table2 = new double[7][7];
//    	for(int j=0;j<table2.length;j++){
//    		table2[0][j]=fila0[j];
//    		table2[1][j]=fila1[j];
//    		table2[2][j]=fila2[j];
//    		table2[3][j]=fila3[j];
//    		table2[4][j]=fila4[j];
//    		table2[5][j]=fila5[j];
//    		table2[6][j]=fila6[j];
//    	}
//    	System.out.println(table2);
//	}

	public void onClick(View v) {
		
		int id1 = list1.getSelectedItemPosition();
		int id2 = list2.getSelectedItemPosition();
		
		String value = value1.getText().toString();
		InputMethodManager imm = (InputMethodManager)getSystemService(
			      Context.INPUT_METHOD_SERVICE);
			imm.hideSoftInputFromWindow(value1.getWindowToken(), 0);
		if(!value.equals("")){
			double val = Double.parseDouble(value);
			double res;
			try {
				res = new Converter().execute(String.valueOf(val), currencies[id1].getCurrencyCode(),
				        currencies[id2].getCurrencyCode()).get();
				BigDecimal roundRes = new BigDecimal(res);
				roundRes=roundRes.round(new MathContext(3, RoundingMode.HALF_UP));
				res = roundRes.doubleValue();
				value2.setText(String.valueOf(res)+" "+currencies[id2].getCurrencyCode());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
				
        Log.d(TAG, "onClicked");
      }

	public void onItemSelected(AdapterView<?> arg0, View view, int pos,
			long id) {
		value2.setText("");
		
		
		
	}

	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
}