package com.multiform;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button btnNext,btnSkfc,btnCkfc,btnSmcd,btnCmcd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnNext=(Button) findViewById(R.id.btnNext);
		btnSkfc=(Button) findViewById(R.id.btnSkfc);
		btnCkfc=(Button) findViewById(R.id.btnCkfc);
		btnSmcd=(Button) findViewById(R.id.btnSmcd);
		btnCmcd=(Button) findViewById(R.id.btnCmcd);
		
		btnSkfc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			callIntent(arg0);
			}
		});
		
		btnCkfc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				callIntent(arg0);
			}
		});
		
		btnSmcd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				callIntent(arg0);
			}
		});

		btnCmcd.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				callIntent(arg0);
			}
		});
	}
	
	public void callIntent(View v)
	{
		Intent i=null;
		
		switch (v.getId()) {
		case R.id.btnSkfc:
			i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.kfcindonesia.com"));
			startActivity(i);
		break;
		
		case R.id.btnCkfc:
			i=new Intent(Intent.ACTION_CALL,Uri.parse("tel:14022"));
			startActivity(i);
		break;
		
		case R.id.btnSmcd:
			i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.mcdonalds.co.id"));
			startActivity(i);
		break;
		
		case R.id.btnCmcd:
			i=new Intent(Intent.ACTION_CALL,Uri.parse("tel:14045"));
			startActivity(i);
		break;

		default:
			break;
		}
	}
	
	public void next_action(View v)
	{
		Intent i=new Intent(MainActivity.this,Form2.class);
		i.putExtra("pesan", "Main Activity");
		i.putExtra("pesan2", " Hehehe :)");
		startActivity(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
