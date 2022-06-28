package com.rse.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private  String firstName;
    private  String LsatName;
    private  String phoneNumber;
    private  String email;
    private  String password;
    private  String urlImage;
    public User(){};
    public User(String firstName, String lsatName, String phoneNumber, String email, String password, String urlImage) {
        this.firstName = firstName;
        LsatName = lsatName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.urlImage = urlImage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLsatName() {
        return LsatName;
    }

    public void setLsatName(String lsatName) {
        LsatName = lsatName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
