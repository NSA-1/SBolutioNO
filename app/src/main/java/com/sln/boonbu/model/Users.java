package com.sln.boonbu.model;

import java.util.Date;

public class Users {
    String firstName, lastName, userName, password, gsm, email, tckn, id;
    Number  typeId, statusId;
    Boolean isApproved;
    Date expirationDate;

    public Users(){

    }

    public Users(String firstName, String lastName, String userName, String password, String gsm,
                 String email, String tckn, String id, Number typeId,
                 Boolean isApproved, Date expirationDate, Number statusId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.gsm = gsm;
        this.email = email;
        this.tckn = tckn;
        this.id = id;
        this.typeId = typeId;
        this.isApproved = isApproved;
        this.expirationDate = expirationDate;
        this.statusId = statusId;
    }

    public Number getStatusId() {
        return statusId;
    }

    public void setStatusId(Number statusId) {
        this.statusId = statusId;
    }

    //Ogrenci gecerlilik tarihi icin konuldu
    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Number getTypeId() {
        return typeId;
    }

    public void setTypeId(Number typeId) {
        this.typeId = typeId;
    }
}
