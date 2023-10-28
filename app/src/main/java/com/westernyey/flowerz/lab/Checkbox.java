package com.westernyey.flowerz.lab;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.westernyey.flowerz.R;

public class Checkbox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

        // Найдем кнопку "Назад" и добавим к ней обработчик нажатия
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Закрываем текущую активность и возвращаемся к предыдущей
            }
        });
    }

    public void onCheckboxClicked(View view) {
        // Получаем флажок
        CheckBox checkBox = (CheckBox) view;
        TextView selection = findViewById(R.id.selection);

        // Получаем, отмечен ли данный флажок
        if (checkBox.isChecked()) {
            selection.setText("Включено");
            checkBox.setText("Выключить");
        } else {
            selection.setText("Выключено");
            checkBox.setText("Включить");
        }
    }
}
