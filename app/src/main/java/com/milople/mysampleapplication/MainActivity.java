package com.milople.mysampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.milople.messagelibrary.Alertmessage;

public class MainActivity extends AppCompatActivity {
    Button btnshowmsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnshowmsg=findViewById(R.id.btnshowmsg);
        Alertmessage.getmessage(getApplicationContext());
    }
}