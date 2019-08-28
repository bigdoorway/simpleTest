package com.puyuan.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private String uName;

    private int age;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
}
