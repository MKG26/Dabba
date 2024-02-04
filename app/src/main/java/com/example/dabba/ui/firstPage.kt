package com.example.firstpage.ui.theme

import android.graphics.Paint
import android.graphics.Paint.Align
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.twotone.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dabba.R
import com.example.dabba.ui.theme.DabbaTheme
import com.example.dabba.ui.theme.poppinsFamily

@Composable
fun firstPage(
//    onNextButtonClicked: () -> Unit,

    onNextButtonClicked: () -> Unit,
){
    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        Canvas(modifier = Modifier) {
            translate(left = 425f, top = 81f) {
                drawCircle(color = Color(0xFFFDB16B), radius = 120.dp.toPx())
            }
        }

        Canvas(modifier = Modifier) {
            translate(left = 80f, top = 234f,) {
                drawCircle(color = Color(0xFFFFCA99), radius = 120.dp.toPx(), alpha = 0.8f)
            }
        }


        Spacer(Modifier.run { height(350.dp) })


        Column {
            Card(
                modifier = Modifier
                    .width(230.dp)
                    .align(Alignment.Start),
                shape = RoundedCornerShape(topEnd = 10.dp, topStart = 0.dp, bottomEnd = 10.dp, bottomStart = 0.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Black, //Card background color
//                    contentColor = Color.White  //Card content color,e.g.text
                ),

                ) {
                Text(
                    text = stringResource(id = R.string.app_name),
                    color = Color(0xFFFD8F29),
                    fontFamily = poppinsFamily,
                    fontSize = 55.sp,
                    fontWeight = FontWeight.ExtraLight,
                    modifier = Modifier
                        .padding(start = 10.dp, top = 10.dp)
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = stringResource(id = R.string.cardContent1),
                modifier = Modifier
                    .padding(start = 10.dp),
                fontFamily = poppinsFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = stringResource(id = R.string.cardContent2),
                modifier = Modifier
                    .padding(start = 10.dp),
                fontFamily = poppinsFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )


            Spacer(modifier = Modifier.height(110.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White, //Card background color
//                    contentColor = Color.White  //Card content color,e.g.text
                ),
            ){
                Text(
                    text = stringResource(id = R.string.getStarted),
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp),
                    fontFamily = poppinsFamily,
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold
                )

                // continue Button
                Button(
                    onClick = onNextButtonClicked,
                    modifier = Modifier
                        .padding(
                            all = 10.dp,
                        )
                        .fillMaxWidth()
                        .height(80.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF000000)
                    ),

                    shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp, bottomEnd = 20.dp, bottomStart = 20.dp),

                    ) {
                    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {

                        Text(
                            text = stringResource(id = R.string.btnContinue),
                            color = Color(0xFFFD8F29),
                            fontFamily = poppinsFamily,
                            fontSize = 40.sp,
                            fontWeight = FontWeight.ExtraLight,
                            modifier = Modifier
                                .padding(start = 60.dp, top = 5.dp
                                )
                        )

                        Spacer(modifier = Modifier.width(50.dp))

                        Card(
                            shape = RoundedCornerShape(topEnd = 300.dp, topStart = 300.dp, bottomEnd = 300.dp, bottomStart = 300.dp),
//                            modifier = Modifier.padding(top = 10.dp),

                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFF77905), //Card background color
//
                            ),

                            ){
                            Icon(
                                imageVector = Icons.Filled.ArrowForward,
                                contentDescription = null,
                                tint = Color(0xFF000000),
                                modifier = Modifier
                                    .width(40.dp)
                                    .height(40.dp),
                            )

                        }


                    }


                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    DabbaTheme {
        firstPage (onNextButtonClicked = {})


    }
}