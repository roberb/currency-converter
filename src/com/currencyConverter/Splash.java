package com.currencyConverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle b) {

		super.onCreate(b);
		setContentView(R.layout.splash);

		Thread timer=new Thread(){
			@Override
			public void run(){
				try{
					sleep(5000);	//5 second sleep
				} catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openStartingPoint = new Intent("com.currencyConverter.STARTINGPOINT");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
		
	}

	@Override
	protected void onPause() {
		super.onPause();
		finish();
	}
	


}
