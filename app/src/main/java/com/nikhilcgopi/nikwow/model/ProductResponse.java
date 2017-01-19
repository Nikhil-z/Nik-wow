package com.nikhilcgopi.nikwow.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by user on 19/1/17.
 */

public class ProductResponse {

    @SerializedName("success")
    private String success;
    @SerializedName("products")
    private List<ProductModel> products;


    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public List<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProductModel> products) {
        this.products = products;
    }
}
