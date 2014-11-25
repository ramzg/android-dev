/**
 * 
 */
package com.example.geo_reminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * @author rgovindk
 *
 */
public class SplashScreen extends Activity {

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen_layout);

		Thread timer = new Thread() {

			@Override
			public void run() {
				try {
					sleep(1000);
					Intent intent = new Intent("com.example.geo_reminder.intent.LoginScreen");
					startActivity(intent);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				} finally {

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
