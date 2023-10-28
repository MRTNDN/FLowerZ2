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
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
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
                Intent intent = new Intent(activity_menu.this, com.westernyey.flowerz.lab.lab6ScrollView.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 7
                Intent intent = new Intent(activity_menu.this, com.westernyey.flowerz.lab.lab7_editText.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 8
                Intent intent = new Intent(activity_menu.this, com.westernyey.flowerz.lab.ToastSnackbar.class);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 9
                Intent intent = new Intent(activity_menu.this, com.westernyey.flowerz.lab.Checkbox.class);
                startActivity(intent);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Действие при нажатии на Кнопку 9
                Intent intent = new Intent(activity_menu.this, com.westernyey.flowerz.lab.ToggleButton.class);
                startActivity(intent);
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