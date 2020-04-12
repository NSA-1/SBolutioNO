package com.sln.boonbu.model;

public class TicketDefinition {
    String id,name,categoryId,description,userId;
    Boolean isLikedBefore;

    public TicketDefinition() {
    }

    public TicketDefinition(String id, String name, String categoryId, String description, String userId, Boolean isLikedBefore) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.description = description;
        this.userId = userId;
        this.isLikedBefore = isLikedBefore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getLikedBefore() {
        return isLikedBefore;
    }

    public void setLikedBefore(Boolean likedBefore) {
        isLikedBefore = likedBefore;
    }
}
