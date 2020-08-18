package com.example.hw121;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubscribeActivity extends AppCompatActivity {

    Button buttonOk;
    Button buttonClear;
    TextView resultTextWindow;
    EditText userNameInput;
    EditText emailInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);
        buttonOk = (Button) findViewById(R.id.buttonOk);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        resultTextWindow = (TextView) findViewById(R.id.resultTextWindow);
        userNameInput = (EditText) findViewById(R.id.userNameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);


        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(userNameInput.getText().length() == 0) {
                    resultTextWindow.setText(R.string.usernameinput_string);
                    return;
                }
                if(emailInput.getText().length() == 0) {
                    resultTextWindow.setText(R.string.emailinput_string);
                    return;
                }
                resultTextWindow.setText(String.format(getString(R.string.result_string), userNameInput.getText(), emailInput.getText()));
            } });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                userNameInput.setText(null);
                emailInput.setText(null);
                resultTextWindow.setText(null);
            } });



    }

}
