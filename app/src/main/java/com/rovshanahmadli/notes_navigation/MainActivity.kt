package com.rovshanahmadli.notes_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun getNavControllerViaFragment(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragmentView) as NavHostFragment
        val navController = navHostFragment.navController
    }
}