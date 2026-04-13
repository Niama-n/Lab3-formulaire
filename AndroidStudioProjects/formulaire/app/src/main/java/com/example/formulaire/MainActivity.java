package com.example.formulaire;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputNom, inputEmail, inputTel, inputAdresse, inputVille;
    private Button btnSoumettre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNom     = findViewById(R.id.inputNom);
        inputEmail   = findViewById(R.id.inputEmail);
        inputTel     = findViewById(R.id.inputTel);
        inputAdresse = findViewById(R.id.inputAdresse);
        inputVille   = findViewById(R.id.inputVille);
        btnSoumettre = findViewById(R.id.btnSoumettre);

        btnSoumettre.setOnClickListener(v -> soumettre());
    }

    private void soumettre() {
        String nom     = inputNom.getText().toString().trim();
        String email   = inputEmail.getText().toString().trim();
        String tel     = inputTel.getText().toString().trim();
        String adresse = inputAdresse.getText().toString().trim();
        String ville   = inputVille.getText().toString().trim();

        if (nom.isEmpty()) {
            inputNom.setError("Champ obligatoire");
            return;
        }
        if (email.isEmpty()) {
            inputEmail.setError("Champ obligatoire");
            return;
        }
        if (tel.isEmpty()) {
            inputTel.setError("Champ obligatoire");
            return;
        }

        Intent intent = new Intent(this, Screen2Activity.class);
        intent.putExtra("KEY_NOM", nom);
        intent.putExtra("KEY_EMAIL", email);
        intent.putExtra("KEY_TEL", tel);
        intent.putExtra("KEY_ADRESSE", adresse);
        intent.putExtra("KEY_VILLE", ville);
        startActivity(intent);
    }
}