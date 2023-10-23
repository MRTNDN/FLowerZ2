package com.westernyey.flowerz.lab;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class lab3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER);

        // Создаем и настраиваем текстовое поле
        TextView textView = new TextView(this);
        textView.setText("Hello");
        textView.setTextSize(30);

        // Создаем и настраиваем кнопку "Назад"
        Button backButton = new Button(this);
        backButton.setText("Назад");

        // Устанавливаем обработчик события для кнопки "Назад"
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Закрываем текущую активность и возвращаемся к предыдущей
            }
        });

        // Добавляем элементы в LinearLayout
        linearLayout.addView(textView);
        linearLayout.addView(backButton);

        setContentView(linearLayout);
    }
}
