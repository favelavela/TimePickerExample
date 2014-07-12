package com.example.timepickerexample;

import java.util.Calendar;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

public class MainActivity extends Activity {

	int hora, minuto;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        final Calendar c = Calendar.getInstance();
        hora = c.get(Calendar.HOUR_OF_DAY);
        minuto = c.get(Calendar.MINUTE);

        TimePickerDialog tpd = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay,
                            int minute) {
                    	
                    }

                }, hora, minuto, false);
        tpd.show();
	}
}
