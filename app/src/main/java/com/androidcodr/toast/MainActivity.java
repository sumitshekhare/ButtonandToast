package com.androidcodr.toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText eduser;
    private EditText edpass;
    private  Button btnlogin;
    private  Button btnclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eduser =(EditText)findViewById(R.id.main_editText_username);
        edpass=(EditText)findViewById(R.id.main_editText_password);
        btnlogin=(Button)findViewById(R.id.main_button_login);
        btnclear=(Button)findViewById(R.id.main_button_clear);

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eduser.setText("");
                edpass.setText("");
            }
        });
    }


    public void login(View view){
        String username=eduser.getText().toString();
        String password =edpass.getText().toString();

        if (username.trim().isEmpty()|| password.trim().isEmpty()){
            Toast.makeText(this, "Please Type both Fields!", Toast.LENGTH_SHORT).show();
        } else {
            if (username.equals("demo") && password.equals("androidcodr")){
                Toast.makeText(this, "Login Successfull!", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
