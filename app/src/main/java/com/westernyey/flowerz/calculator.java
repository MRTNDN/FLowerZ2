package com.westernyey.flowerz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class calculator extends AppCompatActivity {

    TextView resultField; // текстовое поле для вывода результата
    EditText numberField; // поле для ввода числа
    TextView operationField; // текстовое поле для вывода знака
    Double operand = null; // операнд операции
    String lastOperation = "="; // последняя операция

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        // Получаем все поля по ID из activity_calculator.xml
        resultField = findViewById(R.id.resultField);
        numberField = findViewById(R.id.numberField);
        operationField = findViewById(R.id.operationField);

        // Объявляем и находим кнопку "Назад"
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создать Intent для возвращения к MainActivity
                Intent intent = new Intent(calculator.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onNumberClick(View view) {
        Button button = (Button) view;
        numberField.append(button.getText());
        if (lastOperation.equals("=") && operand != null) {
            operand = null;
        }
    }

    public void onOperationClick(View view) {
        Button button = (Button) view;
        String op = button.getText().toString();
        String number = numberField.getText().toString();
        if (number.length() > 0) {
            number = number.replace(',', '.');
            try {
                performOperation(Double.valueOf(number), op);
            } catch (NumberFormatException ex) {
                numberField.setText("");
            }
        }
        lastOperation = op;
        operationField.setText(lastOperation);
    }

    private void performOperation(Double number, String operation) {
        if (operand == null) {
            operand = number;
        } else {
            if (lastOperation.equals("=")) {
                lastOperation = operation;
            }
            switch (lastOperation) {
                case "=":
                    operand = number;
                    break;
                case "/":
                    if (number == 0) {
                        operand = 0.0;
                    } else {
                        operand /= number;
                    }
                    break;
                case "*":
                    operand *= number;
                    break;
                case "+":
                    operand += number;
                    break;
                case "-":
                    operand -= number;
                    break;
            }
        }
        resultField.setText(operand.toString().replace('.', ','));
        numberField.setText("");
    }

    public void onClearClick(View view) {
        numberField.setText("");
        resultField.setText("0");
        operationField.setText("");
        operand = null;
        lastOperation = "=";
    }

    // Обработчик события клика на кнопку "Равно" (=)
    public void onEqualsClick(View view) {
        String number = numberField.getText().toString();
        if (number.length() > 0) {
            number = number.replace(',', '.');
            try {
                performOperation(Double.valueOf(number), lastOperation);
            } catch (NumberFormatException ex) {
                numberField.setText("");
            }
        }
        lastOperation = "=";
        operationField.setText(lastOperation);
    }
}
