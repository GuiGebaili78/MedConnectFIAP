package br.com.fiap.medconnectfiap.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun ProntuarioScreen(navController: NavController) {
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
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "PRONTUÁRIO",
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 16.dp)
            )
        }

        // Card do Paciente
        PatientCard()


        // Informações e links de informações clínicas dos pacientes
        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Text(
                text = "HISTÓRICO MÉDICO",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(AzulMedio)
            )
            Text(
                text = "Informações do histórico médico",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Text(
                text = "MEDICAÇÕES",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(AzulMedio)
            )
            Text(
                text = "Informações do histórico de medicações",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Text(
                text = "ALERGIAS",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(AzulMedio)
            )
            Text(
                text = "Informações do histórico de Alergias",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Text(
                text = "HISTÓRICO FAMILIAR",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(AzulMedio)
            )
            Text(
                text = "Informações do histórico Familiar",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Text(
                text = "EXAMES LABORATORIAIS",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(AzulMedio)
            )
            Text(
                text = "link para exames",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Text(
                text = "EXAMES DE IMAGENS",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(AzulMedio)
            )
            Text(
                text = "link para exames de imagens",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Text(
                text = "HISTÓRICO DE VACINAÇÃO",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(AzulMedio)
            )
            Text(
                text = "Informações sobre vacinas",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Text(
                text = "PREFERÊNCIAS DO PACIENTE",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(AzulMedio)
            )
            Text(
                text = "Informações sobre o paciente",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(),

            ) {
            Text(
                text = "NOTAS DE EVOLUÇÃO",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .background(AzulMedio)
            )
            Text(
                text = "Informações sobre tratamentos crônicos",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
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
                Modifier
                    .padding(10.dp)
                    .clickable {
                        navController.navigate("menuscreen") // Navega de volta para a tela MenuScreen
                    }
            )
        }

    }
}

@Composable
fun PatientCard() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Brush.linearGradient(colors = listOf(AzulMedio, AzulPiscina)))
    ) {
        Icon(
            painter = painterResource(id = R.drawable.person_24),
            contentDescription = "Ícone de Paciente",
            modifier = Modifier.size(48.dp)
        )
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(
                text = "Nome do Paciente",
                fontSize = 18.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Data de Nascimento: 01/01/2000",
                fontSize = 14.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "CPF: 123.456.789-00",
                fontSize = 14.sp,
                color = Color.White
            )
        }
    }
}

