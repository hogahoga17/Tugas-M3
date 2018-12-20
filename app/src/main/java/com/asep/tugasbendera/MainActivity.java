package com.asep.tugasbendera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nuzul.tugasbendera.R;

public class MainActivity extends AppCompatActivity {

    Button btnJerman, btnPrancis, btnMix, btnLinear, btnRelative, btnConstraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJerman = findViewById(R.id.btnJerman);
        btnPrancis = findViewById(R.id.btnPrancis);
        btnMix = findViewById(R.id.btnMix);
        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);
        btnConstraint = findViewById(R.id.btnConstraint);

        btnJerman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bendera Jerman !", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), BenderaJerman.class);
                startActivity(i);
            }
        });
        btnPrancis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bendera Prancis !", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), BenderaPrancis.class);
                startActivity(i);
            }
        });
        btnMix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bendera Jerman & Prancis !", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), BenderaMix.class);
                startActivity(i);
            }
        });
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "LinearLayout !", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), LinearLayout.class);
                startActivity(i);
            }
        });
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "RelativeLayout !", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), RelativeLayout.class);
                startActivity(i);
            }
        });
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ConstraintLayout !", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), ConstraintLayout.class);
                startActivity(i);
            }
        });
    }
}
