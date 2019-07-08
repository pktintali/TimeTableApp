package com.pktintali.com.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void dobackj(View view) {
        finish();
    }

    public void opCon(View view) {
        Intent i1 = new Intent(this,contact.class);
        startActivity(i1);

    }
}
