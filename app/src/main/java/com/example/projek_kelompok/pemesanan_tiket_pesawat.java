package com.example.projek_kelompok;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pemesanan_tiket_pesawat extends AppCompatActivity {

    private int jumlah = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pemesanan_tiket_pesawat);

            // Deklarasi komponen
            TextView textViewJumlah = findViewById(R.id.tvQuantity);
            ImageView buttonTambah = findViewById(R.id.btnPlus);
            ImageView buttonKurang = findViewById(R.id.btnMinus);

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



    public void BookingP(View view) {
        Intent intent = new Intent(pemesanan_tiket_pesawat.this, data_booking_tiket_pesawat.class);
        startActivity(intent);
    }
}