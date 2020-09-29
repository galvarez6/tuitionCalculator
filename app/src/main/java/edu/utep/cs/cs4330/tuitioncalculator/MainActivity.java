package edu.utep.cs.cs4330.tuitioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed;
    TextView  tV, fV, toV;
    RadioButton g, ug;
    CheckBox rB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.creditEnter);
        tV = findViewById(R.id.tuitionPrice);
        fV = findViewById(R.id.feePrice);
        toV = findViewById(R.id.totalPrice);
        g = findViewById(R.id.gradButton);
        ug = findViewById(R.id.undergradButton);
        rB = findViewById(R.id.residentBoolean);

    }
}