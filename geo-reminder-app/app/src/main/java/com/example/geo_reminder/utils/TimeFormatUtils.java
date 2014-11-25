/**
 * 
 */
package com.example.geo_reminder.utils;

/**
 * @author rgovindk
 *
 */
public class TimeFormatUtils {

	public static String getFormattedTime(int hourOfDay, int minute) {

		int str12HourFormat = get12HourFormat(hourOfDay);
		String amPm = hourOfDay > 11 ? "PM" : "AM";
		return (getPaddedString(str12HourFormat) + " : " + getPaddedString(minute)) + " " + amPm;
	}

	public static int get12HourFormat(int hourOfDay) {

		return hourOfDay > 12 ? hourOfDay - 12 : hourOfDay;
	}

	public static String getPaddedString(int value) {
		if (value >= 10) {
			return String.valueOf(value);
		}

		return "0" + String.valueOf(value);
	}

}
