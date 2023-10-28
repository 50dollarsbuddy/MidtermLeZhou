package com.example.midterm_lezhou;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button convert = findViewById(R.id.meters_millimeters);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText meterInput = findViewById(R.id.meterInput);
                TextView millimeterTextView = findViewById(R.id.millimeters);

                String meterInputText = meterInput.getText().toString();

                if (!meterInputText.isEmpty()) {
                    double meters = Double.parseDouble(meterInputText);
                    double millimeters = meters * 1000.0; // 1 meter = 1000 millimeters

                    millimeterTextView.setText("millimeters: " + millimeters);
                }
            }
        });
    }
}
