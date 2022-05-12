package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView, textView2, textView4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        editText = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conv();
            }
        });

    }

    private void conv() {
        String valueEntered = editText.getText().toString();
        double kilo = Double.parseDouble(valueEntered);
        double pounds = kilo * 2.205;
        double roundOff = (double) Math.round(pounds * 100) / 100;
        textView4.setText(""+roundOff);
        Toast.makeText(this, "the converted pound values is"+roundOff, Toast.LENGTH_SHORT).show();
    }
}