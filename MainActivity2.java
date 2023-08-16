package com.example.jetsetgoo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        cardView = findViewById(R.id.cardView);
        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(intent);

        });

        cardView = findViewById(R.id.Air2);
        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(intent);

        });

        cardView = findViewById(R.id.Air3);
        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(intent);

        });
        cardView = findViewById(R.id.Air4);
        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
            startActivity(intent);

        });
        cardView = findViewById(R.id.Air5);
        cardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(intent);

        });

        TextView from = (TextView) findViewById(R.id.from);
        TextView to = (TextView) findViewById(R.id.to);
        TextView dateText = (TextView) findViewById(R.id.textView3);
        SharedPreferences sh = getSharedPreferences("JetSetGOo!", MODE_PRIVATE);
        from.setText(sh.getString("from", "guest"));
        to.setText(sh.getString("to", "guest"));
        dateText.setText(sh.getString("date", "guest"));
    }

}