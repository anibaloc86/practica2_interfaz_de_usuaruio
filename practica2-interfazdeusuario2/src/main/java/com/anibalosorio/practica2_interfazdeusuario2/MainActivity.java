package com.anibalosorio.practica2_interfazdeusuario2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2, editText3;
    Button Buttoncal;
    RadioButton radioButtonsuma, radioButtonresta, radioButtonmulti, radioButtondivi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        radioButtonsuma = (RadioButton) findViewById(R.id.radioButtonsuma);
        radioButtonresta = (RadioButton) findViewById(R.id.radioButtonresta);
        radioButtonmulti = (RadioButton) findViewById(R.id.radioButtonmulti);
        radioButtondivi = (RadioButton) findViewById(R.id.radioButtondivi);
        Buttoncal = (Button) findViewById(R.id.Buttoncal);

        Buttoncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1, num2, sum, res, multi, divi;

                num1 = Double.parseDouble(editText1.getText().toString());
                num2 = Double.parseDouble(editText2.getText().toString());

                sum = num1 + num2;
                res = num1 - num2;
                multi = num1 * num2;
                divi = num1 / num2;

                editText3.setText(String.valueOf(sum));

            }
        }) ;

    }


}
