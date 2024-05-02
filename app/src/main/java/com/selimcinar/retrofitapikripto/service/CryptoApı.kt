package com.selimcinar.retrofitapikripto.service

import com.selimcinar.retrofitapikripto.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoApı {
    //Get,Post,Update,Delete
    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json
   // @GET ("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
//    fun getData(): Call<List<CryptoModel>>

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Observable<List<CryptoModel>>
}