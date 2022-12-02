package com.example.and11_allview.carrot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.and11_allview.R;

import java.util.ArrayList;


public class CarrotFragment extends Fragment {
    RecyclerView list_carrot;
    ArrayList<CarrotDTO> list;
    LinearLayout item;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View v = inflater.inflate(R.layout.fragment_carrot, container, false);

        list = new ArrayList<>();

        list.add(new CarrotDTO(R.drawable.product1,"지역","길거리에서 주워온 물건입니다","50,000원","1","1", "방금 전"));
        list.add(new CarrotDTO(R.drawable.product2,"지역","길거리에서 주워온 물건입니다","50,000원","1","1", "방금 전"));
        list.add(new CarrotDTO(R.drawable.product3,"지역","길거리에서 주워온 물건입니다","50,000원","1","1", "방금 전"));
        list.add(new CarrotDTO(R.drawable.product4,"지역","길거리에서 주워온 물건입니다","50,000원","1","1", "방금 전"));
        list.add(new CarrotDTO(R.drawable.product5,"지역","길거리에서 주워온 물건입니다","50,000원","1","1", "방금 전"));
        Log.d("TAG", "onCreateView: "+list.get(0).getTv_product());
        list_carrot = v.findViewById(R.id.list_carrot);
       Carrot_Adapter adapter = new Carrot_Adapter(inflater, list);
       list_carrot.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        list_carrot.setLayoutManager(manager);



        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return v;



    }
}