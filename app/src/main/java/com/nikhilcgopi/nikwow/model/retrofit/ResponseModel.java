package com.nikhilcgopi.nikwow.model.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 20/1/17.
 */

public class ResponseModel {


    @SerializedName("success")
    private String success;
    @SerializedName("message")
    private String message;



    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
