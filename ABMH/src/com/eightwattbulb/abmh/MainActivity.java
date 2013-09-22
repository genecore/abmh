package com.eightwattbulb.abmh;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public static final String ROOM_NUMBER = "com.eightwattbulb.abmh.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void actualActivity(View view) {
		Intent intent = new Intent(this,ActualActivity.class);
		EditText edittext = (EditText)findViewById(R.id.edittext1);
		String message = edittext.getText().toString();
		//int number = getIntent().getExtras().getInt(message);
		intent.putExtra(ROOM_NUMBER, message);
		startActivity(intent);
		
		
	}

}
