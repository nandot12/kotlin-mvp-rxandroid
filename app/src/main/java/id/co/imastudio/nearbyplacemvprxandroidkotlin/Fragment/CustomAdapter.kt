package id.co.imastudio.nearbyplacemvprxandroidkotlin.Fragment

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import id.co.imastudio.nearbyplacemvprxandroidkotlin.POJO.Result
import id.co.imastudio.nearbyplacemvprxandroidkotlin.R

/**
 * Created by nandoseptianhusni on 8/25/17.
 */
class CustomAdapter : RecyclerView.Adapter<CustomAdapter.MyHolder> {
    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.textnama?.setText(data?.get(position)!!.name)

        Glide.with(c).load(data?.get(position)!!.icon).into(holder?.img)
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {

        var inflater= LayoutInflater.from(c).inflate(R.layout.custom_list,parent,false)


        return MyHolder(inflater)

       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {

        return data!!.size
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var data : List<Result>? = null
    var c : FragmentActivity? = null

    constructor(data: List<Result>?, c: FragmentActivity) {
        this.data = data
        this.c = c
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var img = itemView?.findViewById(R.id.img) as ImageView
        var textnama = itemView?.findViewById(R.id.txtname) as TextView

    }
}