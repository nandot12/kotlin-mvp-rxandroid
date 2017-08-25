package id.co.imastudio.nearbyplacemvprxandroidkotlin

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import id.co.imastudio.nearbyplacemvprxandroidkotlin.adapter.tabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //set icon and nama tabs
        tabs.addTab(tabs.newTab().setText("Hotel"))
        tabs.addTab(tabs.newTab().setText("Restaurant"))
        tabs.addTab(tabs.newTab().setText("Hospital"))

        //implementasi fragment each tabs

        var adapter = tabAdapter(supportFragmentManager)
        pager.adapter = adapter

        //ini kalau seandainya dari pagernya di geser tabnys juga ganti yaa .. hehehe
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))

        //tab nya klik fragmentnya juga berubah
        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
               // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
               // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {

                pager.setCurrentItem(tab?.position!!)
               // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }
}
