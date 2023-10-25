package com.westernyey.flowerz.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;
import com.westernyey.flowerz.R;

public class ToastSnackbar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toastsnackbar);
    }

    public void onClick(View view) {
        Snackbar snackbar = Snackbar.make(view, "Hello Android", Snackbar.LENGTH_LONG);
        snackbar.setAction("Next...", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Next clicked!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        snackbar.show();
    }

    public void goBack(View view) {
        Intent intent = new Intent(ToastSnackbar.this, com.westernyey.flowerz.activity_menu.class);
        startActivity(intent);
        finish(); // Закрыть текущую активность
    }
}