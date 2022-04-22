package com.denztri.bloodshare233.ui.almost;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.denztri.bloodshare233.R;
import com.denztri.bloodshare233.ui.verify.VerifyActivity;
import com.google.android.material.button.MaterialButton;

public class AlmostThereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);

        MaterialButton verifyButton = findViewById(R.id.almost_verify_button);
        verifyButton.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), VerifyActivity.class)));
    }
}