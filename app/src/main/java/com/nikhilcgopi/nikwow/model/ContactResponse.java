package com.nikhilcgopi.nikwow.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ContactResponse {

    @SerializedName("contacts")
    private List<ContactModel> results;

    public List<ContactModel> getResults() {
        return results;
    }

    public void setResults(List<ContactModel> results) {
        this.results = results;
    }

}
