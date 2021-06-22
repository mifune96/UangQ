package id.dotdevs.app.uangq

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMain
    private val fm:FragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpBottomNav()
    }

    private fun setUpBottomNav() {
//        fm.beginTransaction().add(R.id.container).show("")
    }
}