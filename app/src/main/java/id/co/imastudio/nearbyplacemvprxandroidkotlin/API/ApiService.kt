package id.co.imastudio.nearbyplacemvprxandroidkotlin.API

import id.co.imastudio.nearbyplacemvprxandroidkotlin.POJO.ResponseJSON
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by nandoseptianhusni on 8/25/17.
 */
interface ApiService {

    @GET("json")
    fun request_nearby(
            @Query("location") location : String ,
            @Query("radius") radius : Int ,
            @Query("type") type : String ,
            @Query("key") key : String

    //proses emit to observable
    ) :Observable<ResponseJSON>
}