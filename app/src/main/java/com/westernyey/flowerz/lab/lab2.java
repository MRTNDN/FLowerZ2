package com.westernyey.flowerz.lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.westernyey.flowerz.activity_menu;

public class lab2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        TextView textView = new TextView(this);
        textView.setText("Hello from lab2!");
        textView.setTextSize(26);

        ConstraintLayout.LayoutParams textLayoutParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        );

        textLayoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        textLayoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

        textView.setLayoutParams(textLayoutParams);

        Button backButton = new Button(this);
        backButton.setText("Назад");

        ConstraintLayout.LayoutParams buttonLayoutParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        );

        // Устанавливаем ограничения для размещения кнопки по центру экрана (горизонтально и вертикально)
        buttonLayoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        buttonLayoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        buttonLayoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        buttonLayoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;

        backButton.setLayoutParams(buttonLayoutParams);

        // Добавляем элементы в ConstraintLayout
        constraintLayout.addView(textView);
        constraintLayout.addView(backButton);

        setContentView(constraintLayout);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.westernyey.flowerz.lab.lab2.this, activity_menu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                        Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }
}
