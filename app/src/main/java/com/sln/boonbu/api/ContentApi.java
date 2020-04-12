package com.sln.boonbu.api;

import com.sln.boonbu.model.Ticket;
import com.sln.boonbu.model.Category;
import com.sln.boonbu.model.Users;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ContentApi {
    @GET("/Ticket/.json")
    Call<HashMap<String, Ticket>> getTicket();

    @GET("/TicketDefinition/.json")
    Call<HashMap<String, Ticket>> getTicketDefinitions();

    @GET("/Users/.json")
    Call<HashMap<String, Users>> getUsers();

    @GET("/Ticket/.json?userId={id}")
    Call<List<Ticket>> getTicketByUserId(@Query("userId") Integer id);

    @GET("/Category/.json")
    Call<HashMap<String, Category>> getCategories();
//    @FormUrlEncoded
//    @POST("/Category/.json")
//    Call<HashMap<String, Category>> getCategories(@Field("id") String id);
}
