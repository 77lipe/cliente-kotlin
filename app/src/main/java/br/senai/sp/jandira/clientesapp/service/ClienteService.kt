package br.senai.sp.jandira.clientesapp.service

import br.senai.sp.jandira.clientesapp.model.Cliente
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface ClienteService {

    @POST("clientes")
    fun cadastrarCliente(@Body cliente: Cliente): Call<Cliente>

    @GET("clientes")
    fun listarClientes(): Call<List<Cliente>>

    @GET("clientes/{id}")
    
    fun listarClientes(@Path("id") id: Long): Call<List<Cliente>>

}