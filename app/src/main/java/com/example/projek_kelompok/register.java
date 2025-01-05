package com.example.projek_kelompok;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private EditText username;
    private EditText password;
    private EditText noHp;
    private Button registerButton;

    private static final String PREFS_NAMA = "MyPrefs";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_NOHP = "no_hp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inisialisasi komponen UI
        name = findViewById(R.id.TNama);
        email = findViewById(R.id.TEmail);
        username = findViewById(R.id.TUser);
        password = findViewById(R.id.TPass);
        noHp = findViewById(R.id.TNoHp); // Tambahan input nomor HP
        registerButton = findViewById(R.id.Breg);

        // Set klik listener untuk tombol register
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
    }

    private void register() {
        // Mengambil nilai dari inputan
        String name = this.name.getText().toString().trim();
        String email = this.email.getText().toString().trim();
        String username = this.username.getText().toString().trim();
        String password = this.password.getText().toString().trim();
        String noHp = this.noHp.getText().toString().trim();

        // Validasi input
        if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty() || noHp.isEmpty()) {
            Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        // Validasi nomor HP (contoh sederhana)
        if (noHp.length() < 10 || noHp.length() > 13 || !noHp.matches("[0-9]+")) {
            Toast.makeText(this, "Nomor HP tidak valid", Toast.LENGTH_SHORT).show();
            return;
        }

        // Menyimpan data
        saveCredentials(username, password, noHp);
        Toast.makeText(this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();

        // Berpindah ke halaman login
        Intent intent = new Intent(register.this, Login.class);
        startActivity(intent);
        finish();
    }

    private void saveCredentials(String username, String password, String noHp) {
        SharedPreferences sharedPreferences = getSharedPreferences(PREFS_NAMA, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_USERNAME, username);
        editor.putString(KEY_PASSWORD, password);
        editor.putString(KEY_NOHP, noHp); // Menyimpan nomor HP
        editor.apply();
    }

    public void backToHome(View view) {
        Intent intent = new Intent(register.this, MainActivity.class);
        startActivity(intent);
    }
}