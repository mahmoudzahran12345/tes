package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
TextView mtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intviews();
    }

    private void intviews() {
        mtextview = findViewById(R.id.text_forgotpasswordlogin);
        mtextview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.text_forgotpasswordlogin:
                Intent intent = new Intent(LoginActivity.this,ForgetPassword.class);
                startActivity(intent);
            break;
        }

    }
}
