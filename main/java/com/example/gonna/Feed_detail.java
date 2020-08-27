package com.example.gonna;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
//Feed的class
public class Feed_detail {
    private String loaction;
    private String name;
    private String month;
    private String day;
    private Drawable pic;
    private int yrs;
    public Feed_detail(){
        super();
    }
    public Feed_detail(String loc, String name, String day, String mon, int yrs ,Drawable pic){
        super();
        this.name = name;
        this.loaction = loc;
        this.month = mon;
        this.day = day;
        this.yrs = yrs;
        this.pic = pic;
    }

    public void set_loc(String loc){

        this.loaction = loc;
    }
    public void set_name(String name) {

        this.name = name;
    }
    public String get_loc(){

        return loaction;
    }
    public String get_name(){

        return name;
    }
    public String get_day(){

        return day;
    }
    public String get_mon(){

        return month;
    }
    public int get_yrs(){

        return yrs;
    }
    public Drawable get_pic(){

        return pic;
    }
}
