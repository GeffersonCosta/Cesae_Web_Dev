package com.example.parte1


class Produto(val posicao: Int,val nome: String){


    override fun toString(): String {
        return "${posicao}.  ${nome}"
    }
}