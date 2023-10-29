package com.westernyey.flowerz.lab;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import com.westernyey.flowerz.R;
import com.westernyey.flowerz.activity_menu;

public class DatePickerZ extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datapicker);

        TextView dateTextView = findViewById(R.id.dateTextView);
        DatePicker datePicker = findViewById(R.id.datePicker);

        // Установка обработчика событий для DatePicker
        datePicker.init(2020, 2, 1, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                // Отсчет месяцев начинается с нуля, для отображения добавляем 1.
                dateTextView.setText("Дата: " + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
            }
        });

        // Обработчик нажатия для кнопки "Назад"
        findViewById(R.id.backButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создаем Intent для возврата к activity_menu (или к вашей предыдущей активности)
                Intent intent = new Intent(DatePickerZ.this, activity_menu.class);
                startActivity(intent);
            }
        });
    }
}
