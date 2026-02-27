package com.humpty.maquetacionbasica

import android.R.attr.text
import android.widget.Button
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign


@Preview(showSystemUi = true)
@Composable
fun portafolio() {
    profileHeader()
}

@Composable
fun profileHeader() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Imagen perfil
            Image(
                painter = painterResource(id = R.drawable.ciclista),
                contentDescription = null,
                contentScale = ContentScale.Crop,   // (ContentScale) para hacer la imagen circular
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )

            Text(
                text = "Sebastián Suárez",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "Desarrollador Android apasionado por la tecnología y el diseño",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 4.dp, end = 4.dp)
            )
        }
        stadictsSection()
    }
}

@Composable
fun stadictsSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 25.dp),
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        Text(
            text = "150",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "2.3k",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "980",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
    }
    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(
            text = "Post",
            fontSize = 16.sp,
        )
        Text(
            text = "Seguidores",
            fontSize = 16.sp,
        )
        Text(
            text = "Likes",
            fontSize = 16.sp,
        )
    }
    actionButtons()
}

@Composable
fun actionButtons() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 28.dp),
        horizontalArrangement = Arrangement.spacedBy(
            8.dp, Alignment.CenterHorizontally
        ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
            Text(
                text = "Seguir",
                fontSize = 16.sp,
            )
        }
        Button(
            onClick = { /*TODO*/ }, modifier = Modifier.weight(1f),
            border = BorderStroke(1.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White, // Color de fondo
            ),
        ) {
            Text(
                text = "Mensaje", fontSize = 16.sp, color = colorResource(id = R.color.Purple)
            )
        }
    }
    interestsSection()
}

@Composable
fun interestsSection() {

    Text(
        text = "Intereses",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 25.dp)
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Spacer(modifier = Modifier.height(16.dp))

        // Contenedor de las filas
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            // Primera fila
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Etiqueta("Ciclismo")
                Spacer(modifier = Modifier.width(8.dp))
                Etiqueta("Programación")
                Spacer(modifier = Modifier.width(8.dp))
                Etiqueta("UI/UX")
            }

            // Segunda fila
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Etiqueta("Música")
                Spacer(modifier = Modifier.width(8.dp))
                Etiqueta("Viajes")
                Spacer(modifier = Modifier.width(8.dp))
                Etiqueta("Gaming")
            }
        }
    }
    proyectsSection()
}

@Composable
fun Etiqueta(texto: String) {
    Box(
        modifier = Modifier
            .background(
                color = Color(0xFFE0E0E0),
                shape = RoundedCornerShape(50)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = texto,
            color = Color.DarkGray
        )
    }
}


@Composable
fun proyectsSection() {
    Text(
        text = "Proyectos Recientes",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 30.dp, bottom = 10.dp)
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Gray)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ciclista),
            contentDescription = null,
            contentScale = ContentScale.Crop,   // (ContentScale) para hacer la imagen circular
            modifier = Modifier
                .size(165.dp)
        )
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Text(
                text = "App De Ciclismo",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Aplicación para rastear rutas de ciclismo con mapas y estadísticas.",
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
            Button(
                onClick = { },
                modifier = Modifier
                    .align(Alignment.End)
            ) {
                Text(
                    text = "Ver más",
                    fontSize = 15.sp,
                )
            }
        }

    }
}