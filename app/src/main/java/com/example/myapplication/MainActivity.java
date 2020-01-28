package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView soulRecy;
    private GroupAdapter groupAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        List<String> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add("按钮"+i);
        }


        //这个是竖向的 一行一个
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
//        soulRecy.setLayoutManager(linearLayoutManager);
//        groupAdapter = new GroupAdapter(MainActivity.this, list);
//        soulRecy.setAdapter(groupAdapter);
//        groupAdapter.notifyDataSetChanged();



        //这个是横的，下面2就代表一行2个，可以随意设置
        GridLayoutManager linearLayoutManager = new GridLayoutManager(MainActivity.this,2);
        soulRecy.setLayoutManager(linearLayoutManager);
        groupAdapter = new GroupAdapter(MainActivity.this, list);
        soulRecy.setAdapter(groupAdapter);
        groupAdapter.notifyDataSetChanged();
    }

    private void initView() {
        soulRecy = (RecyclerView) findViewById(R.id.soul_recy);

    }
}
