package com.sagi.dates.entities;


import com.sagi.dates.enums.UserType;

public class UserEntity {
    private int id;
    private int age;
    private String name;
    private UserType userType;
    private AddressEntity address;

    public UserEntity() {
    }

    public UserEntity(int age, String name, UserType userType, AddressEntity address) {
        this.age = age;
        this.name = name;
        this.userType = userType;
        this.address = address;
    }

    public UserEntity(int id, int age, String name, UserType userType, AddressEntity address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.userType = userType;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }
}
