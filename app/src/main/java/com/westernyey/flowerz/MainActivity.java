package com.westernyey.flowerz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private TextView resultTextView;
    private Button createCharacterButton;
    private Button secondActivityButton; // Перенесли объявление сюда
    private Button THActivityButton; // Исправили название кнопки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        resultTextView = findViewById(R.id.resultTextView);
        createCharacterButton = findViewById(R.id.createCharacterButton);
        secondActivityButton = findViewById(R.id.secondActivityButton); // Инициализировали здесь
        THActivityButton = findViewById(R.id.THActivityButton); // Инициализировали кнопку правильно

        createCharacterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String characterName = nameEditText.getText().toString();
                if (!characterName.isEmpty()) {
                    // Создаем персонаж с выбранным именем
                    Character character = new Character(characterName);

                    // Отображаем информацию о созданном персонаже
                    resultTextView.setText("Персонаж создан:\nИмя: " + characterName);
                } else {
                    resultTextView.setText("Введите имя персонажа");
                }
            }
        });

        secondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_menu.class);
                startActivity(intent);
            }
        });

        THActivityButton.setOnClickListener(new View.OnClickListener() { // Исправили имя кнопки
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, calculator.class);
                startActivity(intent);
            }
        });
    }
}
