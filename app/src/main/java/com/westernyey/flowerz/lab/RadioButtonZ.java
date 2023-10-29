package com.westernyey.flowerz.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.westernyey.flowerz.R;

public class RadioButtonZ extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);
    }
    public void goBack(View view) {
        finish(); // Закрыть текущую активность и вернуться к предыдущей
    }


    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        // Если переключатель отмечен
        boolean checked = ((RadioButton) view).isChecked();
        TextView selection = findViewById(R.id.selection);
        // Получаем нажатый переключатель
        int id = view.getId();

        if (id == R.id.java) {
            if (checked) {
                selection.setText("Выбрана Java");
            }
        } else if (id == R.id.kotlin) {
            if (checked) {
                selection.setText("Выбран Kotlin");
            }
        }
    }}