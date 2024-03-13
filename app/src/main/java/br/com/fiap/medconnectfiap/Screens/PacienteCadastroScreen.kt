package br.com.fiap.medconnectfiap.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.medconnectfiap.R
import br.com.fiap.medconnectfiap.database.repository.PacienteRepository
import br.com.fiap.medconnectfiap.model.PacienteModel
import br.com.fiap.medconnectfiap.ui.theme.AzulClaro
import br.com.fiap.medconnectfiap.ui.theme.AzulEscuro
import br.com.fiap.medconnectfiap.ui.theme.MedConnectFIAPTheme
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Composable
fun PacienteCadastroScreen(navController: NavController) {

    val nomeState = remember {
        mutableStateOf("")
    }
    val cpfState = remember {
        mutableStateOf("")
    }
    val dataState = remember {
        mutableStateOf("")
    }
    val telefoneState = remember {
        mutableStateOf("")
    }
    val enderecoState = remember {
        mutableStateOf("")
    }



    Column {
        PacienteCadastroForm(
            nome = nomeState.value,
            cpf = cpfState.value,
            data = dataState.value,
            telefone = telefoneState.value,
            endereco = enderecoState.value,
            onNomeChange = {
                nomeState.value = it
            },
            onCpfChange = {
                cpfState.value = it
            },
            onDataChange = {
                dataState.value = it
            },
            onTelefoneChange = {
                telefoneState.value = it
            },
            onEnderecoChange = {
                enderecoState.value = it
            }
        )
    }
}

@Composable
fun PacienteCadastroForm(
    nome: String,
    cpf: String,
    data: String,
    telefone: String,
    endereco: String,
    onNomeChange: (String) -> Unit,
    onCpfChange: (String) -> Unit,
    onDataChange: (String) -> Unit,
    onTelefoneChange: (String) -> Unit,
    onEnderecoChange: (String) -> Unit
) {
    val context = LocalContext.current
    var pacienteRepository = PacienteRepository(context)
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
                .background(Brush.linearGradient(colors = listOf(AzulClaro, AzulEscuro)))
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

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "CADASTRO DE PACIENTES",
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
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier
                        .size(38.dp)
                        .padding(end = 16.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = nome,
                    onValueChange = { onNomeChange(it) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Digite seu nome", color = Color.White) },
                    textStyle = TextStyle(color = Color.DarkGray),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
                )
            }

            // CPF
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.document),
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier
                        .size(38.dp)
                        .padding(end = 16.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = cpf,
                    onValueChange = { onCpfChange(it) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Digite seu CPF", color = Color.White) },
                    textStyle = TextStyle(color = Color.DarkGray),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
                )
            }

            // Data de Nascimento
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.calendar),
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier
                        .size(38.dp)
                        .padding(end = 16.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = data,
                    onValueChange = { onDataChange(it) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Digite uma data", color = Color.White) },
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
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier
                        .size(38.dp)
                        .padding(end = 16.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = telefone,
                    onValueChange = { onTelefoneChange(it) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Digite seu telefone", color = Color.White) },
                    textStyle = TextStyle(color = Color.DarkGray),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone)
                )
            }

            // Endereço
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.location),
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier
                        .size(38.dp)
                        .padding(end = 16.dp)
                        .align(alignment = Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = endereco,
                    onValueChange = { onEnderecoChange(it) },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text("Digite seu endereço", color = Color.White) },
                    textStyle = TextStyle(color = Color.DarkGray),
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
                )
            }

            // Botão de Cadastro
            Button(
                onClick = {
                    val paciente = PacienteModel(
                        nome = nome,
                        cpf = cpf,
                        dtNascimento = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                        telefone = telefone,
                        endereco = endereco
                    )
                    pacienteRepository.salvar(paciente)
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
        }
    }
}

/*@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PacienteCadastroScreenPreview() {
    MedConnectFIAPTheme {
        PacienteCadastroScreen()
    }
}*/
