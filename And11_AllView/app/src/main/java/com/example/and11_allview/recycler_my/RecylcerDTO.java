package com.example.and11_allview.recycler_my;

import android.widget.Button;

public class RecylcerDTO {
    int img, tv_num;
    String tv_title, tv_name;


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getTv_num() {
        return tv_num;
    }

    public void setTv_num(int tv_num) {
        this.tv_num = tv_num;
    }

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public RecylcerDTO(int img, int tv_num, String tv_title, String tv_name) {
        this.img = img;
        this.tv_num = tv_num;
        this.tv_title = tv_title;
        this.tv_name = tv_name;
    }
}
