package br.com.fiap.medconnectfiap.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp), // Adiciona um espaçamento horizontal
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            NavigationButton(iconId = R.drawable.menu_24, text = "Home")
            NavigationButton(iconId = R.drawable.menu_24, text = "Search")
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

@Composable
fun NavigationButton(iconId: Int, text: String) {
    Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = text,
            Modifier.size(48.dp)
        )
        Text(
            text = text,
            fontSize = 14.sp,
            color = Color.White
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MenuScreenPreview() {
    MedConnectFIAPTheme {
        MenuScreen()
    }
}
