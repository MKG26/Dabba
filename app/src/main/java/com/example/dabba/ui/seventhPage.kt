package com.example.dabba.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dabba.R
import com.example.dabba.ui.theme.poppinsFamily
import org.w3c.dom.Text
@Composable
fun SixthPage() {

    Column {

        // back and account row
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

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),

                modifier = Modifier.padding(start = 12.dp, top = 20.dp)

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
                text = stringResource(id = R.string.account),
                color = Color(0xFF000000),
                fontFamily = poppinsFamily,
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(
                        start = 20.dp, bottom = 0.dp, top = 15.dp
                    )
            )

        }


        //profile card
        Card(
            shape = RoundedCornerShape(
                topEnd = 40.dp,
                topStart = 40.dp,
                bottomEnd = 40.dp,
                bottomStart = 40.dp
            ),
//                            modifier = Modifier.padding(top = 10.dp),

            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF77905), //Card background color
            ),

            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp,
            ),

            modifier = Modifier
                .padding(start = 15.dp, top = 30.dp, end = 15.dp)
                .height(150.dp)
                .fillMaxWidth()

        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(top = 10.dp)
//                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(

                ) {

                    Image(
                        painter = painterResource(id = R.drawable.screenshot_2024_02_06_at_11_31_29am),
                        contentDescription = null,
                        modifier = Modifier
                            .size(120.dp)
                            .padding(top = 15.dp, start = 30.dp)
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {

                        Text(
                            text = stringResource(id = R.string.accName),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 25.dp, start = 35.dp
                                )
                        )

//                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = stringResource(id = R.string.editProfile),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 19.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier.padding(bottom = 25.dp, start = 40.dp)
                        )

                    }
                }
            }
        }


        // cards of different functionalities
        Column {

            Spacer(modifier = Modifier.height(20.dp))
            // card 1
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .padding(start = 18.dp, end = 18.dp, top = 0.dp)
                    .shadow(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(20.dp),
                    ),

//                shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp, topStart = 20.dp, topEnd = 20.dp),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE3EAF2), //Card background color
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row() {
                        Icon(
                            imageVector = Icons.Outlined.Settings,
                            contentDescription = null,
                            tint = Color(0xFFFF7A00),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )

                        Spacer(modifier = Modifier.padding(start = 10.dp))
                        // card text
                        Text(
                            text = stringResource(id = R.string.card1),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 3.dp,
                                )
                        )
                    }

                    // suffix Icon Button
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color(0xFF000000),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )
                    }
                }

            }


            Spacer(modifier = Modifier.height(10.dp))
            // card 2
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .padding(start = 18.dp, end = 18.dp, top = 0.dp)
                    .shadow(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(20.dp),
                    ),


                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE3EAF2), //Card background color
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row() {
                        Icon(
                            imageVector = Icons.Outlined.ShoppingCart,
                            contentDescription = null,
                            tint = Color(0xFFFF7A00),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )

                        Spacer(modifier = Modifier.padding(start = 10.dp))
                        // card text
                        Text(
                            text = stringResource(id = R.string.card2),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 3.dp,
                                )
                        )
                    }

                    // suffix Icon Button
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color(0xFF000000),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )
                    }
                }

            }

            //card 3
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .padding(start = 18.dp, end = 18.dp, top = 0.dp)
                    .shadow(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(20.dp),
                    ),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE3EAF2), //Card background color
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row() {
                        Icon(
                            imageVector = Icons.Outlined.Edit,
                            contentDescription = null,
                            tint = Color(0xFFFF7A00),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )

                        Spacer(modifier = Modifier.padding(start = 10.dp))
                        // card text
                        Text(
                            text = stringResource(id = R.string.card3),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 3.dp,
                                )
                        )
                    }

                    // suffix Icon Button
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color(0xFF000000),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )
                    }
                }

            }

            //card 4
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .padding(start = 18.dp, end = 18.dp, top = 0.dp)
                    .shadow(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(20.dp),
                    ),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE3EAF2), //Card background color
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row() {
                        Icon(
                            imageVector = Icons.Outlined.AddCircle,
                            contentDescription = null,
                            tint = Color(0xFFFF7A00),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )

                        Spacer(modifier = Modifier.padding(start = 10.dp))
                        // card text
                        Text(
                            text = stringResource(id = R.string.card4),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 3.dp,
                                )
                        )
                    }

                    // suffix Icon Button
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color(0xFF000000),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )
                    }
                }

            }

            //card 5
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .padding(start = 18.dp, end = 18.dp, top = 0.dp)
                    .shadow(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(20.dp),
                    ),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE3EAF2), //Card background color
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row() {
                        Icon(
                            imageVector = Icons.Outlined.Call,
                            contentDescription = null,
                            tint = Color(0xFFFF7A00),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )

                        Spacer(modifier = Modifier.padding(start = 10.dp))
                        // card text
                        Text(
                            text = stringResource(id = R.string.card5),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 3.dp,
                                )
                        )
                    }

                    // suffix Icon Button
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color(0xFF000000),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )
                    }
                }

            }

            //card 6
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .padding(start = 18.dp, end = 18.dp, top = 0.dp)
                    .shadow(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(20.dp),
                    ),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE3EAF2), //Card background color
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row() {
                        Icon(
                            imageVector = Icons.Outlined.Notifications,
                            contentDescription = null,
                            tint = Color(0xFFFF7A00),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )

                        Spacer(modifier = Modifier.padding(start = 10.dp))
                        // card text
                        Text(
                            text = stringResource(id = R.string.card6),
                            color = Color(0xFF000000),
                            fontFamily = poppinsFamily,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(
                                    top = 3.dp,
                                )
                        )
                    }

                    // suffix Icon Button
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color(0xFF000000),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .padding(start = 5.dp),
                        )
                    }
                }

            }

            //card 7
            Spacer(modifier = Modifier.height(10.dp))

        }


        @Composable
        fun AccountCard(
            cardText: Int,
            prefixIcon: ImageVector,
            suffixIcon: ImageVector,
        ) {
            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(140.dp)
                    .padding(start = 10.dp, end = 10.dp),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),

                shape = RoundedCornerShape(bottomEnd = 10.dp, bottomStart = 10.dp),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE3EAF2), //Card background color
                )
            ) {
                // prefix Icon
                Icon(
                    imageVector = prefixIcon,
                    contentDescription = null,
                    tint = Color(0xFFFF7A00),
                    modifier = Modifier
                        .width(6.dp)
                        .height(6.dp)
                        .padding(start = 5.dp),
                )


                // card text
                Text(
                    text = stringResource(id = cardText),
                    color = Color(0xFF000000),
                    fontFamily = poppinsFamily,
                    fontSize = 6.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(
                            bottom = 0.dp,
                        )
                )

                // suffix Icon Button
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = suffixIcon,
                        contentDescription = null,
                        tint = Color(0xFF000000),
                        modifier = Modifier
                            .width(6.dp)
                            .height(6.dp)
                            .padding(start = 5.dp),
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SixthPreview() {
    SixthPage()
}