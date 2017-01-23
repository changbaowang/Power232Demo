package com.example.power232;

import com.example.power232.RS232Controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private static RS232Controller mPower232;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//执行上电操作
		mPower232 = new RS232Controller();
		mPower232.Rs232_PowerOn();
		
	}
}
