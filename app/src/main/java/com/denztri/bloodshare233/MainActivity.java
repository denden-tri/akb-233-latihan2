package com.denztri.bloodshare233;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.denztri.bloodshare233.ui.register.RegisterActivity;
import com.google.android.material.button.MaterialButton;

// NIM                  : 10119233
// Nama                 : Denden Triana
// Kelas                : IF6
// Tanggal Pengerjaan   : 22-04-2022
// Deskripsi Pekerjaan  : 1. Pengerjaan button onClick tombol register (R.id.login_register_button),
//                           agar berpindah ke RegisterActivity saat di klik dari MainActivity.
//                        2. Pengerjaan menampilkan list/array string untuk menjadi pilihan di
//                           component Spinner di RegisterActivity
//                        3. Pengerjaan button onClick tombol back pada RegisterActivity agar dapat
//                           kembali ke MainActivity

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton register = findViewById(R.id.login_register_button);

        register.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), RegisterActivity.class)));
    }
}