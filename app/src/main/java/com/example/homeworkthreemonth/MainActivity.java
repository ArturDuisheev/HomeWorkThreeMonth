package com.example.homeworkthreemonth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton button;
    private EditText name;
    private EditText first_name;
    private EditText fhater_name;
    private EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.next_btn);
        name = findViewById(R.id.name_edit_text);
        first_name = findViewById(R.id.first_name_edit_text);
        fhater_name = findViewById(R.id.father_name_edit_text);
        age = findViewById(R.id.age_edit_text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        button.setOnClickListener(v -> {
            String name_var = name.getText().toString();
            String first_name_var = first_name.getText().toString();
            String fhater_name_var = fhater_name.getText().toString();
            String age_var = age.getText().toString();
            Intent intent = new Intent(MainActivity.this, StepTwoRegisterActivity.class);
            intent.putExtra("name",name_var);
            intent.putExtra("first_name",first_name_var);
            intent.putExtra("fhater_name",fhater_name_var);
            intent.putExtra("age", age_var);
            startActivity(intent);
        });
    }
}