package com.binay.oneToOne.entity;

import javax.persistence.*;

@Entity
public class Mobile {

    @Id
    @Column(name = "employee_id")
    private Long id;
    private String name;
    private String brand;
    private Long phoneNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }
}
