package com.westernyey.flowerz.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.westernyey.flowerz.R;

public class RadioButton extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);
    }
    public void goBack(View view) {
        finish(); // Закрыть текущую активность и вернуться к предыдущей
    }


    public void onRadioButtonClicked(View view) {
// если переключатель отмечен
        boolean checked = ((RadioButton) view).isChecked();
        TextView selection = findViewById(R.id.selection);
// Получаем нажатый переключатель
        switch (view.getId()) {
            case R.id.java:
                if (checked) {
                    selection.setText("Выбрана Java");
                }
                break;
            case R.id.kotlin:
                if (checked) {selection.setText("Выбран Kotlin");
                }
                break;
        }
    }
}
