package com.example.finalproject.Favourite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.finalproject.BuyActivity;
import com.example.finalproject.R;

public class FavouriteActivity extends AppCompatActivity  {
RecyclerView mRv;
TextView mtext_garman;
FavouriteAdapter1 favouriteAdapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        mRv = findViewById(R.id.rv_favo);
        favouriteAdapter1 = new FavouriteAdapter1();
        mRv.setAdapter(favouriteAdapter1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(FavouriteActivity.this,1);
        mRv.setLayoutManager(layoutManager);
    }

}
