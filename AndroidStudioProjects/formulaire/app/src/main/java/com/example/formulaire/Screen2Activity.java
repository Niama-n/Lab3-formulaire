package com.example.formulaire;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {

    private TextView recap;
    private Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        recap     = findViewById(R.id.recap);
        btnRetour = findViewById(R.id.btnRetour);

        afficherDonnees();

        btnRetour.setOnClickListener(v -> finish());
    }

    private void afficherDonnees() {
        Intent intent = getIntent();

        String nom     = verifier(intent.getStringExtra("KEY_NOM"));
        String email   = verifier(intent.getStringExtra("KEY_EMAIL"));
        String tel     = verifier(intent.getStringExtra("KEY_TEL"));
        String adresse = verifier(intent.getStringExtra("KEY_ADRESSE"));
        String ville   = verifier(intent.getStringExtra("KEY_VILLE"));

        String contenu = "Nom            : " + nom +
                "\nEmail        : " + email +
                "\nTéléphone    : " + tel +
                "\nAdresse      : " + adresse +
                "\nVille        : " + ville;

        recap.setText(contenu);
    }

    private String verifier(String valeur) {
        return (valeur == null || valeur.isEmpty()) ? "Non renseigné" : valeur;
    }
}