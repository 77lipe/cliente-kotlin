  package br.senai.sp.jandira.clientesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.clientesapp.model.Cliente
import br.senai.sp.jandira.clientesapp.service.Conexao
import br.senai.sp.jandira.clientesapp.ui.theme.ClientesAppTheme
import kotlinx.coroutines.Dispatchers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.await

  class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClientesAppTheme {

                    val cliente = Cliente(
                        id = null,
                        nome = "cadastro do Felipe",
                        email = "emailTeste@email.com"
                    )

                val conexao = Conexao().getClientesService()
                LaunchedEffect(Dispatchers.IO) {
                    conexao.cadastrarCliente(cliente).await()
                }


//                val requisicao = enviar.cadastrarCliente(cliente)
//
//                requisicao.enqueue(object : Callback<Cliente>{
//                    override fun onResponse(call: Call<Cliente>, response: Response<Cliente>) {
//                        println("Http Code ${response.code()}")
//                    }
//
//                    override fun onFailure(call: Call<Cliente>, t: Throwable) {
//                        TODO("Not yet implemented")
//                    }
//
//
//                })
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ClientesAppTheme {

    }
}