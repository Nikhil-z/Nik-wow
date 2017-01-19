package com.nikhilcgopi.nikwow.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 19/1/17.
 */

public class ContactModel {


    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("gender")
    private String gender;
    @SerializedName("phone")
    private Phone phone;


    public ContactModel(String name ,String email , String gender,Phone phone){
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phone = phone;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public class Phone{

        @SerializedName("mobile")
        private String mobile;

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }
    }
}
