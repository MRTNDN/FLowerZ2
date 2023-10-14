package com.westernyey.flowerz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private TextView resultTextView;
    private Button createCharacterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        resultTextView = findViewById(R.id.resultTextView);
        createCharacterButton = findViewById(R.id.createCharacterButton);

        createCharacterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String characterName = nameEditText.getText().toString();
                if (!characterName.isEmpty()) {
                    // Создаем персонаж с выбранным именем
                    Character character = new Character(characterName);

                    // Отображаем инф ормацию о созданном персонаже
                    resultTextView.setText("Персонаж создан:\nИмя: " + characterName);
                } else {
                    resultTextView.setText("Введите имя персонажа");
                }
            }
        });
    }
}
