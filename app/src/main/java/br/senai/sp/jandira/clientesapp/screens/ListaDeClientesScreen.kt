package br.senai.sp.jandira.clientesapp.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.clientesapp.ui.theme.ClientesAppTheme

@Composable
fun ListaDeClientes(modifier: Modifier = Modifier){
    Column {
        Button(
            onClick = {}
        ) {
            Text(
                text = "Click Here!",
                color = MaterialTheme
                    .colorScheme.onPrimary
            )
        }
    }
}


@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ListaDeClientesPreview(){
    ClientesAppTheme {
        ListaDeClientes()
    }
}