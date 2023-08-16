package com.example.jetsetgoo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.CalendarContract;
//import android.sax.Element;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("                                        JetSetGOo!   " +  "                                         "+
                        "Its an Airline Ticket Booking App")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("JetSetGOo! TEAM")
                .addGroup("01748189833")
                .addEmail("sumaiyazoha0606@gmail.com ")
                .addFacebook("https://www.facebook.com/sadakatul.sornop.3")
                .addInstagram("https://l.facebook.com/l.php?u=https%3A%2F%2Finstagram.com%2Fxcooby_dooo%3Figshid%3DOGQ5ZDc2ODk2ZA%253D%253D%26fbclid%3DIwAR3-UjusS4P6f6IV9KCsRaqI3w0j5IQCc__3vsdo_P5iw1PH68I3oAh3FbU&h=AT2ta-vZss9a3YRPJznUNQW_oKJpzF7GVBC4ZqkRn4fzDr8kbsCidjJHiIjaDwbl1tTKf75thfUlbm9bw_Pzy0RCQlfimYrNLWJuEt9QvnpnywG76YacZvNAYsIikfVZSCBFMQ")    //Your instagram id
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by JetSetGOo! TEAM", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutUs.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}
