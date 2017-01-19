package com.nikhilcgopi.nikwow.network.rest;

import com.nikhilcgopi.nikwow.model.ContactResponse;
import com.nikhilcgopi.nikwow.model.ProductResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;


public interface ApiInterface {
   /* @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);*/

    @GET("#sthash.iKTGkE9z.dpuf")
    Call<ContactResponse> getContactDetail();

    @GET("curd/get_all_products.php")
    Call<ProductResponse> getProductDetail();



}
