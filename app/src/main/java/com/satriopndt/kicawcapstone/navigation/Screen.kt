package com.satriopndt.kicawcapstone.navigation

sealed class Screen(val route: String){
    object Home: Screen("home")
    object Scan: Screen("scan")
    object Forum: Screen("forum")
    object DetailBirds: Screen("home/{birdId}"){
        fun createRoute(birdId: Long) = "home/${birdId}"
    }

}
