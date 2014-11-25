/**
 * 
 */
package com.example.geo_reminder.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.geo_reminder.R;

/**
 * @author rgovindk
 *
 */
public class RemindersListActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reminders_list);

		initializeElements();

	}

	private void initializeElements() {
		Button addReminderButton = (Button) findViewById(R.id.bAdd);
		addReminderButton.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {

		Intent intent = new Intent("com.example.geo_reminder.intent.ReminderDetails");
		startActivity(intent);

	}

}
