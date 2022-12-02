package com.example.and11_allview.carrot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

import java.util.ArrayList;


public class Carrot_Adapter extends RecyclerView.Adapter<Carrot_Adapter.ViewHolder>{

    LayoutInflater inflater;
    ArrayList<CarrotDTO> list;
    public Carrot_Adapter (LayoutInflater inflater, ArrayList<CarrotDTO> list) {
        this.inflater = inflater;
        this.list =list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recv_carrot, parent, false);

        ViewHolder View = new ViewHolder(v);
        return View;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.tv_where.setText(list.get(i).getTv_where());
        h.tv_product.setText(list.get(i).getTv_product());
        h.imgv_product.setImageResource(list.get(i).getImgv_product());
        h.tv_price.setText(list.get(i).getTv_price());
        h.tv_chat.setText(list.get(i).getTv_chat());
        h.tv_like.setText(list.get(i).getTv_like());
        h.tv_when.setText(list.get(i).getTv_when());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_product, tv_where, tv_price, tv_chat, tv_like, tv_when;
        ImageView imgv_product;

        public ViewHolder(@NonNull View v) {
            super(v);

            tv_where = v.findViewById(R.id.tv_where);
            tv_product = v.findViewById(R.id.tv_product);
            tv_price = v.findViewById(R.id.tv_price);
            tv_chat = v.findViewById(R.id.tv_chat);
            tv_like = v.findViewById(R.id.tv_like);
            tv_when = v.findViewById(R.id.tv_when);
            imgv_product = v.findViewById(R.id.imgv_product);



        }
    }
}
