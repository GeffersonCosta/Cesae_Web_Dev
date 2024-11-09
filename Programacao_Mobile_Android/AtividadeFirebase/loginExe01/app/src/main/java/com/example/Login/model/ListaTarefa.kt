package com.example.Login.model

class ListaTarefa(var idTarefa: Int, var descricao: String) {


    override fun toString(): String {
        return ""+idTarefa+" - "+ descricao+""
    }
}