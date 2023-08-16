package com.example.jetsetgoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    int A1id = 1;
    int A2id = 1;
    int A3id = 1;
    int A4id = 1;
    int A6id = 1;
    int A8id = 1;
    int B1id = 1;
    int B3id = 1;
    int B6id = 1;
    int B7id = 1;
    int B8id = 1;
    int B9id = 1;
    int C3id = 1;
    int C4id = 1;
    int C5id = 1;
    int C7id = 1;
    int D1id = 1;
    int D2id = 1;
    int D4id = 1;
    int D5id = 1;
    int D6id = 1;
    int D9id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main3);


        ImageView A1 = (ImageView) findViewById(R.id.A1);
        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A1id++;
                if (A1id % 2 == 0) {
                    A1.setImageResource(R.drawable.your_seat_img);
                }else {
                    A1.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView A2 = (ImageView) findViewById(R.id.A2);
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A2id++;
                if (A2id % 2 == 0) {
                    A2.setImageResource(R.drawable.your_seat_img);
                }else {
                    A2.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView A3 = (ImageView) findViewById(R.id.A3);
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A3id++;
                if (A3id % 2 == 0) {
                    A3.setImageResource(R.drawable.your_seat_img);
                }else {
                    A3.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView A4 = (ImageView) findViewById(R.id.A4);
        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A4id++;
                if (A4id % 2 == 0) {
                    A4.setImageResource(R.drawable.your_seat_img);
                }else {
                    A4.setImageResource(R.drawable.available_img);
                }

            }
        });

        ImageView A6 = (ImageView) findViewById(R.id.A6);
        A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A6id++;
                if (A6id % 2 == 0) {
                    A6.setImageResource(R.drawable.your_seat_img);
                }else {
                    A6.setImageResource(R.drawable.available_img);
                }

            }
        });

        ImageView A8 = (ImageView) findViewById(R.id.A8);
        A8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A8id++;
                if (A8id % 2 == 0) {
                    A8.setImageResource(R.drawable.your_seat_img);
                }else {
                    A8.setImageResource(R.drawable.available_img);
                }

            }
        });

        ImageView B1 = (ImageView) findViewById(R.id.B1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B1id++;
                if (B1id % 2 == 0) {
                    B1.setImageResource(R.drawable.your_seat_img);
                }else {
                    B1.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView B3 = (ImageView) findViewById(R.id.B3);
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B3id++;
                if (B3id % 2 == 0) {
                    B3.setImageResource(R.drawable.your_seat_img);
                }else {
                    B3.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView B6 = (ImageView) findViewById(R.id.B6);
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B6id++;
                if (B6id % 2 == 0) {
                    B6.setImageResource(R.drawable.your_seat_img);
                }else {
                    B6.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView B7 = (ImageView) findViewById(R.id.B7);
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B7id++;
                if (B7id % 2 == 0) {
                    B7.setImageResource(R.drawable.your_seat_img);
                }else {
                    B7.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView B8 = (ImageView) findViewById(R.id.B8);
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B8id++;
                if (B8id % 2 == 0) {
                    B8.setImageResource(R.drawable.your_seat_img);
                }else {
                    B8.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView B9 = (ImageView) findViewById(R.id.B9);
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B9id++;
                if (B9id % 2 == 0) {
                    B9.setImageResource(R.drawable.your_seat_img);
                }else {
                    B9.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView C3 = (ImageView) findViewById(R.id.C3);
        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                C3id++;
                if (C3id % 2 == 0) {
                    C3.setImageResource(R.drawable.your_seat_img);
                }else {
                    C3.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView C4 = (ImageView) findViewById(R.id.C4);
        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                C4id++;
                if (C4id % 2 == 0) {
                    C4.setImageResource(R.drawable.your_seat_img);
                }else {
                    C4.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView C5 = (ImageView) findViewById(R.id.C5);
        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                C5id++;
                if (C5id % 2 == 0) {
                    C5.setImageResource(R.drawable.your_seat_img);
                }else {
                    C5.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView C7 = (ImageView) findViewById(R.id.C7);
        C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                C7id++;
                if (C7id % 2 == 0) {
                    C7.setImageResource(R.drawable.your_seat_img);
                }else {
                    C7.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView D1 = (ImageView) findViewById(R.id.D1);
        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D1id++;
                if (D1id % 2 == 0) {
                    D1.setImageResource(R.drawable.your_seat_img);
                }else {
                    D1.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView D2 = (ImageView) findViewById(R.id.D2);
        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D2id++;
                if (D2id % 2 == 0) {
                    D2.setImageResource(R.drawable.your_seat_img);
                }else {
                    D2.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView D4 = (ImageView) findViewById(R.id.D4);
        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D4id++;
                if (D4id % 2 == 0) {
                    D4.setImageResource(R.drawable.your_seat_img);
                }else {
                    D4.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView D5 = (ImageView) findViewById(R.id.D5);
        D5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D5id++;
                if (D5id % 2 == 0) {
                    D5.setImageResource(R.drawable.your_seat_img);
                }else {
                    D5.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView D6= (ImageView) findViewById(R.id.D6);
        D6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D6id++;
                if (D6id % 2 == 0) {
                    D6.setImageResource(R.drawable.your_seat_img);
                }else {
                    D6.setImageResource(R.drawable.available_img);
                }

            }
        });
        ImageView D9 = (ImageView) findViewById(R.id.D9);
        D9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                D9id++;
                if (D9id % 2 == 0) {
                    D9.setImageResource(R.drawable.your_seat_img);
                }else {
                    D9.setImageResource(R.drawable.available_img);
                }

            }
        });

    }
}