package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.codepath.debuggingchallenges.R;

import java.util.Calendar;

public class CurrentDayActivity extends AppCompatActivity {

    TextView tvDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_day);
        tvDay = (TextView) findViewById(R.id.tvDay);
        Log.d("MYAPP", "found tvDay");
        tvDay.setText(String.valueOf(getDayOfMonth()));
        Log.d("MYAPP", "set text");
    }

    private int getDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH);
    }
}
