package com.chocola.actividadelf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.chocola.actividadelf.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button btnOne = binding.button;
        Button btnTwo = binding.button2;
        Button btnThree = binding.button3;
        Button btnFour = binding.button4;
        Button btnFive = binding.button5;
        Button btnSix = binding.button6;

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), getString(R.string.toast1), Toast.LENGTH_SHORT).show();
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), getString(R.string.toast2), Toast.LENGTH_SHORT).show();
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), getString(R.string.toast3), Toast.LENGTH_SHORT).show();
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), getString(R.string.toast4), Toast.LENGTH_SHORT).show();
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), getString(R.string.toast5), Toast.LENGTH_SHORT).show();
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), getString(R.string.toast6), Toast.LENGTH_SHORT).show();
            }
        });
    }
}