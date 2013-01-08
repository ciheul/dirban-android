package com.ciheul.dirban.android;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SearchEngineActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_engine);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search_engine, menu);
		return true;
	}

}
