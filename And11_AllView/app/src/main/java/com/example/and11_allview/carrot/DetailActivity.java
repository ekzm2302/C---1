package com.example.and11_allview.carrot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and11_allview.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView iv_result;
        TextView tv_title;
        iv_result = findViewById(R.id.iv_result);
        tv_title = findViewById(R.id.tv_title);

        Intent intent = getIntent();
        CarrotDTO dto = (CarrotDTO) intent.getSerializableExtra("dto");

        iv_result.setImageResource(dto.getImgv_product());
        tv_title.setText(dto.getTv_product());




    }
}