package com.example.and11_allview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ListView;

import com.example.and11_allview.gridv.Grid_Adapter;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {
    ListView listv_sub, gridv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        LayoutInflater inflater = getLayoutInflater();
        listv_sub = findViewById(R.id.listv_sub);



        // ListAdapter 생성해보기




        ArrayList<ListDTO> list = new ArrayList<ListDTO>();

        for (int i = 1; i <= 30; i++) {
            list.add(new ListDTO("영화" + i,  "관객\t"  +i));
        }
        // List_Adapter의 갯수 == list.size와 같게 처리
        List_Adapter adapter = new List_Adapter(inflater, list);
        listv_sub.setAdapter(adapter);

        Log.d("로그", "리스트의 사이즈: " + list.size());
    }



}