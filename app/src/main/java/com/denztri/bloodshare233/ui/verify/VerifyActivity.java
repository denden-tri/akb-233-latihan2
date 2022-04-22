package com.denztri.bloodshare233.ui.verify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.denztri.bloodshare233.R;
import com.denztri.bloodshare233.ui.home.HomeActivity;
import com.google.android.material.button.MaterialButton;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        MaterialButton sendButton = findViewById(R.id.verify_send_button);
        sendButton.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), HomeActivity.class)));
    }
}