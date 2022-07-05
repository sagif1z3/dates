package com.sagi.dates.entities;


import com.sagi.dates.dto.UserDto;
import com.sagi.dates.enums.GenderType;
import com.sagi.dates.enums.OrientationType;
import javax.persistence.*;

@Entity
@Table(name = "Users")
public class UserEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private GenderType genderType;

    //סוג משיכה (הומו, סטרייט ושטויות כאלה)
    @Column(name = "orientation", nullable = false)
    @Enumerated(EnumType.STRING)
    private OrientationType orientationType;

    public UserEntity() {
    }

    public UserEntity(UserDto userDto) {
        this.id = userDto.getId();
        this.firstName = userDto.getFirstName();
        this.lastName = userDto.getLastName();
        this.age = userDto.getAge();
        this.genderType = userDto.getGenderType();
        this.orientationType = userDto.getOrientationType();
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

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", genderType=" + genderType +
                ", orientationType=" + orientationType +
                '}';
    }
}
