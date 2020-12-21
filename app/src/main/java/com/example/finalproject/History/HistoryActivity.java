package com.example.finalproject.History;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.finalproject.R;

public class HistoryActivity extends AppCompatActivity {
RecyclerView mrec;
HistoryAdapter historyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        intviews();
    }

    private void intviews() {
        mrec  = findViewById(R.id.rv_ho);
        historyAdapter = new HistoryAdapter(this);
        RecyclerView.LayoutManager layoutManager  = new GridLayoutManager(HistoryActivity.this,1);
        mrec.setAdapter(historyAdapter);
        mrec.setLayoutManager(layoutManager);
    }
}
