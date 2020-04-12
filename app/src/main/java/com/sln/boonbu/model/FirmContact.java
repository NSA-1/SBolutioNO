package com.sln.boonbu.model;

import com.sln.boonbu.enumContainer.StatusEnum;

public class FirmContact {
    String fisrtName, lastName, email, gsm, description;
    Number id, firmId;
    StatusEnum status;

    public FirmContact() {
    }

    public FirmContact(String fisrtName, String lastName, String email, String gsm, String description, Number id, Number firmId, StatusEnum status) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.email = email;
        this.gsm = gsm;
        this.description = description;
        this.id = id;
        this.firmId = firmId;
        this.status = status;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Number getFirmId() {
        return firmId;
    }

    public void setFirmId(Number firmId) {
        this.firmId = firmId;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
