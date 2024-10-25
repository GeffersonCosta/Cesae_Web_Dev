package com.example.atividade1_recyclerview.Data

import com.example.atividade1_recyclerview.Model.Carro

class CarroMock() {
    var listaCarros = ArrayList<Carro>()

    init{
        for(i in 0 .. 100){
            listaCarros.add(Carro(i, i.toString()))
        }
    }

}