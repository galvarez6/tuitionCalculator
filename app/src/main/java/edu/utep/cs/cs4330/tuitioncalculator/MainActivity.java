//Gilbert Alvarez
//cs 4330
package edu.utep.cs.cs4330.tuitioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed;
    TextView  tV, fV, toV, crr;
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
        crr = findViewById(R.id.creditDisplay);

        calc = new TuitionCalculator();
        rB.setOnClickListener(this::residentOption);
        g.setOnClickListener(this::gradOption);
        ug.setOnClickListener(this::underOption);

        ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String cr;
                int cc = 0;
                try {
                    cr = ed.getText().toString();
                    cc = Integer.parseInt(cr);

                }
                catch (NumberFormatException e){
                    cr = "0";
                }
                calc.setCredits(cc);
                Log.d("mes", "CREDS ARE: "+ calc.getCredits());
                crr.setText(String.format("%d",calc.getCredits()));
            }

            @Override
            public void afterTextChanged(Editable editable) {
                updatePriceDisplay();
            }
        });///end of on text changed listener




    }



    private void residentOption(View view){
        if(rB.isChecked()){
            calc.setResident(true);
        }
        else{
            calc.setResident(false);
        }
        updatePriceDisplay();
//        Toast.makeText(this, "Resident: "+calc.isResident(),
//                Toast.LENGTH_LONG).show();
    }


    public void gradOption(View view){
        if(g.isChecked()){
            calc.setGraduate(true);
            calc.setUndergraduate(false);
        }
        //Toast.makeText(this, "graduate: "+calc.isGraduate()+" "+calc.isUndergraduate(),
                //Toast.LENGTH_LONG).show();
        updatePriceDisplay();
    }


    public void underOption(View view){
        if(ug.isChecked()){
            calc.setUndergraduate(true);
            calc.setGraduate(false);
        }
        //Toast.makeText(this, "graduate: "+calc.isGraduate()+" "+calc.isUndergraduate(),
                //Toast.LENGTH_LONG).show();
        updatePriceDisplay();
    }


    public void updatePriceDisplay(){
        calc.calculateEverything();
        tV.setText(String.format("$%.2f", calc.getTuition()));
        fV.setText(String.format("$%.2f", calc.getFees()));
        toV.setText(String.format("$%.2f", calc.getTotal()));
    }



}