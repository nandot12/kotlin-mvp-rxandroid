package id.co.imastudio.nearbyplacemvprxandroidkotlin.Presenter

import id.co.imastudio.nearbyplacemvprxandroidkotlin.Init.InitRetrofit
import id.co.imastudio.nearbyplacemvprxandroidkotlin.Model.ModelHotel
import id.co.imastudio.nearbyplacemvprxandroidkotlin.POJO.ResponseJSON
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by nandoseptianhusni on 8/25/17.
 */
class PresenterHotel {

    var model : ModelHotel? = null

    constructor(model: ModelHotel?) {
        this.model = model
    }


    fun getHotel(location : String ,radius : Int,type : String,key : String){


        InitRetrofit().getInstance()
                .request_nearby(location,radius,type,key)
                //create thread baru
                .subscribeOn(Schedulers.newThread())
                //kalau ada operator untuk pindah operator
                .observeOn(AndroidSchedulers.mainThread())

                .subscribe({
                    //hasil subcribe di observable
                    t: ResponseJSON? ->

                    var data = t?.results



                    var pesan = t?.status
                    if(data?.size!! > 0){

                        model?.Success(data, pesan!!)

                    }
                    else{
                        model?.Error(pesan!!)
                    }


                })



    }
}