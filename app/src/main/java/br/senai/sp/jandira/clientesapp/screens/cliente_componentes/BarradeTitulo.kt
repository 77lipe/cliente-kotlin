package br.senai.sp.jandira.clientesapp.screens.cliente_componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.clientesapp.R
import br.senai.sp.jandira.clientesapp.ui.theme.ClientesAppTheme
import br.senai.sp.jandira.clientesapp.ui.theme.joseFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraDeTitulo(modifier: Modifier = Modifier){
    TopAppBar(
        title = {
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Column {
                    Text(
                        text = "Neymar Junior",
                        style = MaterialTheme.typography.titleLarge
                    )
                    Text(
                        text = "neymar@gmail.com",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                Card(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(4.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.brita),
                        contentDescription = "foto de perfil",
                        contentScale = ContentScale.Crop
                    )
                }
            }
        },
        colors = TopAppBarDefaults
            .topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            )
    )
}


@Preview
@Composable
private fun BarraDeTituloPreview(){
    ClientesAppTheme {
        BarraDeTitulo()
    }
}