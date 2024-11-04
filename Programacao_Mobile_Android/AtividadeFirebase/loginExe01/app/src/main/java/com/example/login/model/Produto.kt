package com.example.login.model

class Produto(var idProduto: Int, var nome: String) {


    override fun toString(): String {
        return  idProduto.toString()+". "+nome;
    }
}