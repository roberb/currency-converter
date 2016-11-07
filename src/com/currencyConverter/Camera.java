package com.currencyConverter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Camera extends Activity implements View.OnClickListener{
	
	ImageButton ib;
	Button b;
	ImageView iv;
	Intent i;
	final static int cameraData=0;
	Bitmap bmp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photo);
		initialize();
		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if(resultCode==RESULT_OK){
			Bundle extras=data.getExtras();
			bmp = (Bitmap) extras.get("data");
			iv.setImageBitmap(bmp);
			//OutputStream os;
			
		}
	}

	private void initialize() {
		ib=(ImageButton) findViewById(R.id.btn_takePic);
		iv=(ImageView) findViewById(R.id.ivReturnedPic);
		b=(Button) findViewById(R.id.btn_setWall);
		ib.setOnClickListener(this);
		b.setOnClickListener(this);
		
	}

	public void onClick(View v) {
		switch (v.getId()){
		
		case R.id.btn_takePic:
			i=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(i, cameraData);
			break;
			
		case R.id.btn_setWall:
			String bg="userBg";
			Bundle b=new Bundle();
			b.putString("key", bg);
			Intent i = new Intent();
			i.putExtras(b);	
			startActivity(i);
			break;
		}
		
	}

}
