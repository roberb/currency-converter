package com.currencyConverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;


public class Email extends Activity implements View.OnClickListener {
	EditText subject, message;
	String sub, mess;
	float rat;
	Button sendEmail;
	RatingBar rate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initializeVars();
		sendEmail.setOnClickListener(this);
	}
	private void initializeVars() {
		subject = (EditText) findViewById(R.id.email_subj);
		message = (EditText) findViewById(R.id.email_mess);
		rate = (RatingBar) findViewById(R.id.email_rate);
		sendEmail = (Button) findViewById(R.id.email_sendButton);

	}
	public void onClick(View v) {
		editTextToString();
		mess=mess+"\n\n Rating: "+ String.valueOf(rat);
		String emailaddress[] = {"robefumi@gmail.com"};
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, sub);
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, mess);
		startActivity(emailIntent);
	}
	private void editTextToString() {
		sub = subject.getText().toString();
		mess = message.getText().toString();
		rat = rate.getRating();
		
	}
	@Override
	protected void onPause() {
		super.onPause();
		finish();
	}
}