package com.example.jetsetgoo;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.checkerframework.checker.nullness.qual.NonNull;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Button flightButton ;
    Button mloginbtn2;
    ActionBarDrawerToggle drawerToggle;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView flightbtn = (CardView) findViewById(R.id.tickets);


       flightButton = findViewById(R.id.flightTicket);
        flightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5= new Intent(MainActivity.this,FlightBooking.class);
                startActivity(intent5);
                Toast.makeText(getApplicationContext(), "Log In Successful", Toast.LENGTH_SHORT).show();
            }
        });

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.Open, R.string.Close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                    {
                        Toast.makeText(MainActivity.this,"Home selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.aboutus:
                    {
                        Toast.makeText(MainActivity.this,"About Us selected",Toast.LENGTH_SHORT).show();
                       Intent intent = new Intent(MainActivity.this,Contact_Us.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.bookings:
                    {
                        Toast.makeText(MainActivity.this,"Bookings selected",Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(MainActivity.this,UserBookings.class);
                        startActivity(intent1);
                        break;
                    }

                    case R.id.connectUs:
                    {
                        Intent intent2 = new Intent(MainActivity.this,AboutUs.class);
                        startActivity(intent2);
                        break;
                    }
                    case R.id.share:
                    {
                        Toast.makeText(MainActivity.this,"Share selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.rate_us:
                    {
                        Toast.makeText(MainActivity.this,"Rate_us selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.Logout:
                    {
                        Intent intent3 = new Intent(MainActivity.this,Logout.class);
                        startActivity(intent3);
                        break;
                    }

                    default:
                        throw new IllegalStateException("Unexpected value: " + item.getItemId());
                }
                return false;
            }
        });


    }




}