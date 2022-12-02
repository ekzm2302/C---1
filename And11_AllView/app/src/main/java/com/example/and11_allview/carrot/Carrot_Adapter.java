package com.example.and11_allview.carrot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Carrot_Adapter extends RecyclerView.Adapter<Carrot_Adapter.ViewHolder>{

    LayoutInflater inflater;

    public Carrot_Adapter (LayoutInflater inflater) {
        this.inflater = inflater;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recv_carrot, parent, false);

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View v) {
            super(v);
        }
    }
}
