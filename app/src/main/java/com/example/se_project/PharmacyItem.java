package com.example.se_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class PharmacyItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy_item);

        //ActionBar actionBar=getSupportActionBar();
        TextView tv =findViewById(R.id.tv);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        Intent intent =getIntent();
        String name = intent.getStringExtra("Name");
        String info =intent.getStringExtra("Info");
        String address =intent.getStringExtra("Address");

        //actionBar.setTitle(name);
        tv.setText(name);
        tv2.setText(info);
        tv3.setText(address);
    }

}
