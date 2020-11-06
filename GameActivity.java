package com.marc.partensky.topquiz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.marc.partensky.topquiz.R;

public class GameActivity extends AppCompatActivity {

    protected TextView mQuestion;
    protected Button mRohart;
    protected Button mJMSJ;
    protected Button mGaudillere;
    protected Button mCarraud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestion = findViewById(R.id.activity_game_question_text);

        mRohart = findViewById(R.id.activity_game_rohart_btn);
        mRohart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestion.setText("Really nigga");
            }
        });

        mJMSJ = findViewById(R.id.activity_game_jmsj_btn);
        mJMSJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestion.setText("Saint Jalm Forever");
            }
        });


        mGaudillere = findViewById(R.id.activity_game_gaudillere_btn);
        mGaudillere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestion.setText("Vive les diagrammes de Bode");
            }
        });


        mCarraud = findViewById(R.id.activity_game_carraud_btn);
        mCarraud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestion.setText("Réponse refusée");
                mCarraud.setEnabled(false);
            }
        });

    }
    }


