package com.satriopndt.kicawcapstone.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.satriopndt.kicawcapstone.R
import com.satriopndt.kicawcapstone.ui.component.BottomBar
import com.satriopndt.kicawcapstone.ui.component.SearchBar
import com.satriopndt.kicawcapstone.ui.component.Welcome
import com.satriopndt.kicawcapstone.ui.theme.KicawCapstoneTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navigateToDetail: (Long) -> Unit,
) {

}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeContent(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding()) {

        Column(
            modifier = Modifier
        ) {
            Welcome()
            Row(horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                SearchBar()
                IconButton(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(12.dp)),
//                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        modifier = Modifier
                            .size(35.dp),
                        imageVector = Icons.Default.History,
                        contentDescription = "History",

                    )
                }
            }
        }

    }

//
//    LazyVerticalStaggeredGrid(
//        columns = StaggeredGridCells,
//        contentPadding = PaddingValues(16.dp),
//        horizontalArrangement = Arrangement.spacedBy(16.dp),
//        verticalItemSpacing = 8.dp,
//        modifier = modifier
//    ) {
//
//    }


    androidx.compose.material.Scaffold(
        bottomBar = { BottomBar(navController = navController) },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                backgroundColor = colorResource(id = R.color.white)
            ) {
                androidx.compose.material3.Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.baseline_camera_alt_24),
                    contentDescription = "Scan"
                )
            }
        },
        floatingActionButtonPosition = androidx.compose.material.FabPosition.Center,
        isFloatingActionButtonDocked = true,
        scaffoldState = scaffoldState
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,

            ) {

        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    KicawCapstoneTheme {
        HomeContent()
    }
}