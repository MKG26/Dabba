package com.example.dabba.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.sharp.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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


data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int? = null
)


@Composable
fun fifthPage(
    onClick: () -> Unit,
    onPclick: () -> Unit
)
{


    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }

    var amountInput by remember {
        mutableStateOf("")
    }

    Column{

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp),
            shape = RoundedCornerShape(bottomEnd = 45.dp, bottomStart = 45.dp),
//                            modifier = Modifier.padding(top = 10.dp),

            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF000000), //Card background color
            ),

            ){

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(start = 10.dp, end = 10.dp, top = 40.dp)
            ){
                // Hamburger icon
                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Filled.Menu,
                        contentDescription = null,
                        tint = Color(0xFFD8D8D8),
                        modifier = Modifier
                            .width(40.dp)
                            .height(40.dp),
                    )
                }


                Text(
                    text = stringResource(id = R.string.appBig),
                    color = Color(0xFFFF7A00),
                    fontFamily = poppinsFamily,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(bottom = 0.dp,
                        )
                )

                // Notification Icon
                IconButton(onClick = {

                }) {
                    Icon(
                        imageVector = Icons.Filled.Notifications,
                        contentDescription = null,
                        tint = Color(0xFFEAE3F2),
                        modifier = Modifier
                            .width(30.dp)
                            .height(40.dp),
                    )
                }

            }

        }


        Column (
            modifier = Modifier.padding(start = 10.dp)
        ){

            //Text - Hi , John Doe
            Text(
                text = stringResource(id = R.string.hiJohn),
                color = Color(0xFF000000),
                fontFamily = poppinsFamily,
                fontSize = 23.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .padding(top = 20.dp, bottom = 20.dp, start = 10.dp
                    )
            )


            // SEARCH BAR
            customTextField1(
                value = amountInput,
                onValueChange = { amountInput = it }
            )

            // DIVIDER - TIFFINS NEAR ME.
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.Start)
                    .offset(
                        x = 10.dp,
                        y = 411.dp
                    )
                    .requiredWidth(width = 200.dp)
                    .requiredHeight(height = 17.dp)

            ) {

                Divider(
                    color = Color.Black.copy(alpha = 0.22f),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 0.dp,
                            y = 12.dp
                        )
                        .requiredWidth(width = 155.dp))

                Text(
                    text = stringResource(id = R.string.tiffinsNear),
                    color = Color.Black.copy(alpha = 0.22f),
                    lineHeight = 7.71.em,
                    style = TextStyle(
                        fontSize = 15.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 163.15618896484375.dp,
                            y = 0.dp
                        )
                        .requiredWidth(width = 16.dp))
                
                Divider(
                    color = Color.Black.copy(alpha = 0.22f),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 186.31381225585938.dp,
                            y = 12.dp
                        )
                        .requiredWidth(width = 154.dp))
                

                
            }



            // Row - Sort and rating
            Row(){
                Box (
                    modifier = Modifier
                        .padding(end = 10.dp, bottom = 20.dp)
                        .background(
                            color = Color(0xFFE3EAF2),
                            shape = RoundedCornerShape(size = 20.dp)
                        )

                ){

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = { }) {
                            Icon(
                                painter = painterResource(
                                    id = R.drawable.doublearrow
                                ),
                                contentDescription = null,
                                tint = Color(0xFF000000),
                                modifier = Modifier
                                    .width(20.dp)
                                    .height(30.dp),
                            )
                        }


                        Text(
                            text = stringResource(id = R.string.sort),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
//                            modifier = Modifier
//                                .padding(
//                                    start = 10.dp
//                                )
                        )

                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Filled.ArrowDropDown,
                                contentDescription = null,
                                tint = Color(0xFF000000),
                                modifier = Modifier
                                    .width(50.dp)
                                    .height(60.dp),
                            )
                        }

                    }
                }

                Box (
                    modifier = Modifier
                        .padding(end = 10.dp, bottom = 20.dp)
                        .background(
                            color = Color(0xFFE3EAF2),
                            shape = RoundedCornerShape(size = 20.dp)
                        )

                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = stringResource(id = R.string.rating,4.0),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .padding(
                                    all = 10.dp
                                )
                        )
                    }
                }
            }


            // Tiffin SERVICES CARDS
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
                    .padding(end = 10.dp),
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp, bottomEnd = 20.dp, bottomStart = 20.dp),
//                            modifier = Modifier.padding(top = 10.dp),

                onClick = onClick,

                colors = ButtonDefaults.buttonColors( Color(0xFFE1E9EC))
            ) {


                Column() {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = stringResource(id = R.string.tiffinService1, 1),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 15.dp, bottom = 20.dp, start = 10.dp
                                )
                        )

                        Spacer(modifier = Modifier.width(130.dp))

                        Row(
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier.padding(top = 6.dp)
                        )
                        {
                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Filled.FavoriteBorder,
                                    contentDescription = null,
                                    tint = Color(0xFF000000),
                                    modifier = Modifier
                                        .width(40.dp)
                                        .height(35.dp),
                                )
                            }

                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Filled.MoreVert,
                                    contentDescription = null,
                                    tint = Color(0xFF000000),
                                    modifier = Modifier
                                        .width(40.dp)
                                        .height(35.dp),
                                )
                            }


                        }


                    }

                    Spacer(modifier = Modifier.height(45.dp))
//                    Spacer(modifier = Modifier.width(230.dp))

                    // Rating Card 4.0
                    Card(
                        modifier = Modifier
                            .height(40.dp)
                            .width(120.dp)
                            .padding(end = 20.dp)
                            .align(Alignment.End),
                        shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topEnd = 20.dp, topStart = 20.dp),
//                            modifier = Modifier.padding(top = 10.dp),

                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000),)
                    ){
                        Row(horizontalArrangement = Arrangement.Center){
                            Text(
                                text = stringResource(id = R.string.cardRatingOne, 4.5),
                                color = Color(0xFFFF7A00),
                                fontFamily = poppinsFamily,
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier
                                    .padding(
                                        top = 4.dp, bottom = 4.dp, start = 15.dp
                                    )
                            )
                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Outlined.Star,
                                    contentDescription = null,
                                    tint = Color(0xFFFF7A00),
                                    modifier = Modifier
                                        .width(35.dp)
                                        .height(25.dp)
                                        .padding(end = 10.dp),
                                )
                            }
                        }
                    }
                }

              }


            // Tiffin SERVICES CARD - 2
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
                    .padding(top = 10.dp,end = 10.dp),
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp, bottomEnd = 20.dp, bottomStart = 20.dp),
//                            modifier = Modifier.padding(top = 10.dp),

                onClick = onClick,

                colors = ButtonDefaults.buttonColors( Color(0xFFE1E9EC))
            )  {

                Column() {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = stringResource(id = R.string.tiffinService2,2, 1),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 15.dp, bottom = 20.dp, start = 10.dp
                                )
                        )

                        Spacer(modifier = Modifier.width(130.dp))

                        Row(
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier.padding(top = 6.dp)
                        )
                        {
                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Filled.FavoriteBorder,
                                    contentDescription = null,
                                    tint = Color(0xFF000000),
                                    modifier = Modifier
                                        .width(40.dp)
                                        .height(35.dp),
                                )
                            }

                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Filled.MoreVert,
                                    contentDescription = null,
                                    tint = Color(0xFF000000),
                                    modifier = Modifier
                                        .width(40.dp)
                                        .height(35.dp),
                                )
                            }


                        }


                    }

                    Spacer(modifier = Modifier.height(35.dp))
//                    Spacer(modifier = Modifier.width(230.dp))

                    // Rating Card 4.0
                    Card(
                        modifier = Modifier
                            .height(40.dp)
                            .width(120.dp)
                            .padding(end = 20.dp)
                            .align(Alignment.End),
                        shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topEnd = 20.dp, topStart = 20.dp),
//                            modifier = Modifier.padding(top = 10.dp),

                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000),)
                    ){
                        Row(horizontalArrangement = Arrangement.Center){
                            Text(
                                text = stringResource(id = R.string.cardRatingOne, 4.2),
                                color = Color(0xFFFF7A00),
                                fontFamily = poppinsFamily,
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier
                                    .padding(
                                        top = 4.dp, bottom = 4.dp, start = 15.dp
                                    )
                            )
                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Outlined.Star,
                                    contentDescription = null,
                                    tint = Color(0xFFFF7A00),
                                    modifier = Modifier
                                        .width(35.dp)
                                        .height(25.dp)
                                        .padding(end = 10.dp),
                                )
                            }
                        }
                    }
                }

            }

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(top = 10.dp,end = 10.dp),
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp, bottomEnd = 20.dp, bottomStart = 20.dp),
//                            modifier = Modifier.padding(top = 10.dp),

                onClick = onPclick,

                colors = ButtonDefaults.buttonColors( Color(0xFFE1E9EC))
            )  {

                Column() {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = stringResource(id = R.string.tiffinService2,2, 1),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 15.dp, bottom = 20.dp, start = 10.dp
                                )
                        )

                        Spacer(modifier = Modifier.width(130.dp))

                        Row(
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier.padding(top = 6.dp)
                        )
                        {





                        }


                    }

                    Spacer(modifier = Modifier.height(35.dp))
//                    Spacer(modifier = Modifier.width(230.dp))

                    // Rating Card 4.0
                    Card(
                        modifier = Modifier
                            .height(40.dp)
                            .width(120.dp)
                            .padding(end = 20.dp)
                            .align(Alignment.End),
                        shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topEnd = 20.dp, topStart = 20.dp),
//                            modifier = Modifier.padding(top = 10.dp),

                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000),)
                    ){
                        Row(horizontalArrangement = Arrangement.Center){
                            Text(
                                text = stringResource(id = R.string.cardRatingOne, 4.2),
                                color = Color(0xFFFF7A00),
                                fontFamily = poppinsFamily,
                                fontSize = 23.sp,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier
                                    .padding(
                                        top = 4.dp, bottom = 4.dp, start = 15.dp
                                    )
                            )
                            IconButton(onClick = {}) {
                                Icon(
                                    imageVector = Icons.Outlined.Star,
                                    contentDescription = null,
                                    tint = Color(0xFFFF7A00),
                                    modifier = Modifier
                                        .width(35.dp)
                                        .height(25.dp)
                                        .padding(end = 10.dp),
                                )
                            }
                        }
                    }
                }

            }



            Spacer(modifier = Modifier.height(20.dp))

            //  Navigation Bar



//            NavigationBar (
//
//            ){
//                Card(
//                    modifier = Modifier
//                        .padding(end = 10.dp, bottom = 20.dp)    // search field padding.
//
//                        .height(50.dp),
//                    elevation = CardDefaults.cardElevation(
//                        defaultElevation = 10.dp
//                    ),
//                    colors = CardDefaults.cardColors(
//                        containerColor = Color(0xFFFF7A00), //Card background color
////                    contentColor = Color.White  //Card content color,e.g.text
//                    ),
//                ){
//
//                }
//            }

        }
    }
}



@Composable
fun customTextField1(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
) {


    BasicTextField(
        value = value,
        onValueChange = onValueChange,

//        textStyle = TextStyle(
//            fontSize = 20.sp
//        ),

        decorationBox = { innerTextField ->

                Box(
                    modifier = Modifier
                        .padding(end = 10.dp, bottom = 20.dp)    // search field padding.
                        .background(
                            color = Color(0xFFE3EAF2),
                            shape = RoundedCornerShape(size = 18.dp)
                        )
                        .height(50.dp)
                )
                {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 5.dp, horizontal = 10.dp),
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = null,
                            tint = Color(0xFF000000),
                            modifier = Modifier
                                .padding(end = 5.dp)
                                .height(35.dp)
                                .width(35.dp)
                        )

                        innerTextField()

                    }

                    if (value.isEmpty()) {
                        Text(
                            text = "Search",
                            fontSize =24.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = poppinsFamily,
                            color = Color(0xFF999999),

                            modifier = Modifier
                                .padding(start = 60.dp,top = 5.dp)
                        )
                    }
                }


        }
    )
}


@Preview(showBackground = true)
@Composable
private fun thirdPreview() {
    fifthPage(onClick = {} , onPclick = {})
}

