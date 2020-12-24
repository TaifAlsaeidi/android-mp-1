package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Q = findViewById(R.id.Quizes);
        EditText H = findViewById(R.id.HW);
        EditText M = findViewById(R.id.Mid);
        EditText F = findViewById(R.id.Final);
        Button C = findViewById(R.id.cal);
        Button RESET = findViewById(R.id.reset);
        TextView RESULT = findViewById(R.id.Result);
        RESET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Q.setText("");
                H.setText("");
                M.setText("");
                F.setText("");

            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String QU = Q.getText().toString(); // QUIZES
                String HO = H.getText().toString(); // HOMEWOEK
                String MD = M.getText().toString(); // MIDTERMS
                String FN = F.getText().toString();//FINAL
                Double Res = Double.parseDouble(QU) + Double.parseDouble(HO) + Double.parseDouble(MD) + Double.parseDouble(FN); //pARSING

                if (Res <= 100 && Res >= 90) {
                    RESULT.setText("A");
                    RESULT.setTextColor(Color.BLUE);
                } else if (Res <= 89 && Res >= 80) {
                    RESULT.setText("B");
                    RESULT.setTextColor(Color.GREEN);
                } else if (Res <= 79 && Res >= 70) {
                    RESULT.setText("C");
                    RESULT.setTextColor(Color.GRAY);
                } else if (Res <= 69 && Res >= 60) {
                    RESULT.setText("D");
                    RESULT.setTextColor(Color.BLACK);
                } else if (Res <= 69 && Res >= 0) {
                    RESULT.setText("F");
                    RESULT.setTextColor(Color.RED);
                } else {
                    RESULT.setText("ERROR");
                    RESULT.setTextColor(Color.MAGENTA);// if it is negative
                }

                Toast.makeText(MainActivity.this, RESULT + "", Toast.LENGTH_LONG).show();


            }

        });
    }
}



