package com.example.and11_allview.listfrag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.and11_allview.ListDTO;
import com.example.and11_allview.List_Adapter;
import com.example.and11_allview.R;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    ListView listv_frag;
    ArrayList<FragDTO> dto;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list, container, false);
        listv_frag = v.findViewById(R.id.listv_frag);


        dto = new ArrayList<FragDTO>();

        for (int i = 1; i <= 30; i++) {
            dto.add(new FragDTO("중고나라" + i,  i + "\t"   ));
        }
        // List_Adapter의 갯수 == list.size와 같게 처리
        Frag_Adapter adapter = new Frag_Adapter(getLayoutInflater(), dto);
        listv_frag.setAdapter(adapter);


        return v;

    }
}