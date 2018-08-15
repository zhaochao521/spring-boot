package com.avicit.bean;

import java.io.Serializable;

/**
 * Created by zhaoc on 2018/7/12
 */
public class Employee implements Serializable {

    private Integer id;
    private String lastName;
    private String gender;
    private String email;
    private String dId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }
}
