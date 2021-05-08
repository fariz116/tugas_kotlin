package com.ilhamfidatama.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragmentMovie = MovieFragment()
        val fragment = supportFragmentManager.findFragmentByTag(MovieFragment::class.java.simpleName)

        if(fragment !is MovieFragment){
            supportFragmentManager.beginTransaction()
                .add(R.id.home_layout, fragmentMovie, MovieFragment::class.java.simpleName)
                .commit()
        }

//        supportFragmentManager.beginTransaction()
//                .add(R.id.fragment_movie, MovieFragment())
//                .commit()

    }
}