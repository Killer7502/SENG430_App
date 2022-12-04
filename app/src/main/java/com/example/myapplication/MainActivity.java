package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends Activity{
    private TextView statusLabel;
    private ActivityMainBinding binding;
    private int currentStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        statusLabel = binding.textView1;
    }

    public void onButtonClick(View view) {
        if (currentStatus == 1) {
            statusLabel.setText(getString(R.string.label_notsuccess));
            currentStatus = 0;
        }
        else {
            statusLabel.setText(getString(R.string.label_success));
            currentStatus = 1;
        }
    }

    public void onButtonReset(View view) {
        statusLabel.setText(getString(R.string.label_text));
    }
}
