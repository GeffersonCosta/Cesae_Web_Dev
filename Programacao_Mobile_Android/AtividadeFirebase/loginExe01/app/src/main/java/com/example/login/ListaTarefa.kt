package com.example.login

class ListaTarefa(var idTarefa: Int, var descricao: String) {


    override fun toString(): String {
        return ""+idTarefa+" "+ descricao+""
    }
}