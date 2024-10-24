package com.example.zadanie2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextEmail;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //powiązanie widoków z kodem
        //dupadupadupa2018
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pobranie wprowadzonych danych
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                // Walidacja danych
                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić imię", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić adres e-mail", Toast.LENGTH_SHORT).show();
                } else if
                (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(MainActivity.this, "Niepoprawny adres e-mail", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Formularz przesłany poprawnie", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}