package com.droid.retrofitdemoandroid;

import retrofit2.Call;

import java.util.List;

import retrofit2.http.POST;

/**
 * Created by jean on 20/06/2017.
 */

public interface ApiInterface {

    @POST("readcontacts.php")
    Call<List<Contact>>  getContacts();
}
