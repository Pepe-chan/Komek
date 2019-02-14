package com.coding.komek.models;

public class Address {
    private int id;
    private Region region;
    private String area;
    private String street;
    private String house;
    private String flat;

    public int getId() {
        return id;
    }

    public Region getRegion() {
        return region;
    }

    public String getArea() {
        return area;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getFlat() {
        return flat;
    }

    public Address(int id, Region region, String area, String street, String house, String flat) {
        this.id = id;
        this.region = region;
        this.area = area;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public Address(int id, Region region, String area, String street, String house) {
        this.id = id;
        this.region = region;
        this.area = area;
        this.street = street;
        this.house = house;
    }

    public Address(int id, Region region, String area, String street) {
        this.id = id;
        this.region = region;
        this.area = area;
        this.street = street;
    }

    public Address(int id, Region region, String area) {
        this.id = id;
        this.region = region;
        this.area = area;
    }
}
