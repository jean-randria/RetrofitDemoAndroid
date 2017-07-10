package com.droid.retrofitdemoandroid;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jean on 20/06/2017.
 */

public class ApiClient {

    public static final String BASE_URL ="http://localhost:8888/RETROFIT/";
    public static Retrofit retrofit=null;

    public static Retrofit getApiClient()
    {
        if(retrofit == null)
        {
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }


}


