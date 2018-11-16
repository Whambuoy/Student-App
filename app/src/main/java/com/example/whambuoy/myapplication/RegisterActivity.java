package com.example.whambuoy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    //@BindView(R.id.editEmail)
    //EditText editEmail;

    EditText editEmail = (EditText) findViewById(R.id.editEmail);
    EditText editFullName = (EditText) findViewById(R.id.editFullName);
    EditText editPassword = (EditText) findViewById(R.id.editPhone);
    EditText editPhone = (EditText) findViewById(R.id.editPassword);
    Button btnSignUp = (Button) findViewById(R.id.btnSignUp);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //ButterKnife.bind(this)



        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateRegisterInput();
            }
        });
    }

    /**
     * We will validate the input
     */
    public void validateRegisterInput(){
        String fullname = editFullName.getText().toString();
        String phone = editPhone.getText().toString();
        String password = editPassword.getText().toString();
        String email = editEmail.getText().toString();

        if(fullname.isEmpty() || phone.isEmpty() || password.isEmpty() || email.isEmpty()){
            Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
        } else {

        }

    }
}
