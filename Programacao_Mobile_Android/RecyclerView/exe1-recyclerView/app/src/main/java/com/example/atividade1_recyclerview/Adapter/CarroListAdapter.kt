package com.example.atividade1_recyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.atividade1_recyclerview.Model.Carro
import com.example.atividade1_recyclerview.R


class CarroListAdapter(val listaCarro:ArrayList<Carro>) : RecyclerView.Adapter<CarroListAdapter.CarroViewHolder>(){

    class CarroViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){

        val textView: TextView = itemView.findViewById(R.id.text_modelo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_carro_list, parent, false)

        return  CarroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaCarro.size
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        val carro = listaCarro[position]

        holder.textView.setText(carro.modelo)
    }


}