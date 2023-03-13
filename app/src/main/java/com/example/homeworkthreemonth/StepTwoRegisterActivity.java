package com.example.homeworkthreemonth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;



public class StepTwoRegisterActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView firstNameTextView;
    private TextView FhaterNameTextView;
    private TextView AgeTextView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_two_register);

        nameTextView = findViewById(R.id.textViewMenu);
        firstNameTextView = findViewById(R.id.textViewMenuTwo);
        FhaterNameTextView = findViewById(R.id.textViewThree);
        AgeTextView = findViewById(R.id.textViewFour);

        String name = getIntent().getStringExtra("name");
        String first_name = getIntent().getStringExtra("first_name");
        String fhater_name = getIntent().getStringExtra("fhater_name");
        String age = getIntent().getStringExtra("age");

        nameTextView.setText(name);
        firstNameTextView.setText(first_name);
        FhaterNameTextView.setText(fhater_name);
        AgeTextView.setText(age);

    }
}