package com.coding.komek.models;

public class Region {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Region(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
