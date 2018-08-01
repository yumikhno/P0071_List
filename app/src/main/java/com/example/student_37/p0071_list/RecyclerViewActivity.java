package com.example.student_37.p0071_list;

import android.app.Activity;
import android.app.LauncherActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        List<String> items = new ArrayList<String>();

        for(int i=1;i<101;i++){
            items.add("Элемент #"+i);
        }

        RecyclerAdapter adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setItems(items);

        adapter.setOnRecyclerClicked(new RecyclerAdapter.OnRecyclerClicked() {
            @Override
            public void onClick(String text) {
                Toast.makeText(RecyclerViewActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });
    }

}
