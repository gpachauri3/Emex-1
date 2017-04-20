package com.example.gaurav.a_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    public EditText email,password;
    public Button login;
    public TextView forgotPassword,signUp;
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        forgotPassword=(TextView)findViewById(R.id.tv_forgotpassword);
        login=(Button)findViewById(R.id.loginBt);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,NavigationDrawerActivity.class);
                startActivity(intent);
            }
        });
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login.this,forgotpassword.class);
                startActivity(intent);
            }
        });


//        login.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//              String emailS=email.getText().toString();
//               String passwordS=password.getText().toString();
//           }
//       });



    }
}
