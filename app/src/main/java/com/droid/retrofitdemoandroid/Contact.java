package com.droid.retrofitdemoandroid;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jean on 19/06/2017.
 */

public class Contact {

    @SerializedName("name")
    private String Name;

    @SerializedName("email")
    private String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
