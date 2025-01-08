package com.example.projek_kelompok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pemesanan_tiket_kereta extends AppCompatActivity {

    private int jumlah = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan_tiket_kereta);

        // Deklarasi komponen
        TextView textViewJumlah = findViewById(R.id.tvQuantityK);
        ImageView buttonTambah = findViewById(R.id.btnPlusK);
        ImageView buttonKurang = findViewById(R.id.btnMinusK);

        // Tombol Tambah
        buttonTambah.setOnClickListener(view -> {
            jumlah++;
            textViewJumlah.setText(String.valueOf(jumlah));
        });

        // Tombol Kurang
        buttonKurang.setOnClickListener(view -> {
            if (jumlah > 1) {
                jumlah--;
                textViewJumlah.setText(String.valueOf(jumlah));
            } else {
                Toast.makeText(this, "Jumlah tidak boleh kurang dari 1", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void booking_kereta(View view) {
        Intent intent = new Intent(pemesanan_tiket_kereta.this, data_booking_tiket_kereta.class);
        startActivity(intent);
    }
}