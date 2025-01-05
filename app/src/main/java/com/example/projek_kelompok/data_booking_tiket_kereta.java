package com.example.projek_kelompok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class data_booking_tiket_kereta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_data_booking_tiket_kereta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void pembayaran_kereta(View view) {
        Intent intent = new Intent(data_booking_tiket_kereta.this, pembayaran_kereta.class);
        startActivity(intent);
    }
    public void beranda(View view) {
        Intent intent = new Intent(data_booking_tiket_kereta.this, dasboard.class);
        startActivity(intent);
    }
    public void akun(View view) {
        Intent intent = new Intent(data_booking_tiket_kereta.this, profile_account.class);
        startActivity(intent);
    }
    public void pemesanan(View view) {
        Intent intent = new Intent(data_booking_tiket_kereta.this, data_pemesanan_tiket_kereta.class);
        startActivity(intent);
    }
}