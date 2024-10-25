package com.example.atividade1_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarroListAdapter : RecyclerView.Adapter<CarroListAdapter.CarroViewHolder>(){

    class CarroViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){

        val textView: TextView = itemView.findViewById(R.id.text_modelo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_carro_list, parent, false)

        return  CarroViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}