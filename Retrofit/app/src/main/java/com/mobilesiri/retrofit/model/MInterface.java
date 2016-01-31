package com.mobilesiri.retrofit.model;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by MAC on 1/30/2016.
 */
public interface MInterface {

    @GET("/users/mobilesiri")
    void getUser(Callback<Pojo>uscb);

}
