package com.example.and11_allview.carrot;

import java.io.Serializable;

public class CarrotDTO implements Serializable {
    int imgv_product;
    String tv_where;
    String tv_product;
    String tv_price;
    String tv_chat;
    String tv_like;
    String tv_when;
    public String getTv_when() {
        return tv_when;
    }

    public void setTv_when(String tv_when) {
        this.tv_when = tv_when;
    }



    public int getImgv_product() {
        return imgv_product;
    }

    public void setImgv_product(int imgv_product) {
        this.imgv_product = imgv_product;
    }

    public String getTv_where() {
        return tv_where;
    }

    public void setTv_where(String tv_where) {
        this.tv_where = tv_where;
    }

    public String getTv_product() {
        return tv_product;
    }

    public void setTv_product(String tv_product) {
        this.tv_product = tv_product;
    }

    public String getTv_price() {
        return tv_price;
    }

    public void setTv_price(String tv_price) {
        this.tv_price = tv_price;
    }

    public String getTv_chat() {
        return tv_chat;
    }

    public void setTv_chat(String tv_chat) {
        this.tv_chat = tv_chat;
    }

    public String getTv_like() {
        return tv_like;
    }

    public void setTv_like(String tv_like) {
        this.tv_like = tv_like;
    }

    public CarrotDTO(int imgv_product, String tv_where, String tv_product, String tv_price, String tv_chat, String tv_like, String tv_when) {
        this.imgv_product = imgv_product;
        this.tv_where = tv_where;
        this.tv_product = tv_product;
        this.tv_price = tv_price;
        this.tv_chat = tv_chat;
        this.tv_like = tv_like;
        this.tv_when = tv_when;
    }
}
