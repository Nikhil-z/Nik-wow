package com.nikhilcgopi.nikwow.model.retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 19/1/17.
 */

public class ProductModel {


    @SerializedName("pid")
    private String pid;
    @SerializedName("name")
    private String name;
    @SerializedName("price")
    private String price;
    @SerializedName("description")
    private String description;
    @SerializedName("created_at")
    private String created_at;
    @SerializedName("updated_at")
    private String updated_at;


    public ProductModel(String pid, String name, String price, String description, String created_at, String updated_at) {

        this.pid = pid;
        this.name = name;
        this.price = price;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;


    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
