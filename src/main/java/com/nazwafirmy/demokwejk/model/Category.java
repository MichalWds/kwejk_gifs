package com.nazwafirmy.demokwejk.model;

public class Category {

    /*id bedzie do identyfikacji, a spring do nazwy */
   private int id;
   private String name;

    public Category(int id, String name) {    //konstruktor podwojny
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
