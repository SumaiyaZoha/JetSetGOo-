package com.example.jetsetgoo;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;


import android.os.Bundle;

import java.util.Calendar;

public class FlightBooking extends AppCompatActivity {
    Button search_buses;
    private EditText dateEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_booking);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        search_buses = findViewById(R.id.search_buses);
        search_buses.setOnClickListener(view -> {
            Spinner toSpinner = (Spinner) findViewById(R.id.toSpinner);
            Spinner fromSpinner = (Spinner) findViewById(R.id.fromSpinner);
            EditText dateText = (EditText) findViewById(R.id.idEdtDate);
            SharedPreferences sharedPreferences = getSharedPreferences("JetSetGOo!",MODE_PRIVATE);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putString("to", toSpinner.getSelectedItem().toString());
            myEdit.putString("from", fromSpinner.getSelectedItem().toString());
            myEdit.putString("date", dateText.getText().toString());
            myEdit.commit();
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(intent);
        });


        dateEdt = findViewById(R.id.idEdtDate);

        // on below line we are adding click listener
        // for our pick date button
        dateEdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on below line we are getting
                // the instance of our calendar.
                final Calendar c = Calendar.getInstance();

                // on below line we are getting
                // our day, month and year.
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                // on below line we are creating a variable for date picker dialog.
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        // on below line we are passing context.
                        FlightBooking.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // on below line we are setting date to our edit text.
                                dateEdt.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        },
                        // on below line we are passing year,
                        // month and day for selected date in our date picker.
                        year, month, day);
                // at last we are calling show to
                // display our date picker dialog.
                datePickerDialog.show();



            }
        });

    }
}