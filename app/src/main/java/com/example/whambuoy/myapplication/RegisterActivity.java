package com.example.whambuoy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.activeandroid.query.Select;
import com.example.whambuoy.myapplication.models.User;

public class RegisterActivity extends AppCompatActivity {

    //@BindView(R.id.editEmail)
    //EditText editEmail;

    EditText editEmail;
    EditText editFullName;
    EditText editPassword;
    EditText editPhone;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //ButterKnife.bind(this)

        editEmail = (EditText) findViewById(R.id.editEmail);
        editFullName = (EditText) findViewById(R.id.editFullName);
        editPassword = (EditText) findViewById(R.id.editPhone);
        editPhone = (EditText) findViewById(R.id.editPassword);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);

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

            User user = new User(fullname,phone, "", email );
            user.save();

//            Toast.makeText(this, "okay!", Toast.LENGTH_SHORT).show();
//            User user1 =  new Select().from(User.class).where("fullname = ?",fullname).executeSingle();
//            if(user1 != null){
//                Log.d("User found: ",user.getEmail());
//            }
        }

        //List<User> storedUser = User.getAllLocations();
        //Log.d("EA", "All done!");
    }
}
