package com.example.login.model

class Produto(var nome: String, var peso: Double, var valor: Double) {


    override fun toString(): String {
        return "Produto: "+nome + " Peso: "+ peso+" KG  Valor: "+ valor+"€"
    }
}