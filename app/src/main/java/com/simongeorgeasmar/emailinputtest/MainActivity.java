package com.simongeorgeasmar.emailinputtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtEmail;
    Button btnTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = findViewById(R.id.edtEmail);
        btnTest = findViewById(R.id.btnTest);
    }

    public void btnTestOnClick(View view) {
        validateEmailAddress (edtEmail);
    }

    private boolean validateEmailAddress (EditText edtEmail){
        String emailInput = edtEmail.getText().toString();

        if(!emailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}