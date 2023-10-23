package com.westernyey.flowerz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Найти кнопки по их ID
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button backButton  = findViewById(R.id.backButton);
        // Настроить обработчики нажатий для кнопок
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 1
                // Создаем Intent для открытия lab1.java
                Intent intent = new Intent(activity_menu.this, com.westernyey.flowerz.lab.lab1.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 2
                Intent intent = new Intent(activity_menu.this, com.westernyey.flowerz.lab.lab2.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 3
                Intent intent = new Intent(activity_menu.this, com.westernyey.flowerz.lab.lab3.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 4
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 5
                Intent intent = new Intent(activity_menu.this, com.westernyey.flowerz.lab.lab5.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 6
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 7
            }
        });
        // Установить обработчик нажатия для кнопки "Назад"
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создать Intent для возвращения к MainActivity
                Intent intent = new Intent(activity_menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}