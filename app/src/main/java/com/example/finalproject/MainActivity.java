package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalproject.Home.HomeActvity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt1,bt2;
EditText medit_fname,medit_lastname,medit_email,medit_phone,medit_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intviews();
    }

    private void intviews() {
        bt1 = findViewById(R.id.button_login);
        bt1.setOnClickListener(this);
        bt2 = findViewById(R.id.button_sign);
        bt2.setOnClickListener(this);
        medit_fname = findViewById(R.id.edit_name);
        medit_fname.setOnClickListener(this);
        medit_lastname = findViewById(R.id.edit_lastname);
        medit_lastname.setOnClickListener(this);
        medit_email = findViewById(R.id.edit_email);
        medit_email.setOnClickListener(this);
        medit_phone = findViewById(R.id.edit_phone);
        medit_phone.setOnClickListener(this);
        medit_password  =findViewById(R.id.edit_password);
        medit_password.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_login:
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.button_sign:
                if(medit_fname.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "please enter first name", Toast.LENGTH_LONG).show();
                }
                else if(medit_lastname.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "please enter last name", Toast.LENGTH_LONG).show();
                }
                else if(medit_email.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "please enter Email", Toast.LENGTH_LONG).show();
                }
                else if(medit_phone.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "please enter phone number", Toast.LENGTH_LONG).show();
                }
                else if(medit_password.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "please enter password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent1 = new Intent(MainActivity.this, HomeActvity.class);
                    startActivity(intent1);
                }

        }

    }
}
