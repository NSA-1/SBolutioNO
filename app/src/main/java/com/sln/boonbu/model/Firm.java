package com.sln.boonbu.model;

import com.sln.boonbu.enumContainer.StatusEnum;

public class Firm {
    String name, description;
    Number id;
    StatusEnum status;

    public Firm() {
    }

    public Firm(String name, String description, Number id, StatusEnum status) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
