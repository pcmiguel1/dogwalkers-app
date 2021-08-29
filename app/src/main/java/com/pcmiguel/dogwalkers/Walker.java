package com.pcmiguel.dogwalkers;

import android.widget.ImageView;

public class Walker {

    private int id;
    private String name;
    private int img;
    private String location;
    private String price;

    public Walker(int id, String name, int img, String location, String price) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.location = location;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }
}
