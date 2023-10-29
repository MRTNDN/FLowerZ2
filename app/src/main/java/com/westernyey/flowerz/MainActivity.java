package com.westernyey.flowerz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private TextView resultTextView;
    private Button createCharacterButton;
    private Button secondActivityButton;
    private Button THActivityButton;
    private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        resultTextView = findViewById(R.id.resultTextField);
        createCharacterButton = findViewById(R.id.createCharacterButton);
        secondActivityButton = findViewById(R.id.secondActivityButton);
        THActivityButton = findViewById(R.id.THActivityButton);
        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.seekBarValue);

        createCharacterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String characterName = nameEditText.getText().toString();
                if (!characterName.isEmpty()) {
                    Character character = new Character(characterName);
                    resultTextView.setText("Создан:\nИмя: " + characterName);
                } else {
                    resultTextView.setText("Введите имя");
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        secondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_menu.class);
                startActivity(intent);
            }
        });

        THActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, calculator.class);
                startActivity(intent);
            }
        });
    }
}
