package com.example.dabba.ui

import android.graphics.Paint
import android.graphics.Paint.Align
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.twotone.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter.State.Empty.painter
import com.example.dabba.R
import com.example.dabba.presentation.sign_in.SignInState
import com.example.dabba.ui.theme.DabbaTheme
import com.example.dabba.ui.theme.poppinsFamily


@Composable
fun Login(state: SignInState,
          onSignInClick: () -> Unit,
          modifier: Modifier = Modifier) {

    val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError){
        state.signInError?.let { error ->

            Toast.makeText(
                context,
                error,
                Toast.LENGTH_LONG
            ).show()

        }
    }

    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .offset(
                    x = 10.dp,
                    y = 703.dp
                )
                .requiredWidth(width = 72.dp)
                .requiredHeight(height = 49.dp)
        ) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xffff7a00)),

               ){

                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = null,
                    tint = Color(0xFF000000),
                    modifier = Modifier
                        .size(50.dp)

                )


            }

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 538.dp
                )
                .requiredWidth(width = 337.dp)
                .requiredHeight(height = 52.dp)

        ) {

            Button(
                onClick = { },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0e0000)),
                modifier = Modifier
                    .requiredWidth(width = 337.dp)
                    .requiredHeight(height = 52.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = "Vector",
                    modifier = Modifier
                        .size(40.dp)
                )

                Spacer(modifier = Modifier.padding(5.dp))

                Text(
                    text = "Continue with Email",
                    color = Color(0xffff7a00),
                    style = TextStyle(
                        fontSize = 20.sp
                    ),
                    modifier = Modifier

                )
            }
        }

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 467.dp
                )
                .requiredWidth(width = 337.dp)
                .requiredHeight(height = 52.dp)
        ) {
            Button(
                onClick = onSignInClick,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0e0000)),
                modifier = Modifier
                    .requiredWidth(width = 337.dp)
                    .requiredHeight(height = 52.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.google),
                    contentDescription = "Vector",
                    modifier = Modifier
                        .size(30.dp)
                )

                Spacer(modifier = Modifier.padding(5.dp))

                Text(
                    text = "Continue with Google",
                    color = Color(0xffff7a00),
                    style = TextStyle(
                        fontSize = 20.sp
                    ),
                    modifier = Modifier

                )
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 411.dp
                )
                .requiredWidth(width = 340.dp)
                .requiredHeight(height = 17.dp)
        ) {
            Text(
                text = "or",
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
            Divider(
                color = Color.Black.copy(alpha = 0.22f),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 12.dp
                    )
                    .requiredWidth(width = 155.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 339.dp
                )
                .requiredWidth(width = 340.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 340.dp)
                    .requiredHeight(height = 43.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.Black)
                    .border(
                        border = BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ))
            Text(
                text = "Continue",
                color = Color(0xffff7a00),
                lineHeight = 5.78.em,
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 122.10397338867188.dp,
                        y = 8.dp
                    )
                    .requiredWidth(width = 93.dp)
                    .requiredHeight(height = 30.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 276.dp
                )
                .requiredWidth(width = 337.dp)
                .requiredHeight(height = 52.dp)
        ) {
            Text(
                text = "+91",
                color = Color.Black,
                lineHeight = 5.78.em,
                style = TextStyle(
                    fontSize = 20.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 8.42095947265625.dp,
                        y = 15.dp
                    )
                    .requiredWidth(width = 34.dp))

            Box(
                modifier = Modifier
                    .requiredWidth(width = 337.dp)
                    .requiredHeight(height = 52.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = Color(0xffe3eaf2).copy(alpha = 0.31f))
                    .border(
                        border = BorderStroke(1.dp, Color.Black),
                        shape = RoundedCornerShape(12.dp)
                    ))

        }
        Text(
            text = "Enter your mobile number\n",
            color = Color.Black,
            lineHeight = 5.78.em,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 243.dp
                )
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 30.dp))
        Text(
            text = "Welcome",
            color = Color.Black,
            lineHeight = 3.62.em,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 179.dp
                )
                .requiredWidth(width = 154.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = (-6.99997905571945).dp,
                    y = (-151).dp
                )
                .requiredSize(size = 250.dp)
                .clip(shape = CircleShape)
                .rotate(degrees = -0.06f)
                .background(color = Color(0xffe67914).copy(alpha = 0.46f)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = (-119).dp,
                    y = (-98).dp
                )
                .requiredSize(size = 250.dp)
                .clip(shape = CircleShape)
                .background(color = Color(0xffe67914).copy(alpha = 0.46f)))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun LoginPreview() {
    Login(state = SignInState(), onSignInClick = {})
}