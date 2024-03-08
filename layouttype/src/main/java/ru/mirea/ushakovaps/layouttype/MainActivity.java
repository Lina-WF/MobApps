package ru.mirea.ushakovaps.layouttype;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.findTextView);
        TextView myTextView = (TextView) findViewById(R.id.findTextView);
        myTextView.setText("Абсолютно новенький текст");
        Button button = findViewById(R.id.findButton);
        button.setText("Кнопка :)");
        CheckBox checkBox = findViewById(R.id.findCheckBox);
        checkBox.setChecked(true);
    }
}