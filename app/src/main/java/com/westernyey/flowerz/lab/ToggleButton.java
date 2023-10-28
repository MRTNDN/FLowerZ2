package com.westernyey.flowerz.lab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.westernyey.flowerz.R;

public class ToggleButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.togglebutton);
    }

    public void onToggleClicked(View view) {
        android.widget.ToggleButton toggleButton = (android.widget.ToggleButton) view;

        boolean isChecked = toggleButton.isChecked();

        if (isChecked) {
            Toast.makeText(this, "Свет включен", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Свет выключен", Toast.LENGTH_LONG).show();
        }
    }

    public void goBack(View view) {
        finish(); // Закрыть текущую активность и вернуться к предыдущей
    }
}
