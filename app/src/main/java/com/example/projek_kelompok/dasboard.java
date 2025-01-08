package com.example.projek_kelompok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class dasboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dasboard);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void logut(View view) {
        Intent intent = new Intent(dasboard.this, Login.class);
        startActivity(intent);
    }
    public void maskapaiP(View view) {
        Intent intent = new Intent(dasboard.this, maskapai_pesawat.class);
        startActivity(intent);
    }
    public void maskapaiK(View view) {
        Intent intent = new Intent(dasboard.this, maskapai_kereta.class);
        startActivity(intent);
    }
    public void histori(View view) {
        Intent intent = new Intent(dasboard.this, history.class);
        startActivity(intent);
    }
    public void jadwal(View view) {
        Intent intent = new Intent(dasboard.this, jadwal.class);
        startActivity(intent);
    }
    public void beranda(View view) {
        Intent intent = new Intent(dasboard.this, dasboard.class);
        startActivity(intent);
    }
    public void akun(View view) {
        Intent intent = new Intent(dasboard.this, profile_account.class);
        startActivity(intent);
    }
    public void pemesanan(View view) {
        Intent intent = new Intent(dasboard.this, data_pemesanan_tiket_kereta.class);
        startActivity(intent);
    }
    public void aboutus(View view) {
        Intent intent = new Intent(dasboard.this, AboutUs.class);
        startActivity(intent);
    }
}