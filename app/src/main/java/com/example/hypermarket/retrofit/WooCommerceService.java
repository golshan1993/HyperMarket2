package com.example.hypermarket.retrofit;

import com.example.hypermarket.model.Product;
import com.example.hypermarket.retrofit.model.CommerceResponse;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface WooCommerceService {
    @GET("wp-json/wc/v3/products")
    Call<List<CommerceResponse>> listItems(@QueryMap Map<String, String> options);
}
