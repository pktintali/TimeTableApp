package com.pktintali.com.timetable;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class otherapps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otherapps);
    }

    public void goBack(View view) {
        finish();
    }

    public void dolink(View view) {

        Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/n52u41"));
        startActivity(i1);
    }
}
