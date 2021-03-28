package com.example.bel_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionLinLayout(View view) {
        Toast.makeText(this, "Ini adalah Linear Layout", Toast.LENGTH_SHORT).show();
    }


    public void actionRelativeLayout(View view) {
        Toast.makeText(this, "Ini adalah Relative Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionConstraintLayout(View view) {
        Toast.makeText(this, "Ini adalah Constraint Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionLinearLayout(View view) {
        Toast.makeText(this, "Ini adalah Linear Layout 2", Toast.LENGTH_SHORT).show();
    }

    public void actionTabelLayout(View view) {
        Toast.makeText(this, "Ini adalah Tabel Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionMatrialDesign(View view) {
        Toast.makeText(this, "Ini adalah Matrial Design", Toast.LENGTH_SHORT).show();
    }

    public void actionScrollView(View view) {
        Toast.makeText(this, "Ini adalah Scroll View", Toast.LENGTH_SHORT).show();
    }

    public void actionScrollViewHor(View view) {
        Toast.makeText(this, "Ini adalah Scroll View Horizontal", Toast.LENGTH_SHORT).show();
    }
}