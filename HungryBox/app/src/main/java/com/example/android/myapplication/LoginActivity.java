package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText mUsername,mPassword;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUsername = (EditText)findViewById(R.id.username);

        mPassword = (EditText)findViewById(R.id.password);

        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                validateCredentials();
            }
        });
    }

    private void validateCredentials(){
        if(mUsername.getText().toString().equals("admin") && mPassword.getText().toString().equals("admin"))
        {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this,"Username/password wrong!!",Toast.LENGTH_SHORT).show();
        }

    }


}
