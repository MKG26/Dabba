package com.example.dabba.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.ui.unit.dp
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.dabba.R

@Composable
fun AndroidLarge3(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color.White.copy(alpha = 0.93f))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-4.000001943903044).dp,
                    y = (-134).dp)
                .requiredSize(size = 250.dp)
                .clip(shape = CircleShape)
                .rotate(degrees = -0.06f)
                .background(color = Color(0xffe67914).copy(alpha = 0.46f)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-116).dp,
                    y = (-81).dp)
                .requiredSize(size = 250.dp)
                .clip(shape = CircleShape)
                .background(color = Color(0xffe67914).copy(alpha = 0.46f)))

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 10.dp,
                    y = 703.dp)
                .requiredWidth(width = 42.dp)
                .requiredHeight(height = 39.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 42.dp)
                    .requiredHeight(height = 39.dp)
                    .background(color = Color.Black))
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize()
                    .rotate(degrees = 180f))
        }
        Text(
            text = "Enter the 6-digit code sent to your phone number",
            color = Color.Black,

            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Light),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 7.dp,
                    y = 339.dp)
                .requiredWidth(width = 397.dp))
        Text(
            text = "Phone Verification",
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 5.78.em,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 78.dp,
                    y = 158.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 7.dp,
                    y = 427.dp)
                .requiredWidth(width = 345.dp)
                .requiredHeight(height = 50.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 50.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffd9d9d9))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.21f)),
                        shape = RoundedCornerShape(10.dp)
                    ))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 59.dp,
                        y = 0.dp)
                    .requiredSize(size = 50.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffd9d9d9))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.21f)),
                        shape = RoundedCornerShape(10.dp)
                    ))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 118.dp,
                        y = 0.dp)
                    .requiredSize(size = 50.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffd9d9d9))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.21f)),
                        shape = RoundedCornerShape(10.dp)
                    ))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 177.dp,
                        y = 0.dp)
                    .requiredSize(size = 50.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffd9d9d9))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.21f)),
                        shape = RoundedCornerShape(10.dp)
                    ))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 236.dp,
                        y = 0.dp)
                    .requiredSize(size = 50.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffd9d9d9))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.21f)),
                        shape = RoundedCornerShape(10.dp)
                    ))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 295.dp,
                        y = 0.dp)
                    .requiredSize(size = 50.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color(0xffd9d9d9))
                    .border(border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.21f)),
                        shape = RoundedCornerShape(10.dp)
                    ))
        }
        Text(
            text = "Resend Code",
            color = Color.Black,
            lineHeight = 5.78.em,
            style = TextStyle(
                fontSize = 20.sp,
                shadow = Shadow(color = Color.Black.copy(alpha = 0.25f), offset = Offset(0f, 4f), blurRadius = 4f)
            ),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 107.dp,
                    y = 519.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 268.dp,
                    y = 703.dp)
                .requiredWidth(width = 83.dp)
                .requiredHeight(height = 39.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(color = Color(0xffff7a00).copy(alpha = 0.59f)))
        Text(
            text = "Next",
            color = Color(0xfffffdfd).copy(alpha = 0.76f),
            lineHeight = 5.78.em,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 286.dp,
                    y = 711.dp))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun AndroidLarge3Preview() {
    AndroidLarge3(Modifier)
}
