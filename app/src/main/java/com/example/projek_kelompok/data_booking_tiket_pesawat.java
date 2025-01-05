package com.example.projek_kelompok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class data_booking_tiket_pesawat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_data_booking_tiket_pesawat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void beranda(View view) {
        Intent intent = new Intent(data_booking_tiket_pesawat.this, dasboard.class);
        startActivity(intent);
    }
    public void akun(View view) {
        Intent intent = new Intent(data_booking_tiket_pesawat.this, profile_account.class);
        startActivity(intent);
    }
    public void pemesanan(View view) {
        Intent intent = new Intent(data_booking_tiket_pesawat.this, data_pemesanan_tiket_kereta.class);
        startActivity(intent);
    }
    public void pembayaran_pesawat(View view) {
        Intent intent = new Intent(data_booking_tiket_pesawat.this, pembayaran_pesawat.class);
        startActivity(intent);
    }
}