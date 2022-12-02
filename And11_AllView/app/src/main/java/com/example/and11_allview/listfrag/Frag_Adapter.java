package com.example.and11_allview.listfrag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.and11_allview.R;

import java.util.ArrayList;


public class Frag_Adapter extends BaseAdapter {

 LayoutInflater inflater;
 ArrayList<FragDTO> dto;
  public Frag_Adapter(LayoutInflater inflater, ArrayList<FragDTO> dto) {
      this.inflater = inflater;
      this.dto = dto;
  }

    @Override
    public int getCount() {
        return dto.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        v = inflater.inflate(R.layout.item_frag_list, parent, false);
        TextView tvf_name = v.findViewById(R.id.tvf_name);
        TextView tvf_new = v.findViewById(R.id.tvf_new);
        tvf_name.setText(dto.get(i).getTvf_name());
        tvf_new.setText(dto.get(i).getTvf_new()+"초");

        return v;
    }
}
