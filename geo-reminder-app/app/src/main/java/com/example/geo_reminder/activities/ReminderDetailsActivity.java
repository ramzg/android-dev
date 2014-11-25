/**
 * 
 */
package com.example.geo_reminder.activities;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import com.example.geo_reminder.R;
import com.example.geo_reminder.components.TimePickerFragment;

/**
 * @author rgovindk
 * 
 */
public class ReminderDetailsActivity extends FragmentActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reminder_details);
	}

	@Override
	public void onClick(View v) {
		int btnClicked = v.getId();
		switch (btnClicked) {
		case R.id.bSaveReminder:
			Intent intent = new Intent("com.example.geo_reminder.intent.LoginScreen");
			startActivity(intent);

			break;
		case R.id.bDeleteReminder:
			// Code for delete reminder
			break;
		default:
			// Default case
		}

	}

	public void showTimePickerDialog(View v) {
		DialogFragment newFragment = new TimePickerFragment();

		newFragment.show(getFragmentManager(), "timePicker");

	}

	public void onUserSelectValue(String selectedTime) {

		EditText etTime = (EditText) findViewById(R.id.etReminderTime);
		etTime.setText(selectedTime);

	}


}
