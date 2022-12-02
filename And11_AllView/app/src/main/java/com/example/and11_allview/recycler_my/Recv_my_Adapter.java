package com.example.and11_allview.recycler_my;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

import java.util.ArrayList;

public class Recv_my_Adapter extends RecyclerView.Adapter<Recv_my_Adapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<RecylcerDTO> list;
    public Recv_my_Adapter(LayoutInflater inflater, ArrayList<RecylcerDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recv_my, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.imgv1.setImageResource(list.get(i).getImg());
        h.tv_num.setText(""+list.get(i).getTv_num());
        h.tv_title.setText(list.get(i).getTv_title());
        h.tv_name.setText(list.get(i).getTv_name());


    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgv1;
        TextView tv_title, tv_name, tv_num;
        public ViewHolder(@NonNull View v) {
            super(v);

            imgv1 = v.findViewById(R.id.imgv1);
            tv_name = v.findViewById(R.id.tv_name);
            tv_num = v.findViewById(R.id.tv_num);
            tv_title = v.findViewById(R.id.tv_title);


        }
    }
}
