package com.sln.boonbu.model;

import com.sln.boonbu.enumContainer.StatusEnum;

public class SubCategory {
    String name, description;
    Number id, mainCategoryId;
    StatusEnum status;

    public SubCategory() {
    }

    public SubCategory(String name, String description, Number id, Number mainCategoryId, StatusEnum status) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.mainCategoryId = mainCategoryId;
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

    public Number getMainCategoryId() {
        return mainCategoryId;
    }

    public void setMainCategoryId(Number mainCategoryId) {
        this.mainCategoryId = mainCategoryId;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
