package id.co.imastudio.nearbyplacemvprxandroidkotlin.Model

import id.co.imastudio.nearbyplacemvprxandroidkotlin.POJO.Result

/**
 * Created by nandoseptianhusni on 8/25/17.
 */
interface ModelHotel {

        fun Success(data : List<Result>,status : String)

            fun Error(error : String)
}