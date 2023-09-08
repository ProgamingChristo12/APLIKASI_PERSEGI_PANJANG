// MainActivity.java
package com.example.bangun_persegi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText panjang, lebar;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        hitung = findViewById(R.id.hitung);
        hasil = findViewById(R.id.hasil);

        // menambahkan listener untuk tombol hitung
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p = Double.parseDouble(panjang.getText().toString());
                double l = Double.parseDouble(lebar.getText().toString());

                double luas = p * l;
                double keliling = 2 * (p + l);
                hasil.setText(String.format("Luas = %.2f cm\u00B2\nKeliling = %.2f cm", luas, keliling));
            }
        });
    }
}
