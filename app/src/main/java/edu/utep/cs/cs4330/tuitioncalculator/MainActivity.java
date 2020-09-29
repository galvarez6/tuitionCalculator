package edu.utep.cs.cs4330.tuitioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed;
    TextView  tV, fV, toV;
    RadioButton g, ug;
    CheckBox rB;
    TuitionCalculator calc,calc2;

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

        calc = new TuitionCalculator(false, true, true, 12);
        calc2 = new TuitionCalculator(false,true,false,12);
        Log.d("fees", "RES: "+calc.getTotal());
        Log.d("fees", "NON RES: "+calc2.getTotal());

    }
}