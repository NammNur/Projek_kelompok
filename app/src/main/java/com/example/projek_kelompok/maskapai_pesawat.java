package com.example.projek_kelompok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class maskapai_pesawat extends AppCompatActivity {

    String[] maskapai = {
            "Garuda Indonesia",
            "Indonesia Air Asia",
            "Lion Air",
            "Nam Air"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_maskapai_pesawat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void pemesanan_pesawat(View view) {
        Intent intent = new Intent(maskapai_pesawat.this, pemesanan_tiket_pesawat.class);
        startActivity(intent);
    }
}