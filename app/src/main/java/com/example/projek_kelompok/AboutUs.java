package com.example.projek_kelompok;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about_us);

        // Tombol WhatsApp
        Button waButton = findViewById(R.id.wa);
        waButton.setOnClickListener(v -> {
            String phoneNumber = "6283804336293"; // Ganti dengan nomor WhatsApp
            String url = "https://wa.me/" + phoneNumber;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        Button waLButton = findViewById(R.id.waL);
        waLButton.setOnClickListener(v -> {
            String phoneNumberl = "62895374901672"; // Ganti dengan nomor WhatsApp
            String url = "https://wa.me/" + phoneNumberl;
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

        // Tombol Instagram
        Button igButton = findViewById(R.id.ig);
        igButton.setOnClickListener(v -> {
            String igUrl = "https://www.instagram.com/hilmann_9/"; // Ganti dengan username Instagram
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(igUrl));
            startActivity(intent);
        });

        Button igLButton = findViewById(R.id.igL);
        igLButton.setOnClickListener(v -> {
            String igUrl = "https://www.instagram.com/Qualia Bizarr/"; // Ganti dengan username Instagram
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(igUrl));
            startActivity(intent);
        });

        // Tombol Telepon
        Button tlpButton = findViewById(R.id.tlp);
        tlpButton.setOnClickListener(v -> {
            String phoneNumber = "tel:6283804336293"; // Ganti dengan nomor telepon
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phoneNumber));
            startActivity(intent);
        });

        Button tlpLButton = findViewById(R.id.tlpL);
        tlpLButton.setOnClickListener(v -> {
            String phoneNumber = "tel:62895374901672"; // Ganti dengan nomor telepon
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phoneNumber));
            startActivity(intent);
        });
    }
}
