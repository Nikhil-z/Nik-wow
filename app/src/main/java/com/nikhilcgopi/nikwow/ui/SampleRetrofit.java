package com.nikhilcgopi.nikwow.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.nikhilcgopi.nikwow.R;
import com.nikhilcgopi.nikwow.adapter.AdapterRetrofit;
import com.nikhilcgopi.nikwow.model.retrofit.ProductModel;
import com.nikhilcgopi.nikwow.model.retrofit.ProductResponse;
import com.nikhilcgopi.nikwow.model.retrofit.ResponseModel;
import com.nikhilcgopi.nikwow.network.rest.ApiClient;
import com.nikhilcgopi.nikwow.network.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by user on 19/1/17.
 */

public class SampleRetrofit extends AppCompatActivity {

    private ApiInterface mApiService;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private AdapterRetrofit mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_retrofit);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv);

        mLayoutManager = new LinearLayoutManager(SampleRetrofit.this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        // createProduct("2", "Newly added ", "100", "Something should update");
        getAllProducts();

    }



    /*CURD Sample operations*/

    /*Create a product */
    private void createProduct(String pid, String name, String price, String description) {

        mApiService = ApiClient.getCurdClient().create(ApiInterface.class);

        ProductModel productModel = new ProductModel(pid, name, price, description, "", "");

        Call<ResponseModel> call = mApiService.createProduct(productModel);


        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                int statusCode = response.code();
                ResponseModel responseModel = response.body();

                Toast.makeText(SampleRetrofit.this, " CreateProduct " + responseModel.getMessage(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                // Log error here since request failed
                Log.e("", t.toString());
            }

        });
    }

    /*update a product */
    private void updateProduct(String pid, String name, String price, String description) {

        mApiService = ApiClient.getCurdClient().create(ApiInterface.class);

        Call<ResponseModel> call = mApiService.updateProduct(pid, pid, name, price, description);

        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                int statusCode = response.code();
                ResponseModel responseModel = response.body();

                Toast.makeText(SampleRetrofit.this, "updateProduct " + responseModel.getSuccess(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                // Log error here since request failed
                Log.e("", t.toString());
            }

        });
    }

    /*Get all products */
    private void getAllProducts() {


        mApiService = ApiClient.getCurdClient().create(ApiInterface.class);

        Call<ProductResponse> call = mApiService.getProductDetail();

        call.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                int statusCode = response.code();
                List<ProductModel> movies = response.body().getProducts();

                Toast.makeText(SampleRetrofit.this, "" + movies.size(), Toast.LENGTH_SHORT).show();

                mAdapter = new AdapterRetrofit(movies);

                // Set CustomAdapter as the adapter for RecyclerView.
                mRecyclerView.setAdapter(mAdapter);

                mAdapter.setOnEntryClickListener(new AdapterRetrofit.OnEntryClickListener() {
                    @Override
                    public void onEntryClick(View view, int position) {

                        TextView tv = (TextView) view.findViewById(R.id.text);
                        String text = tv.getText().toString();

                        Toast.makeText(SampleRetrofit.this, text + "" + position, Toast.LENGTH_SHORT).show();
                    }
                });

            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e("", t.toString());
            }

        });
    }

    /*Delete product*/
    private void deleteProduct(String pid) {

        Call<ResponseModel> call = mApiService.deleteProduct(pid);

        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                int statusCode = response.code();
                ResponseModel responseModel = response.body();

                Toast.makeText(SampleRetrofit.this, "deleteProduct " + responseModel.getSuccess(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                // Log error here since request failed
                Log.e("", t.toString());
            }

        });

    }


}
