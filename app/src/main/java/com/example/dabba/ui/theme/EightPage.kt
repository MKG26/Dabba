package com.example.dabba.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.BikeScooter
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.ThumbUpOffAlt
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dabba.R

@Composable
fun EightPage() {

    Column {
        Column(
            modifier = Modifier.padding(start = 12.dp)
        ) {

            // back and notification
            Row {

                Card(
                    shape = RoundedCornerShape(
                        topEnd = 300.dp,
                        topStart = 300.dp,
                        bottomEnd = 300.dp,
                        bottomStart = 300.dp
                    ),
//                            modifier = Modifier.padding(top = 10.dp),

                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFF77905), //Card background color
                    ),

                    modifier = Modifier
                        .padding(top = 20.dp)
                        .shadow(
                            elevation = 10.dp,
                            shape = RoundedCornerShape(20.dp),
                        ),

                    )
                {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = null,
                        tint = Color(0xFF000000),
                        modifier = Modifier
                            .width(40.dp)
                            .height(40.dp),
                    )
                }

                Text(
                    text = stringResource(id = R.string.notification),
                    color = Color(0xFF000000),
                    fontFamily = poppinsFamily,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(
                            start = 20.dp, bottom = 0.dp, top = 15.dp
                        )
                )

            }
        }

        Spacer(modifier = Modifier.height(45.dp))

        Box(
            modifier = Modifier.fillMaxWidth()
                .background(color = Color(0xFFE3EAF2))
                .height(120.dp),

            ) {
            Row(
                modifier = Modifier.padding(top = 30.dp, start = 12.dp)
            ) {

                Card(
                    shape = RoundedCornerShape(
                        topEnd = 300.dp,
                        topStart = 300.dp,
                        bottomEnd = 300.dp,
                        bottomStart = 300.dp
                    ),
//                            modifier = Modifier.padding(top = 10.dp),

                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFF77905), //Card background color
                    ),

                    modifier = Modifier
//                        .padding(top = 20.dp)
//                    .shadow(
//                        elevation = 6.dp,
//                        shape = RoundedCornerShape(20.dp),
//                    )
                        .height(60.dp)
                        .width(60.dp),

                    )
                {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Icon(
                            imageVector = Icons.Default.BikeScooter,
                            contentDescription = null,
                            tint = Color(0xFF000000),
                            modifier = Modifier
                                .width(45.dp)
                                .height(45.dp)
                                .padding(start = 9.dp),
                        )
                    }

                }

                Spacer(modifier = Modifier.width(15.dp))

                Column {
                    Text(
                        text = stringResource(id = R.string.txtWay1),
                        color = Color(0xFF000000),
                        fontFamily = poppinsFamily,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .padding(top = 5.dp)
                    )

                    Text(
                        text = stringResource(id = R.string.txtWay2),
                        color = Color(0xFFFF7A00),
                        fontFamily = poppinsFamily,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Light,

                        )
                }

            }


        }

        Row(
            modifier = Modifier.padding(top = 20.dp, start = 12.dp)
        ) {

            Card(
                shape = RoundedCornerShape(
                    topEnd = 300.dp,
                    topStart = 300.dp,
                    bottomEnd = 300.dp,
                    bottomStart = 300.dp
                ),
//                            modifier = Modifier.padding(top = 10.dp),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFF77905), //Card background color
                ),

                modifier = Modifier
                    .padding(top = 20.dp)
//                    .shadow(
//                        elevation = 6.dp,
//                        shape = RoundedCornerShape(20.dp),
//                    )
                    .height(60.dp)
                    .width(60.dp),

                )
            {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = Color(0xFF000000),
                        modifier = Modifier
                            .width(45.dp)
                            .height(45.dp)
                            .padding(start = 9.dp),
                    )
                }

            }

            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(
                    text = stringResource(id = R.string.tiffinDel1),
                    color = Color(0xFF000000),
                    fontFamily = poppinsFamily,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(top = 18.dp)
                )

                Text(
                    text = stringResource(id = R.string.tiffinDel2),
                    color = Color(0xFFACACAC),
                    fontFamily = poppinsFamily,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,

                    )
            }

        }

        Row(
            modifier = Modifier.padding(top = 20.dp, start = 12.dp)
        ) {

            Card(
                shape = RoundedCornerShape(
                    topEnd = 300.dp,
                    topStart = 300.dp,
                    bottomEnd = 300.dp,
                    bottomStart = 300.dp
                ),
//                            modifier = Modifier.padding(top = 10.dp),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFF77905), //Card background color
                ),

                modifier = Modifier
                    .padding(top = 20.dp)
//                    .shadow(
//                        elevation = 6.dp,
//                        shape = RoundedCornerShape(20.dp),
//                    )
                    .height(60.dp)
                    .width(60.dp),

                )
            {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Icon(
                        imageVector = Icons.Default.ThumbUpOffAlt,
                        contentDescription = null,
                        tint = Color(0xFF000000),
                        modifier = Modifier
                            .width(45.dp)
                            .height(45.dp)
                            .padding(start = 9.dp),
                    )
                }

            }

            Spacer(modifier = Modifier.width(15.dp))

            Column {
                Text(
                    text = stringResource(id = R.string.subs1),
                    color = Color(0xFF000000),
                    fontFamily = poppinsFamily,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(top = 18.dp)
                )

                Text(
                    text = stringResource(id = R.string.subs2),
                    color = Color(0xFFACACAC),
                    fontFamily = poppinsFamily,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,

                    )
                Text(
                    text = stringResource(id = R.string.subs3, 5, 2025),
                    color = Color(0xFFACACAC),
                    fontFamily = poppinsFamily,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,

                    )
            }
        }
    }
}



@Preview
@Composable
private fun EightPreview() {
    EightPage()
}