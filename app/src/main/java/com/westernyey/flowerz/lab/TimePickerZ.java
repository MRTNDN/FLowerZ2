package com.westernyey.flowerz.lab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import com.westernyey.flowerz.R;

public class TimePickerZ extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timepicker);

        TextView timeTextView = findViewById(R.id.timeTextView);
        TimePicker timePicker = findViewById(R.id.timePicker);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                timeTextView.setText("Время: " + hourOfDay + ":" + minute);
            }
        });
    }

    public void goBack(View view) {
        finish(); // Закрыть текущую активность и вернуться к предыдущей
    }
}
