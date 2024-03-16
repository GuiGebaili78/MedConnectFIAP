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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.medconnectfiap.R
import br.com.fiap.medconnectfiap.database.repository.MedicoRepository
import br.com.fiap.medconnectfiap.model.MedicoModel
import br.com.fiap.medconnectfiap.ui.theme.AzulClaro
import br.com.fiap.medconnectfiap.ui.theme.AzulEscuro
import br.com.fiap.medconnectfiap.ui.theme.AzulMedio
import br.com.fiap.medconnectfiap.ui.theme.AzulPiscina

@Composable
fun MedicoCadastroScreen(navController: NavController) {

    val nomeState = remember {
        mutableStateOf("")
    }
    val crmState = remember {
        mutableStateOf("")
    }
    val especialidadeState = remember {
        mutableStateOf("")
    }
    val contatoState = remember {
        mutableStateOf("")
    }

    val context = LocalContext.current
    val medicoRepository = MedicoRepository(context)

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
                .background(Brush.linearGradient(colors = listOf(AzulClaro, AzulEscuro)))
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
                text = "CADASTRO DE MÉDICOS",
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 16.dp)
            )
        }

        Column {
            // Nome
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.person_pin_24),
                    contentDescription = "Ícone de Médico",
                    modifier = Modifier
                        .size(38.dp)
                        .padding(end = 10.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = nomeState.value,
                    onValueChange = { nomeState.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Digite seu nome", color = Color.White) },
                    textStyle = TextStyle(color = Color.DarkGray),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
                )
            }

            // CRM
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.document),
                    contentDescription = "Ícone de Documento",
                    modifier = Modifier
                        .size(38.dp)
                        .padding(end = 10.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = crmState.value,
                    onValueChange = { crmState.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Digite seu CRM", color = Color.White) },
                    textStyle = TextStyle(color = Color.DarkGray),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
                )
            }

            // Telefone
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.phone),
                    contentDescription = "Ícone de Telefone",
                    modifier = Modifier
                        .size(38.dp)
                        .padding(end = 10.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = especialidadeState.value,
                    onValueChange = { especialidadeState.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Digite sua especialidade", color = Color.White) },
                    textStyle = TextStyle(color = Color.DarkGray),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone)
                )
            }

            // Contato
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.location),
                    contentDescription = "Ícone de telefone",
                    modifier = Modifier
                        .size(38.dp)
                        .padding(end = 10.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = contatoState.value,
                    onValueChange = { contatoState.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Digite seu contato", color = Color.White) },
                    textStyle = TextStyle(color = Color.DarkGray),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
                )
            }


            // Botão de Cadastro
            Button(
                onClick = {
                    val medico = MedicoModel(
                        nome = nomeState.value,
                        crm = crmState.value,
                        especialidade = especialidadeState.value,
                        contato = contatoState.value
                    )
                    medicoRepository.salvar(medico)

                    // Limpa os campos após o cadastro ser realizado com sucesso
                    nomeState.value = ""
                    crmState.value = ""
                    especialidadeState.value = ""
                    contatoState.value = ""
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(36.dp)
            ) {
                Text(
                    text = "CADASTRAR",
                    modifier = Modifier.padding(8.dp)
                )
            }
            Spacer(modifier = Modifier.height(5.dp))

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
                    contentDescription = "Icone de voltar",
                    Modifier
                        .padding(10.dp)
                        .clickable {
                            navController.navigate("menuscreen")
                        }
                )
            }
        }
    }
}
