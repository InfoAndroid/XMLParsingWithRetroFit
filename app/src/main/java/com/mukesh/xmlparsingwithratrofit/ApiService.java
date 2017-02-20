package com.mukesh.xmlparsingwithratrofit;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Mukesh swami on 2/11/2017.
 */

public interface ApiService {
    @GET("/rssfeedstopstories.cms")
    void getUser(Callback<RSS> callback);
}
