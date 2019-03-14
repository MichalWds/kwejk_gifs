package com.nazwafirmy.demokwejk.model;

public class Gif {

    private String name;
    private String username;
    private Boolean favorite;
    private int categoryId;

    public Gif(String name, String username, Boolean favorite, int categoryId) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }
    public String getName(){
        return name;
    }



}
