package com.example.fakeemail;

public class Email {
    private String name,mess;
    private int h,m;
    private Integer icon;


    private Integer idColor;
    private Integer[] color={
            R.color.c0,R.color.c1,R.color.c2,R.color.c3,R.color.c4,R.color.c5,
            R.color.c6,R.color.c7,R.color.c8,R.color.c9
    };
    private Integer[] id={
            1,2,4
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public Integer getIcon() {
        return id[icon];
    }

    public void setIcon(Integer icon,Integer i) {
        if (icon==1){
            this.icon=i;
        }
        else{
            this.icon=-1;
        }
    }

    public Integer getIdColor() {
        return color[this.idColor];
    }

    public void setIdColor(Integer idColor) {
        this.idColor = idColor;
    }
}
