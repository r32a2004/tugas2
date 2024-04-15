package com.example.tugas2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class auth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_auth);
    }
        public void login(View view) {
            Intent intent = new Intent(auth.this,login.class);
            startActivity(intent );

        }
        public void register (View view) {
            Intent intent = new Intent(auth.this,register.class);
            startActivity(intent );

        }
    }
