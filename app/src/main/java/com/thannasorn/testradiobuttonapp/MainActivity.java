package com.thannasorn.testradiobuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton radioBtn1, radioBtn2, radioBtn3, radioBtn4, radioBtn5;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioBtn1 = (RadioButton) findViewById(R.id.radioButton1);
        radioBtn2 = (RadioButton) findViewById(R.id.radioButton2);
        radioBtn3 = (RadioButton) findViewById(R.id.radioButton3);
        radioBtn4 = (RadioButton) findViewById(R.id.radioButton4);
        radioBtn5 = (RadioButton) findViewById(R.id.radioButton5);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        String message = "";
        if(radioBtn1.isChecked()){
            message = radioBtn1.getText().toString();
        }
        else if (radioBtn2.isChecked()){
            message = radioBtn2.getText().toString();
        }
        else if (radioBtn3.isChecked()){
            message = radioBtn3.getText().toString();
        }
        else if (radioBtn4.isChecked()){
            message = radioBtn4.getText().toString();
        }
        else if (radioBtn5.isChecked()){
            message = radioBtn5.getText().toString();
        }
        Toast.makeText(this, "You choose : " + message, Toast.LENGTH_SHORT).show();
    }

}