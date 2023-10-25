package com.westernyey.flowerz.lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.westernyey.flowerz.R;

public class lab7_editText extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab7_edittext);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab7_editText.this, com.westernyey.flowerz.activity_menu.class);
                startActivity(intent);
                finish(); // Закрываем текущую активность и возвращаемся к предыдущей
            }
        });
    }
}
