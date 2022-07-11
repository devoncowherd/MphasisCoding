package com.example.mphasisq1.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

interface Retrofit {


    @GET("v1/57a3ba0c-621f-4ef5-bbf1-9d54411261ed")
    suspend fun getAllEmails() : ApiResponseItem

    companion object {
        val BASE_URL = "https://mocki.io/"

        fun getRetrofit() : Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create()
        }
    }

}