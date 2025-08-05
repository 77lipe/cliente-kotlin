package br.senai.sp.jandira.clientesapp.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.clientesapp.ui.theme.ClientesAppTheme

@Composable
fun ListaDeClientes(modifier: Modifier = Modifier){
    Scaffold (
        topBar = {
            Text(text = "Barra de Título")
        },
        bottomBar = {
            Text(text = "Barra Inferior")
        },
        floatingActionButton = {
            Button(
                onClick = {}
            ) {
                Text(text = "Click me")
            }
        },
        content = { padding ->
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .background(MaterialTheme.colorScheme.background)
            ){  }
        }
    )
}


@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ListaDeClientesPreview(){
    ClientesAppTheme {
        ListaDeClientes()
    }
}