package com.example.egzaminas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        OneFragment firstFragment = new OneFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.NumberFragment, firstFragment, firstFragment.getTag())
                .commit();

        TwoFragment secondFragment = new TwoFragment();
        manager.beginTransaction()
                .replace(R.id.GraphFragment, secondFragment, secondFragment.getTag())
                .commit();


//        getSupportFragmentManager().beginTransaction().add(R.id.NumberFragment, new OneFragment()).commit();

//        getSupportFragmentManager().beginTransaction().add(R.id.GraphFragment, new TwoFragment()).commit();
    }
}