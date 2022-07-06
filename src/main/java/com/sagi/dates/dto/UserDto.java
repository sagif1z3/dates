package com.sagi.dates.dto;

import com.sagi.dates.entities.UserEntity;
import com.sagi.dates.enums.GenderType;
import com.sagi.dates.enums.OrientationType;

public class UserDto {

    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private GenderType genderType;
    private OrientationType orientationType;

    public UserDto() {
    }

    public UserDto(UserEntity userEntity) {
        this.id = userEntity.getId();
        this.firstName = userEntity.getFirstName();
        this.lastName = userEntity.getLastName();
        this.age = userEntity.getAge();
        this.address = userEntity.getAddress();
        this.genderType = userEntity.getGenderType();
        this.orientationType = userEntity.getOrientationType();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public OrientationType getOrientationType() {
        return orientationType;
    }

    public void setOrientationType(OrientationType orientationType) {
        this.orientationType = orientationType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", genderType=" + genderType +
                ", orientationType=" + orientationType +
                '}';
    }
}
