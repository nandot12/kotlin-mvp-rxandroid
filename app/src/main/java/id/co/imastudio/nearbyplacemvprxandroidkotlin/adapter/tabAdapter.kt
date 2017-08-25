package id.co.imastudio.nearbyplacemvprxandroidkotlin.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import id.co.imastudio.nearbyplacemvprxandroidkotlin.Fragment.HospitalFragment
import id.co.imastudio.nearbyplacemvprxandroidkotlin.Fragment.HotelFragment
import id.co.imastudio.nearbyplacemvprxandroidkotlin.Fragment.RestaurantFragment

/**
 * Created by nandoseptianhusni on 8/25/17.
 */
class tabAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {

       if(position == 0){
           return HotelFragment()
       }
        else if ( position == 1){
           return RestaurantFragment()
       }
        else {
           return HospitalFragment()
       }
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {

        return 3
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}