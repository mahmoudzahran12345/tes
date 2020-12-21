package com.example.finalproject.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.finalproject.BuyActivity;
import com.example.finalproject.Favourite.FavouriteActivity;
import com.example.finalproject.History.HistoryActivity;
import com.example.finalproject.MainActivity;
import com.example.finalproject.R;
import com.example.finalproject.SettingActvity;



import java.util.ArrayList;

public class HomeActvity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    DrawerLayout drawerLayout;
    ConstraintLayout constraintLayout;
    TextView mtextview,mtexv_history,msetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_actvity);
       intviews();
       intviews2();

    }

     void intviews2() {

         imageView = findViewById(R.id.image_menue);
         imageView.setOnClickListener(this);
         drawerLayout = findViewById(R.id.countiner);
         mtextview = findViewById(R.id.text_fav);
         mtextview.setOnClickListener(this);
         mtexv_history  =findViewById(R.id.text_history);
         mtexv_history.setOnClickListener(this);
         msetting = findViewById(R.id.text_setting);
         msetting.setOnClickListener(this);

    }

    void intviews()
    {
        RecyclerView recyclerView = findViewById(R.id.RV);
        recyclerView.setHasFixedSize(true);
        Adapter_H adapter_h =new Adapter_H();
        recyclerView.setAdapter(adapter_h);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayout.VERTICAL));

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_menue:
            drawerLayout.openDrawer(Gravity.LEFT);
            break;
            case R.id.text_fav:
                Intent intent2  =  new Intent(HomeActvity.this, FavouriteActivity.class);
                startActivity(intent2);
                drawerLayout.closeDrawers();
                break;
            case R.id.text_history:
                Intent intent  =  new Intent(HomeActvity.this, HistoryActivity.class);
                startActivity(intent);
                drawerLayout.closeDrawers();
                     break;
            case R.id.text_setting:
                Intent intent1 = new Intent(HomeActvity.this, SettingActvity.class);
                startActivity(intent1);
                drawerLayout.closeDrawers();
                break;

        }

    }
}
