package com.multiform;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Form2 extends Activity {
	
	Button btnPrev;
	TextView txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form2);
		
		btnPrev=(Button) findViewById(R.id.btnPrev);
		txt=(TextView) findViewById(R.id.textView1);
		
		//Menerima Item
		Intent i=this.getIntent();
		txt.setText("This is From "+i.getStringExtra("pesan")+i.getStringExtra("pesan2"));
		
		btnPrev.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
	}	
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}	
		
}
