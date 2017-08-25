package id.co.imastudio.nearbyplacemvprxandroidkotlin.POJO

import com.google.gson.annotations.SerializedName


class ResponseJSON {

    @SerializedName("html_attributions")
    var htmlAttributions: List<Any>? = null
    @SerializedName("results")
    var results: List<Result>? = null
    @SerializedName("status")
    var status: String? = null

}
