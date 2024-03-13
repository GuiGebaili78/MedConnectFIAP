package br.com.fiap.medconnectfiap.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.medconnectfiap.R
import br.com.fiap.medconnectfiap.ui.theme.AzulClaro
import br.com.fiap.medconnectfiap.ui.theme.AzulEscuro
import br.com.fiap.medconnectfiap.ui.theme.AzulMedio
import br.com.fiap.medconnectfiap.ui.theme.AzulPiscina
import br.com.fiap.medconnectfiap.ui.theme.MedConnectFIAPTheme

@Composable
fun PacienteCadastroScreen() {
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

        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(350.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.person_pin_24),
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier.size(38.dp)
                        .align(Alignment.CenterVertically)

                )
                OutlinedTextField(
                    value = "Nome",
                    onValueChange = {  },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Digite seu nome", color = Color.White)
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Phone
                    ),
                    textStyle = TextStyle(color = Color.DarkGray)
                )

            }
            Spacer(modifier = Modifier.height(16.dp))


            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(350.dp)
                ) {
                Icon(
                    painter = painterResource(id = R.drawable.document),
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier.size(38.dp)
                        .align(Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = "CPF",
                    onValueChange = {  },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Digite seu CPF",  color = Color.White)
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Phone
                    ),
                    textStyle = TextStyle(color = Color.DarkGray)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(350.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.calendar),
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier.size(38.dp)
                        .align(Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = "Data de Nascimento",
                    onValueChange = {  },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Digite uma data",  color = Color.White)
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Phone
                    ),
                    textStyle = TextStyle(color = Color.DarkGray)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))


            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(350.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.phone),
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier.size(38.dp)
                        .align(Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = "Contato",
                    onValueChange = {  },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Digite seu telefone",  color = Color.White)
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Phone
                    ),
                    textStyle = TextStyle(color = Color.DarkGray)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.width(350.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.location),
                    contentDescription = "Ícone de Paciente",
                    modifier = Modifier.size(38.dp)
                        .align(Alignment.CenterVertically)
                )
                OutlinedTextField(
                    value = "Endereço",
                    onValueChange = {  },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Digite seu endereço",  color = Color.White)
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Phone
                    ),
                    textStyle = TextStyle(color = Color.DarkGray)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))



            Spacer(modifier = Modifier.height(16.dp))

            Spacer(modifier = Modifier.height(16.dp))
            Button (
                onClick = {  },
                modifier = Modifier
                    .width(200.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "CADASTAR",
                    modifier = Modifier.padding(8.dp)
                )
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

@Composable
fun PacienteCadastroScreenCard() {
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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PacienteCadastroScreenPreview() {
    MedConnectFIAPTheme {
        PacienteCadastroScreen()
    }
}


















/*

@Composable
fun ContatosScreen() {

    var nomeState = remember {
        mutableStateOf("")
    }

    var telefoneState = remember {
        mutableStateOf("")
    }

    var amigoState = remember {
        mutableStateOf(false)
    }

    val context = LocalContext.current
    val contatoRepository = ContatoRepository(context)

    var listaContatosState = remember {
        mutableStateOf(contatoRepository.listarContatos())
    }

    Column {
        ContatoForm(
            nome = nomeState.value,
            telefone = telefoneState.value,
            amigo = amigoState.value,
            onNomeChange = {
                nomeState.value = it
            },
            onTelefoneChange = {
                telefoneState.value = it
            },
            onAmigoChange = {
                amigoState.value = it
            },
            atualizar = {
                listaContatosState.value = contatoRepository.listarContatos()
            }
        )
        ContatoList(
            listaContatosState,
            atualizar = {
                listaContatosState.value = contatoRepository.listarContatos()
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContatoForm(
    nome: String,
    telefone: String,
    amigo: Boolean,
    onNomeChange: (String) -> Unit,
    onTelefoneChange: (String) -> Unit,
    onAmigoChange: (Boolean) -> Unit,
    atualizar: () -> Unit
) {
    // obter instância do repositório
    val context = LocalContext.current
    val contatoRepository = ContatoRepository(context)
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Cadastro de contatos",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(
                0xFFE91E63
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = nome,
            onValueChange = { onNomeChange(it) },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Nome do contato")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                capitalization = KeyboardCapitalization.Words
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = telefone,
            onValueChange = { onTelefoneChange(it) },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Telefone do contato")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Checkbox(checked = amigo, onCheckedChange = {
                onAmigoChange(it)
            })
            Text(text = "Amigo")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                val contato = Contato(
                    nome = nome,
                    telefone = telefone,
                    isAmigo = amigo
                )
                contatoRepository.salvar(contato)
                atualizar()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "CADASTAR",
                modifier = Modifier.padding(8.dp)
            )
        }

    }
}
*/
