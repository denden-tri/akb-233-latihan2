package com.denztri.bloodshare233.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.denztri.bloodshare233.MainActivity;
import com.denztri.bloodshare233.R;
import com.denztri.bloodshare233.ui.almost.AlmostThereActivity;
import com.google.android.material.button.MaterialButton;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner bloodSpin = findViewById(R.id.spinner_blood);

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this,R.array.blood_type_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        bloodSpin.setAdapter(arrayAdapter);

        Spinner reshusSpinner = findViewById(R.id.spinner_reshus);
        ArrayAdapter<CharSequence> reshusAdapter = ArrayAdapter.createFromResource(this, R.array.reshus, android.R.layout.simple_spinner_item);
        reshusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        reshusSpinner.setAdapter(reshusAdapter);

        Spinner jobSpinner = findViewById(R.id.register_spinner_job);
        ArrayAdapter<CharSequence> jobAdapter = ArrayAdapter.createFromResource(this, R.array.job_array, android.R.layout.simple_spinner_item);
        jobAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        jobSpinner.setAdapter(reshusAdapter);

        MaterialButton backButton = findViewById(R.id.register_back_button);
        backButton.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));

        MaterialButton registerButton = findViewById(R.id.register_reg_button);
        registerButton.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), AlmostThereActivity.class)));
    }
}