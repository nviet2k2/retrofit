package com.example.myapplication.Service;

import com.example.myapplication.Model.Brand;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("todos")
    Call<List<Brand>>getAllBrands(@Query("userId") int userId);
}