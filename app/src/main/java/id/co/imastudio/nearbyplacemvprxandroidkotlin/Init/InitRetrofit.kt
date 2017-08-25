package id.co.imastudio.nearbyplacemvprxandroidkotlin.Init

import id.co.imastudio.nearbyplacemvprxandroidkotlin.API.ApiService
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by nandoseptianhusni on 8/25/17.
 */
class InitRetrofit {


    fun getInit():Retrofit {

        return Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com/maps/api/place/nearbysearch/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()).build()

    }

    fun getInstance():ApiService{
        return getInit().create(ApiService::class.java)
    }

}