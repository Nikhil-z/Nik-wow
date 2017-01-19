package com.nikhilcgopi.nikwow.network.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {

    public static final String BASE_URL = "http://api.androidhive.info/contacts/";
    // single product url
    private static final String url_product_detials = "http://api.nicx.me/";

    // url to update product
    private static final String url_update_product = "http://10.0.2.2/android_connect/update_product.php";

    // url to delete product
    private static final String url_delete_product = "http://10.0.2.2/android_connect/delete_product.php";

    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static Retrofit getCurdClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url_product_detials)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
