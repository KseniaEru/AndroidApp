package ru.belogubaksenia

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiRet {
    @POST("user/login")
    fun getAuth(@Body hashMap: HashMap<String,String>):Call<login>
    @GET("feelings")
    fun getFeel():Call<feelings>
    @GET("quotes")
    fun getQuotes():Call<quotes>
}