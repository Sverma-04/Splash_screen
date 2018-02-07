package com.example.saloni.splash_screen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by saloni on 07/02/18.
 */

public class tmListView extends AppCompatActivity {

    // Button submit = (Button) findViewById(R.id.submitTM);
    // EditText txtinputList = (EditText) findViewById(R.id.txtinput);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tm_list);

        ArrayList<String> arrayList;
        EditText txtInput;
        ArrayAdapter<String> adapter;
        String newitem;



        txtInput = (EditText) findViewById(R.id.txtinput);
        ListView listView = (ListView) findViewById(R.id.listv);
        String items []={};
        arrayList = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.txtitem, arrayList);
        listView.setAdapter(adapter);
        Intent i = getIntent();

        newitem = i.getExtras().getString("url");


        arrayList.add("https://www.infosecurity-magazine.com/news/suspected-atm-jackpotting/");
        arrayList.add("https://www.infosecurity-magazine.com/news/2017-worst-year-ever-for-data-loss/");
        arrayList.add(newitem);
        adapter.notifyDataSetChanged();



    }


    //create function for submit TM news and go to next screem
    //add onclick func name in function.
}

