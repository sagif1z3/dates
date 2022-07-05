package com.sagi.dates.entities;

public class AddressEntity {
    public String region;
    public String city;
    public String street;

    public AddressEntity(String region, String city, String street) {
        this.region = region;
        this.city = city;
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "AddressEntity{" +
                "region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
