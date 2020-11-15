package com.example.authentificationproject;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editTextNom;
    EditText editTextPassword;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.Message);
        editTextNom=findViewById(R.id.Login);
        editTextPassword=findViewById(R.id.Password);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View view){
        Toast.makeText(this,"Connection OK", Toast.LENGTH_SHORT).show();
    }
}