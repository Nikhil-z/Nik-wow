package com.nikhilcgopi.nikwow.network.rest;

import com.nikhilcgopi.nikwow.model.ContactResponse;
import com.nikhilcgopi.nikwow.model.retrofit.ProductModel;
import com.nikhilcgopi.nikwow.model.retrofit.ProductResponse;
import com.nikhilcgopi.nikwow.model.retrofit.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;


public interface ApiInterface {
   /* @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);*/

    @GET("#sthash.iKTGkE9z.dpuf")
    Call<ContactResponse> getContactDetail();

    @GET("curd/get_all_products.php")
    Call<ProductResponse> getProductDetail();

    /*@POST("curd/create_product.php")
    Call<ResponseModel> createProduct(
            @Part("pid") String pid ,
            @Part("name") String name ,
            @Part("price") String price ,
            @Part("description") String description
            );*/
    @POST("curd/create_product.php")
    Call<ResponseModel> createProduct(@Body ProductModel productModel);

    @PUT("curd/update_product.php")
    Call<ResponseModel> updateProduct(
            @Path("id") String id ,
            @Part("pid") String pid ,
            @Part("name") String name ,
            @Part("price") String price ,
            @Part("description") String description
    );


    @DELETE("curd/delete_product.php")
    Call<ResponseModel> deleteProduct(
            @Path("id") String id
    );



}
