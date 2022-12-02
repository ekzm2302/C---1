package com.example.and11_allview.listfrag;

public class FragDTO {
    String tvf_name, tvf_new;

    public void setTvf_name(String tvf_name) {
        this.tvf_name = tvf_name;
    }

    public void setTvf_new(String tvf_new) {
        this.tvf_new = tvf_new;
    }

    public String getTvf_name() {
        return tvf_name;
    }

    public String getTvf_new() {
        return tvf_new;
    }

    public FragDTO(String tvf_name, String tvf_new) {
        this.tvf_name = tvf_name;
        this.tvf_new = tvf_new;
    }
}
