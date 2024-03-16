package br.com.fiap.medconnectfiap.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.medconnectfiap.R
import br.com.fiap.medconnectfiap.ui.theme.AzulClaro
import br.com.fiap.medconnectfiap.ui.theme.AzulEscuro
import br.com.fiap.medconnectfiap.ui.theme.AzulMedio
import br.com.fiap.medconnectfiap.ui.theme.AzulPiscina


@Composable
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.linearGradient(colors = listOf(AzulEscuro, AzulClaro))),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Brush.linearGradient(colors = listOf(AzulMedio, AzulPiscina))),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(id = R.drawable.notifications_none_24),
                contentDescription = "Icone de Menu",
                Modifier.padding(10.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.menu_24),
                contentDescription = "Icone de Notificações",
                Modifier.padding(10.dp)
            )
        }

        Text(
            modifier = Modifier.align( Alignment.CenterHorizontally),
            text = "MedConnect",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = AzulEscuro
        )

        // Botões de navegação
        Column(
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(vertical = 16.dp)
        ) {
            Button(
                onClick = {
                    navController.navigate("medicocadastroscreen")
                },
                colors = ButtonDefaults.buttonColors(AzulMedio),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .width(150.dp)
            ) {
                Text(
                    text = "Médico",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    navController.navigate("pacientecadastroscreen")
                },
                colors = ButtonDefaults.buttonColors(AzulMedio),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .width(150.dp)
            ) {
                Text(
                    text = "Paciente",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    navController.navigate("prontuarioscreen")
                },
                colors = ButtonDefaults.buttonColors(AzulMedio),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .width(150.dp)
            ) {
                Text(
                    text = "Prontuário",
                    fontSize = 20.sp,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

        }

        Spacer(modifier = Modifier.height(16.dp))

        // Adiciona navegação ao final da página
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Brush.linearGradient(colors = listOf(AzulMedio, AzulPiscina))),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow_back_ios_24),
                contentDescription = "Icon 1",
                Modifier.padding(10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.home_24),
                contentDescription = "Icon 2",
                Modifier.padding(10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.contact_phone_24),
                contentDescription = "Icon 3",
                Modifier.padding(10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.logout_24),
                contentDescription = "Icon 4",
                Modifier.padding(10.dp)
            )
        }
    }
}



