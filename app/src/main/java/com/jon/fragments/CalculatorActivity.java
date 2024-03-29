package com.jon.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.jon.fragments.fragments.AutomorphicFragment;
import com.jon.fragments.fragments.CircleFragment;
import com.jon.fragments.fragments.PalendromeFragment;
import com.jon.fragments.fragments.ReverseFragment;
import com.jon.fragments.fragments.ReverseStringFragment;
import com.jon.fragments.fragments.SumFragment;

public class CalculatorActivity extends AppCompatActivity {

    private Button buttonSum, buttonCircle, buttonReverse, buttonPalendrome, buttonAutomorphic, buttonReverseString;
    private Boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SumFragment sumFragment = new SumFragment();
        fragmentTransaction.replace(R.id.layoutContainer, sumFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        buttonSum = findViewById(R.id.btnSum);
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    SumFragment sumFragment = new SumFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, sumFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        buttonCircle = findViewById(R.id.btnCircle);
        buttonCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    CircleFragment circleFragment = new CircleFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, circleFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        buttonReverse = findViewById(R.id.btnReverse);
        buttonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    ReverseFragment reverseFragment = new ReverseFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, reverseFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });


        buttonPalendrome = findViewById(R.id.btnPalendrome);
        buttonPalendrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    PalendromeFragment palendromeFragment = new PalendromeFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, palendromeFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                }
            }
        });

        buttonReverseString = findViewById(R.id.btnRevStr);
        buttonReverseString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, reverseStringFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {

                }
            }
        });


        buttonAutomorphic = findViewById(R.id.btnAuto);
        buttonAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status) {
                    AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                    fragmentTransaction.replace(R.id.layoutContainer, automorphicFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {

                }
            }
        });
    }
}
