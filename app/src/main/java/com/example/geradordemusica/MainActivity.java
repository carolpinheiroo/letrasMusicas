package com.example.geradordemusica;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

        public void sortear(View view) {
            int resultado = new Random().nextInt( 5);
            TextView textResultado = findViewById(R.id.textResultado);

            if (resultado == 1) {
                textResultado.setText("I always let the good ones go");
            } else if (resultado == 2 ){
                textResultado.setText("Pop culture was in art, now art's in pop culture, in me");
            } else if (resultado == 3 ){
                textResultado.setText("Don't you know that you're toxic?");
            } else if (resultado == 4 ){
                textResultado.setText("And he can be my jailer, Burton to this Taylor");
            } else if (resultado == 5){
                textResultado.setText("Ooh baby, you are (U-N-I-Q-U-E)");
            }

        }
    }
