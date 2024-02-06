package com.example.dabba.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.sharp.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.dabba.R
import com.example.dabba.presentation.sign_in.UserData
import com.example.dabba.ui.theme.poppinsFamily
import com.example.firstpage.ui.theme.thirdPage
import java.sql.Types.NULL
@Composable
fun tiffinService(
    modifier: Modifier = Modifier,


    ) {
    Box(
        modifier = modifier
            .requiredWidth(width = 400.dp)
            .requiredHeight(height = 900.dp)
            .background(color = Color.White)
            .padding(start = 25.dp, top = 40.dp)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 5.dp,
                    y = 24.dp)
                .requiredWidth(width = 42.dp)
                .requiredHeight(height = 39.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 42.dp)
                    .requiredHeight(height = 39.dp)
                    )
            Image(
                painter = painterResource(id = R.drawable.screenshot_2024_02_06_at_9_44_26am),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {  }
            )
        }
        Text(
            text = "Tiffin Service",
            color = Color.Black,
            lineHeight = 3.21.em,
            style = TextStyle(
                fontSize = 36.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 103.dp)
                .requiredWidth(width = 229.dp)
                .requiredHeight(height = 48.dp))
        Icon(
            imageVector = Icons.Filled.Favorite,
            tint = Color(0xffff7a00),
            contentDescription = "icon \"heart\"",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 276.dp,
                    y = 24.dp)
                .requiredWidth(width = 30.dp)
                .requiredHeight(height = 30.dp)
        )
        Icon(
            imageVector = Icons.Outlined.Share,
            contentDescription = "share-link--share-transmit",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 321.dp,
                    y = 24.dp)
                .requiredWidth(width = 30.dp)
                .requiredHeight(height = 30.dp)
        )
        Text(
            text = "Greater Noida",
            color = Color.Black.copy(alpha = 0.55f),
            lineHeight = 7.23.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 151.dp))
        Text(
            text = "12 pm-3 pm | 7 pm-11 pm",
            color = Color.Black.copy(alpha = 0.55f),
            lineHeight = 7.23.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 177.dp))
        Text(
            text = "1.5 km away",
            color = Color.Black.copy(alpha = 0.55f),
            lineHeight = 7.23.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 203.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 302.dp,
                    y = 114.dp)
                .requiredWidth(width = 44.dp)
                .requiredHeight(height = 20.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 44.dp)
                    .requiredHeight(height = 19.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(color = Color.Black))
            Image(
                painter = painterResource(id = R.drawable.doublearrow),
                contentDescription = "star-1--reward-rating-rate-social-star-media-favorite-like-stars",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 30.dp,
                        y = 5.dp)
                    .requiredWidth(width = 7.dp)
                    .requiredHeight(height = 7.dp))
            Text(
                text = "4.2",
                color = Color(0xffff7a00),
                lineHeight = 10.52.em,
                style = TextStyle(
                    fontSize = 11.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 10.dp,
                        y = 3.dp)
                    .requiredWidth(width = 24.dp)
                    .requiredHeight(height = 17.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 255.dp)
                .requiredWidth(width = 76.dp)
                .requiredHeight(height = 57.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color(0xffe3eaf2)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 101.dp,
                    y = 255.dp)
                .requiredWidth(width = 76.dp)
                .requiredHeight(height = 57.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color(0xffe3eaf2)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 185.dp,
                    y = 255.dp)
                .requiredWidth(width = 76.dp)
                .requiredHeight(height = 57.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color(0xffe3eaf2)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 270.dp,
                    y = 255.dp)
                .requiredWidth(width = 76.dp)
                .requiredHeight(height = 57.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color(0xffe3eaf2)))
        Text(
            text = "View All",
            color = Color.Black,
            lineHeight = 8.26.em,
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 280.dp,
                    y = 276.dp)
                .requiredWidth(width = 56.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 344.dp)
                .requiredWidth(width = 330.dp)
                .requiredHeight(height = 49.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 165.dp,
                        y = 0.dp)
                    .requiredWidth(width = 165.dp)
                    .requiredHeight(height = 49.dp)
                    .clip(shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                    .rotate(degrees = -180f)
                    .background(color = Color(0xffff7a00).copy(alpha = 0.32f)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 165.dp)
                    .requiredHeight(height = 49.dp)
                    .clip(shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp))
                    .background(color = Color(0xffff7a00)))
        }
        Text(
            text = "Breakfast",
            color = Color.Black,
            lineHeight = 4.82.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 419.dp))
        Text(
            text = "Order now",
            color = Color.Black,
            lineHeight = 7.23.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 61.dp,
                    y = 359.dp))
        Text(
            text = "Subscribe",
            color = Color.Black,
            lineHeight = 7.23.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 225.dp,
                    y = 359.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 466.dp)
                .requiredWidth(width = 330.dp)
                .requiredHeight(height = 80.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xffe3eaf2)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 558.dp)
                .requiredWidth(width = 330.dp)
                .requiredHeight(height = 80.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xffe3eaf2)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 650.dp)
                .requiredWidth(width = 330.dp)
                .requiredHeight(height = 80.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xffe3eaf2)))
        Text(
            text = "Mini Tiffin",
            color = Color.Black,
            lineHeight = 7.23.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 25.dp,
                    y = 479.dp))
        Text(
            text = "Regular Tiffin",
            color = Color.Black,
            lineHeight = 7.23.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 25.dp,
                    y = 572.dp))
        Text(
            text = "Jumbo Tiffin",
            color = Color.Black,
            lineHeight = 7.23.em,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 25.dp,
                    y = 664.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 270.dp,
                    y = 490.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 31.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 66.dp)
                    .requiredHeight(height = 31.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color(0xffff7a00).copy(alpha = 0.32f)))
            Text(
                text = "Add +",
                color = Color.Black,
                lineHeight = 7.23.em,
                style = TextStyle(
                    fontSize = 16.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 16.dp,
                        y = 6.dp)
                    .requiredWidth(width = 50.dp))
            Text(
                text = "-",
                color = Color.Black,
                lineHeight = 5.78.em,
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 3.dp,
                        y = 4.dp)
                    .requiredWidth(width = 9.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 270.dp,
                    y = 674.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 31.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 66.dp)
                    .requiredHeight(height = 31.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color(0xffff7a00).copy(alpha = 0.32f)))
            Text(
                text = "Add +",
                color = Color.Black,
                lineHeight = 7.23.em,
                style = TextStyle(
                    fontSize = 16.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 16.dp,
                        y = 6.dp)
                    .requiredWidth(width = 48.dp))
            Text(
                text = "-",
                color = Color.Black,
                lineHeight = 5.78.em,
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 3.dp,
                        y = 4.dp)
                    .requiredWidth(width = 9.dp))
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun TiffinServicePreview() {
    tiffinService(Modifier)
}