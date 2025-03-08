package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.bmi.R
import androidx.compose.foundation.Canvas
import androidx.compose.ui.unit.Dp

@Composable
fun DataScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFFFF29ED),
                        Color(0xFFEE7CE0)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Olá!",
                color = Color.White,
                fontSize = 30.sp,
                modifier = Modifier.padding(32.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(770.dp),
                shape = RoundedCornerShape(topStart = 48.dp, topEnd = 48.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            GenderCard(Color(0xFF42A5F5))
                            Text(text = "Masculino", fontSize = 16.sp, color = Color.Black)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            GenderCard(Color(0xFFFF4081))
                            Text(text = "Feminino", fontSize = 16.sp, color = Color.Black)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun GenderCard(color: Color) {
    Card(
        modifier = Modifier.size(120.dp),
        shape = RoundedCornerShape(60.dp),
        colors = CardDefaults.cardColors(containerColor = color)
    ) {}
}

@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview() {
    DataScreen()
}
