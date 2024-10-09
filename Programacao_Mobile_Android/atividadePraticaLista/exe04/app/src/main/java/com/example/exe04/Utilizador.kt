package com.example.exe04

import android.os.Parcelable


 data class Utilizador(val username: String,val nome: String,var password: String, val email: String, var telemovel: String, val cartaoCidadao: String  ){


     companion object DataHolder {
         var utilizadoresList: MutableList<Utilizador> = mutableListOf()
     }



    override fun toString(): String {
        return "Username: ${username} Password: ${password}"
    }
}




