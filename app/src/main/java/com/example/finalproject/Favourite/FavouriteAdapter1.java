package com.example.finalproject.Favourite;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;

public class FavouriteAdapter1 extends RecyclerView.Adapter<FavouriteAdapter1.FavouriteViewHolder> {


    @NonNull
    @Override
    public FavouriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  =  LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_style,parent,false);
        FavouriteViewHolder favouriteViewHolder = new FavouriteViewHolder(view);
        return favouriteViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FavouriteViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }

    class FavouriteViewHolder extends RecyclerView.ViewHolder{

        public FavouriteViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
