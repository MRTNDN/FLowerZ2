package com.westernyey.flowerz.lab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView; // Добавлен импорт TextView
import android.content.Intent;

import com.westernyey.flowerz.R;
import com.westernyey.flowerz.activity_menu;

public class lab1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lab1);

        // Получаем элемент TextView
        TextView textView = findViewById(R.id.header);

        // Устанавливаем текст
        textView.setText("Hello from Java!");

        // Получаем элемент кнопки "Назад"
        Button backButton = findViewById(R.id.backButton);

        // Устанавливаем обработчик события для кнопки "Назад"
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Создаем Intent для возвращения к предыдущему активити
                Intent intent = new Intent(lab1.this, activity_menu.class);
                startActivity(intent);
            }
        });
    }
}
