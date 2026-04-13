package com.example.habitationandroid;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputSurface, inputPieces;
    private CheckBox checkboxPiscine;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputSurface    = findViewById(R.id.input_surface);
        inputPieces     = findViewById(R.id.input_pieces);
        checkboxPiscine = findViewById(R.id.checkbox_piscine);
        result          = findViewById(R.id.result);

        findViewById(R.id.button_calcul).setOnClickListener(v -> calculer());
    }

    private void calculer() {
        String s = inputSurface.getText().toString().trim();
        String p = inputPieces.getText().toString().trim();

        if (s.isEmpty() || p.isEmpty()) {
            Toast.makeText(this, "Remplir tous les champs", Toast.LENGTH_SHORT).show();
            return;
        }

        double surface = Double.parseDouble(s);
        int    pieces  = Integer.parseInt(p);
        double total   = (surface * 2) + (pieces * 50) + (checkboxPiscine.isChecked() ? 100 : 0);

        // ✅ Locale.FRANCE pour afficher 1 234,56 DH
        result.setText(String.format(Locale.FRANCE, "%.2f DH", total));
    }
}