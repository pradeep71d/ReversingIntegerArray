package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a[] = {12, 2, 3, 4, 56, 7, 2, 12};
        for ( int i=a.length-1;i>=0;i--){
            System.out.println("out is="+a[i]);
        }
    }
}

