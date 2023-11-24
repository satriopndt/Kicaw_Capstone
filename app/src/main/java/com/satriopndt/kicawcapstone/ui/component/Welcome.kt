package com.satriopndt.kicawcapstone.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.satriopndt.kicawcapstone.R
import com.satriopndt.kicawcapstone.ui.theme.KicawCapstoneTheme

@Composable
fun Welcome(
    photoUrl: Int,
    title: String,
    modifier: Modifier = Modifier
){
    Column(
        modifier = Modifier
    ) {
        Image(painter = painterResource(R.drawable.gliter_sky), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(24.dp)))
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview(){
    KicawCapstoneTheme {
        Welcome(
            photoUrl = R.drawable.gliter_sky,
            title = "Welcome to .."
        )
    }
}