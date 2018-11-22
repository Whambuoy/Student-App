package com.example.whambuoy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText editFullName;
    EditText editPassword;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editFullName = (EditText) findViewById(R.id.editFullName);
        editPassword = (EditText) findViewById(R.id.editPassword);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateCredentials();
            }
        });
    }

    public void validateCredentials(){
        String fullname = editFullName.getText().toString();
        String password = editPassword.getText().toString();

        if(fullname.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
        }
        else{

        }
    }
}
