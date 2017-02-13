package com.mukesh.xmlparsingwithratrofit;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Mukesh swami on 2/11/2017.
 */

public interface ApiService {
    @GET("/xml/simple.xml")
    void getUser(Callback<BreakFastMenu> callback);
}
