package com.example.and11_allview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.and11_allview.carrot.CarrotFragment;
import com.example.and11_allview.gridv.GridFragment;
import com.example.and11_allview.listfrag.ListFragment;
import com.example.and11_allview.recycler.RecyclerFragment;
import com.example.and11_allview.recycler_my.Recycler_myFragment;

public class MainActivity extends AppCompatActivity {
    Button btn_sub, btn_list, btn_grid, btn_recycler, btn_recycler_my, btn_carrot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_recycler_my = findViewById(R.id.btn_recycler_my);
        btn_list = findViewById(R.id.btn_list);
        btn_grid = findViewById(R.id.btn_grid);
        btn_recycler = findViewById(R.id.btn_recycler);
        btn_sub = findViewById(R.id.btn_sub);
        btn_carrot = findViewById(R.id.btn_carrot);



        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        //  리스트뷰F
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new ListFragment()).commit();

            }
        });
        // 그리드뷰F
        btn_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new GridFragment()).commit();
            }
        });

        btn_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new RecyclerFragment()).commit();
            }
        });

        btn_recycler_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new Recycler_myFragment()).commit();
            }
        });

        // 당근 당근 당근
        btn_carrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new CarrotFragment()).commit();
            }
        });

    }
}