package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.finalproject.frigments.LanguageFragment;
import com.example.finalproject.frigments.LogoutFragment;

public class SettingActvity extends AppCompatActivity implements View.OnClickListener {
    TextView medit,mchang,mcontact,mshare,mrate,mlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_actvity);
        inviews();
    }

    private void inviews() {
        medit =findViewById(R.id.text_editprofile);
        medit.setOnClickListener(this);
        mchang = findViewById(R.id.text_chang);
        mchang.setOnClickListener(this);
        mcontact = findViewById(R.id.text_contact);
        mcontact.setOnClickListener(this);
        mshare = findViewById(R.id.text_share);
        mshare.setOnClickListener(this);
        mrate = findViewById(R.id.text_shareapp);
        mrate.setOnClickListener(this);
        mlog=findViewById(R.id.text_logout);
        mlog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.text_editprofile:
                Intent intent = new Intent(SettingActvity.this,EditProfileActivity.class);
                startActivity(intent);
                break;
            case R.id.text_chang:
                LanguageFragment languageFragment = new LanguageFragment();
                languageFragment.show(getSupportFragmentManager(),"");
                break;
            case R.id.text_logout:
                LogoutFragment logoutFragment =new LogoutFragment();
                logoutFragment.show(getSupportFragmentManager(),"");
                break;
        }

    }
}
