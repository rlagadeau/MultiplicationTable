package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void table(View v){
        TextView result = findViewById(R.id.result);
        StringBuilder buffer = new StringBuilder();
        EditText number = findViewById(R.id.number);

        if(!number.getText().toString().matches("")) {
            int number_int = Integer.parseInt(number.getText().toString());

            int i;
            for (i = 1; i < 11; i++) {
                int values = i * number_int;
                buffer.append(number_int).append(" X ").append(i).append(" = ")
                        .append(values).append("\n\n");
            }

            result.setText(buffer);
        }else{
            @SuppressLint("ShowToast") Toast toast = Toast.makeText(this, "The field can't be empty", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}