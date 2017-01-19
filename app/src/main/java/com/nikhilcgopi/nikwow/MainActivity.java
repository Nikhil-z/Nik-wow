package com.nikhilcgopi.nikwow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.nikhilcgopi.nikwow.model.ProductModel;
import com.nikhilcgopi.nikwow.model.ProductResponse;
import com.nikhilcgopi.nikwow.network.rest.ApiClient;
import com.nikhilcgopi.nikwow.network.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /* ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<ContactResponse> call = apiService.getContactDetail();

        call.enqueue(new Callback<ContactResponse>() {
            @Override
            public void onResponse(Call<ContactResponse> call, Response<ContactResponse> response) {
                int statusCode = response.code();
                List<ContactModel> movies = response.body().getResults();

                Toast.makeText(MainActivity.this, "" + movies.get(0).getPhone().getMobile(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<ContactResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e("", t.toString());
            }

        });*/

        ApiInterface apiService =
                ApiClient.getCurdClient().create(ApiInterface.class);

        Call<ProductResponse> call = apiService.getProductDetail();

        call.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                int statusCode = response.code();
                List<ProductModel> movies = response.body().getProducts();

                Toast.makeText(MainActivity.this, "" + movies.get(0).getName(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e("", t.toString());
            }

        });

           String TAG_PID = "pid";
           String TAG_NAME = "name";
           String TAG_PRICE = "price";
           String TAG_DESCRIPTION = "description";

    }
}
