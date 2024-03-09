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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.medconnectfiap.R
import br.com.fiap.medconnectfiap.ui.theme.AzulClaro
import br.com.fiap.medconnectfiap.ui.theme.AzulEscuro
import br.com.fiap.medconnectfiap.ui.theme.AzulMedio
import br.com.fiap.medconnectfiap.ui.theme.AzulPiscina
import br.com.fiap.medconnectfiap.ui.theme.MedConnectFIAPTheme

@Composable
fun MenuScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize() // Preenche toda a tela
            .background(Brush.linearGradient(colors = listOf(AzulEscuro, AzulClaro))),
        verticalArrangement = Arrangement.SpaceBetween // Posiciona os itens com espaçamento entre eles
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth() // Preenche a largura disponível
                .height(50.dp)
                .background(Brush.linearGradient(colors = listOf(AzulMedio, AzulPiscina))),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(id = R.drawable.notifications_none_24),
                contentDescription = "Icone de Menu",
                Modifier.padding(10.dp)
            )
            Spacer(modifier = Modifier.weight(1f)) // Adiciona um espaçador à direita
            Icon(
                painter = painterResource(id = R.drawable.menu_24),
                contentDescription = "Icone de Notificações",
                Modifier.padding(10.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        // Adiciona os botões de navegação
        Column (modifier = Modifier
            .align(alignment = Alignment.CenterHorizontally)

        ){
            Row (modifier = Modifier.background(Color.Transparent)){
                Button(
                    onClick = {},
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
                Button(
                    onClick = {},
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
            }
            Spacer(modifier = Modifier.height(40.dp))
            Row (modifier = Modifier.background(Color.Transparent)){
                Button(
                    onClick = {},
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
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(AzulMedio),
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .width(150.dp)
                ) {
                    Text(
                        text = "Consulta",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }

        }

        Spacer(modifier = Modifier.height(16.dp))
        // Adiciona a segunda linha de ícones
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Brush.linearGradient(colors = listOf(AzulMedio, AzulPiscina))),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(id = R.drawable.menu_24),
                contentDescription = "Icon 1",
                Modifier.padding(10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.menu_24),
                contentDescription = "Icon 2",
                Modifier.padding(10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.menu_24),
                contentDescription = "Icon 3",
                Modifier.padding(10.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.menu_24),
                contentDescription = "Icon 4",
                Modifier.padding(10.dp)
            )
        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MenuScreenPreview() {
    MedConnectFIAPTheme {
        MenuScreen()
    }
}
