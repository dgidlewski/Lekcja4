package com.example.darek.lekcja4;

/**
 * Created by Darek on 2017-03-31.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    int i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        RadioGroup rG1 = (RadioGroup)findViewById(R.id.radioGroup1);
        RadioButton rB1= (RadioButton)findViewById(R.id.radioButton1);
        rB1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                i=1;
              /*  Toast.makeText(getApplicationContext(),"Liczba punktów: " + ++i , Toast.LENGTH_LONG).
                        show(); */
            }
        });

        final RadioGroup rG2 = (RadioGroup)findViewById(R.id.radioGroup2);
        final RadioButton rb8= (RadioButton)findViewById(R.id.radioButton8);
        rb8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int zaznaczonyId = rG2.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton)findViewById(zaznaczonyId);
                j=1;
               /* if (radioButton.equals(rb8)){
                    Toast.makeText(getApplicationContext(),"Dobra odpowiedź ", Toast.LENGTH_LONG).
                            show();
                }
                /*Toast.makeText(getApplicationContext(),"Liczba punktów: " + ++i , Toast.LENGTH_LONG).
                        show(); */
            }
        });

        RadioButton rB11= (RadioButton)findViewById(R.id.radioButton11);
        rB11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                k=1;
               /* Toast.makeText(getApplicationContext(),"Liczba punktów: " + ++i , Toast.LENGTH_LONG).
                        show();*/
            }
        });

        RadioButton rB14= (RadioButton)findViewById(R.id.radioButton14);
        rB14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                m=1;
                /*Toast.makeText(getApplicationContext(),"Liczba punktów: " + ++i , Toast.LENGTH_LONG).
                        show(); */
            }
        });

        RadioButton rB19= (RadioButton)findViewById(R.id.radioButton19);
        rB19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                n=1;
                /*Toast.makeText(getApplicationContext(),"Liczba punktów: " + ++i , Toast.LENGTH_LONG).
                        show();*/
            }
        });

        RadioButton rB21= (RadioButton)findViewById(R.id.radioButton21);
        rB21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                o=1;
                /*Toast.makeText(getApplicationContext(),"Liczba punktów: " + ++i , Toast.LENGTH_LONG).
                        show(); */
            }
        });

        RadioButton rB27= (RadioButton)findViewById(R.id.radioButton27);
        rB27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                p=1;
                /*Toast.makeText(getApplicationContext(),"Liczba punktów: " + ++i , Toast.LENGTH_LONG).
                        show();*/
            }
        });
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int s=i+j+k+l+m+n+o;
                Toast.makeText(getApplicationContext(),"Zdobyto punktów: " +s+ " /7", Toast.LENGTH_LONG).
                show();
            }
        });
    }
}
