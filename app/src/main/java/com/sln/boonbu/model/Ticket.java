package com.sln.boonbu.model;

public class Ticket {

    //    @SerializedName("description")
    //    @Expose
    String description;

    //   @SerializedName("id")
    //   @Expose
    String id;

    //  @SerializedName("ticketDefinitionId")
    //  @Expose
    String ticketDefinitionId;

    //  @SerializedName("subCategoryId")
    //  @Expose
    String subCategoryId;

    //  @SerializedName("userId")
    //   @Expose
    String userId;

    // @SerializedName("expirationDate")
    // @Expose
    String expirationDate;

    //   @SerializedName("createdOn")
    //   @Expose
    String createdOn;

    //  @SerializedName("categoryId")
    //   @Expose
    String categoryId;

    public Ticket(){

    }

    public Ticket(String description, String id, String ticketDefinitionId, String subCategoryId, String userId, String expirationDate, String createdOn, String categoryId) {
        this.description = description;
        this.id = id;
        this.ticketDefinitionId = ticketDefinitionId;
        this.subCategoryId = subCategoryId;
        this.userId = userId;
        this.expirationDate = expirationDate;
        this.createdOn = createdOn;
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTicketDefinitionId() {
        return ticketDefinitionId;
    }

    public void setTicketDefinitionId(String ticketDefinitionId) {
        this.ticketDefinitionId = ticketDefinitionId;
    }

    public String getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
