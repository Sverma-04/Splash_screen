package com.example.saloni.splash_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        Button btnNews = (Button) findViewById(R.id.button_news);
        Button btnTMNews = (Button) findViewById(R.id.button_TMnews);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String cc = extras.getString("COUNTRY_CODE");
            Toast.makeText(MainActivity.this,"Country code"+cc,Toast.LENGTH_LONG).show();


            //The key argument here must match that used in the other activity
        }
        else{
            Toast.makeText(MainActivity.this,"NoCode",Toast.LENGTH_LONG).show();
        }



    }
//            public void sendToTMsource(View v) {
//
//
//                Intent intent_TMnewsSource = new Intent(MainActivity.this, TM_source.class);
//                startActivity(intent_TMnewsSource);
//            }
//    public void sendToNewsAPIView(View v) {
//        Intent intent_newsList = new Intent(MainActivity.this, newsAPIView.class);
//        startActivity(intent_newsList);
//    }


//        public void sendToNewsAPI(View v) {
//        Intent intent_newsSource = new Intent(MainActivity.this, newsAPI.class);
//        startActivity(intent_newsSource);
//    }
    //set onclick function name to buton

    }


