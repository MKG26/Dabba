package com.example.firstpage.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dabba.R
import com.example.dabba.ui.theme.poppinsFamily


@Composable
fun thirdPage(

) {
    Column(

    )
    {
        var value by remember {
            mutableStateOf("")
        }

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

        Spacer(modifier = Modifier.height(210.dp))

        Text(
            text = stringResource(id = R.string.phoneVerification),
            color = Color(0xFF000000),
            fontFamily = poppinsFamily,
            fontSize = 30.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .padding(start = 60.dp, top = 10.dp)
        )

        Spacer(Modifier.run { height(50.dp) })

        Text(
            text = stringResource(id = R.string.otp1,6),
            color = Color(0xFF000000),
            fontFamily = poppinsFamily,
            fontSize = 22.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(start = 10.dp, top = 10.dp)
        )

        Text(
            text = stringResource(id = R.string.otp2),
            color = Color(0xFF000000),
            fontFamily = poppinsFamily,
            fontSize = 22.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .padding(start = 10.dp, top = 5.dp)
        )

        Spacer(modifier = Modifier.height(50.dp))

        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(start = 15.dp)){
            var num = 7
            while (num>0) {
                Card(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 5.dp
                    )
                ) {
                    OutlinedTextField(
                        value = value,
                        onValueChange = {},
                        shape = RoundedCornerShape(
                            topStart = 10.dp,
                            topEnd = 10.dp,
                            bottomStart = 10.dp,
                            bottomEnd = 10.dp
                        ),
                        modifier = Modifier
                            .width(45.dp)
                            .height(50.dp)
                    )

                }
                Spacer(modifier = Modifier.width(10.dp))
                num--
            }
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            TextButton(
                onClick = { },

                ) {
                Text(
                    text = stringResource(id = R.string.resentCode),
                    color = Color(0xFF000000),
                    fontFamily = poppinsFamily,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .padding(start = 130.dp, top = 55.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(140.dp))

        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(10.dp)){
            Card(
                shape = RoundedCornerShape(topEnd = 300.dp, topStart = 300.dp, bottomEnd = 300.dp, bottomStart = 300.dp),
//                            modifier = Modifier.padding(top = 10.dp),

                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFF77905), //Card background color
                ),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 3.dp
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

            Spacer(modifier = Modifier.width(230.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .padding(end = 10.dp)
                    .width(100.dp)
                    .height(45.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF77905)
                ),
                shape = RoundedCornerShape(topEnd = 10.dp, topStart = 10.dp, bottomEnd = 10.dp, bottomStart = 10.dp),
            ) {
                Text(
                    text = stringResource(id = R.string.nextbtn),
                    color = Color(0xFF000000),
                    fontFamily = poppinsFamily,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(bottom = 6.dp, top = 0.dp
                        )
                )
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
private fun thirdPreview() {
    thirdPage()
}