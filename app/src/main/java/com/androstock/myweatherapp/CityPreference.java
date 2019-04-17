package com.androstock.myweatherapp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.EditText;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity() {
        return prefs.getString("city", "Sydney, AU");
    }
}