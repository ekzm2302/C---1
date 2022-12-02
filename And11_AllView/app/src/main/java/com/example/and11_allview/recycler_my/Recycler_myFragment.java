package com.example.and11_allview.recycler_my;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.and11_allview.R;

import java.util.ArrayList;


public class Recycler_myFragment extends Fragment {
    RecyclerView recv_my;
    ArrayList<RecylcerDTO> list;
    ImageButton btn_melon;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_recycler_my, container, false);
        recv_my = v.findViewById(R.id.recv_my);
        recv_my.setAdapter(new Recv_my_Adapter(inflater, list));
        btn_melon = v.findViewById(R.id.btn_melon);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(), RecyclerView.VERTICAL, false
        );

        btn_melon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("로그", "onClick:" + btn_melon);
            }
        });

        recv_my.setLayoutManager(manager);
        list = new ArrayList<>();
        list.add(new RecylcerDTO(R.drawable.img1, 1, "시간의 지평선", "윤하 (YOUNHA)"));
        list.add(new RecylcerDTO(R.drawable.img2, 2, "ANTIFRAGILE", "LE SSERAFIM (르세라핌)"));
        list.add(new RecylcerDTO(R.drawable.img3, 3, "Hype boy", "NewJeans"));
        list.add(new RecylcerDTO(R.drawable.img4, 4, "Nxde", "(여자)아이들"));
        list.add(new RecylcerDTO(R.drawable.img5, 5, "After LIKE", "IVE (아이브)"));


         Recv_my_Adapter adapter = new Recv_my_Adapter(inflater, list);
        recv_my.setAdapter(adapter);
        return  v;
    }


}