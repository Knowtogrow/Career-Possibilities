package com.example.predictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class Career_Predictor extends AppCompatActivity {


      TextInputLayout subjects;
      AutoCompleteTextView allsubjects;

      TextInputLayout subjects2;
      AutoCompleteTextView allsubjects2;

      TextInputLayout subjects3;
      AutoCompleteTextView allsubjects3;

      TextInputLayout subjects4;
      AutoCompleteTextView allsubjects4;

      String[] sub;
      ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       subjects=(TextInputLayout)findViewById(R.id.subjects);
        allsubjects=(AutoCompleteTextView)findViewById(R.id.allsubjects);

        sub= getResources().getStringArray(R.array.spinner1);
        adapter=new ArrayAdapter<>(getApplicationContext(),R.layout.drop_down_item, sub);
        allsubjects.setAdapter(adapter);


        //2ND DROP DOWN
        subjects2=(TextInputLayout)findViewById(R.id.subjects2);
        allsubjects2=(AutoCompleteTextView)findViewById(R.id.allsubjects2);

        sub= getResources().getStringArray(R.array.spinner1);
        adapter=new ArrayAdapter<>(getApplicationContext(),R.layout.drop_down_item, sub);
        allsubjects2.setAdapter(adapter);

        //3RD DROP DOWN
        subjects3=(TextInputLayout)findViewById(R.id.subjects3);
        allsubjects3=(AutoCompleteTextView)findViewById(R.id.allsubjects3);

        sub= getResources().getStringArray(R.array.spinner1);
        adapter=new ArrayAdapter<>(getApplicationContext(),R.layout.drop_down_item, sub);
        allsubjects3.setAdapter(adapter);

        //4TH DROP DOWN
        subjects4=(TextInputLayout)findViewById(R.id.subjects4);
        allsubjects4=(AutoCompleteTextView)findViewById(R.id.allsubjects4);

        sub= getResources().getStringArray(R.array.spinner1);
        adapter=new ArrayAdapter<>(getApplicationContext(),R.layout.drop_down_item, sub);
        allsubjects4.setAdapter(adapter);

    }

// BUTTON DETAILS
    public void Submit(View view) {
        startActivity(new Intent(getApplicationContext(),Loading.class));
    }
}