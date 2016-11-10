package com.example.admin.w4d3recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private ArrayList<String> mArrayList;
    private SimpleAdapter mSimpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayList = new ArrayList<>();
        mSimpleAdapter = new SimpleAdapter(mArrayList);

        mRecyclerView = (RecyclerView) findViewById(R.id.a_main_recycler);
        mRecyclerView.setAdapter(mSimpleAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        mArrayList.add("Beto");
        mArrayList.add("Pepe");
        mArrayList.add("Raul");
        mArrayList.add("Dany");
        mArrayList.add("Ab");
        mArrayList.add("Will");
        mArrayList.add("Edwin");
        mSimpleAdapter.notifyDataSetChanged();
    }
}
