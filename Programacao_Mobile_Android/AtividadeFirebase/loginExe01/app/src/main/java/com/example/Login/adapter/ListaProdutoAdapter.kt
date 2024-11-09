package com.example.Login.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Login.model.Produto
import com.example.login.R

class ListaProdutoAdapter(var listaProdutoMock: ArrayList<Produto>) : RecyclerView.Adapter<ListaProdutoAdapter.ListaViewHolder>(){

    class ListaViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val textView: TextView = itemView.findViewById(R.id.text_modelo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_lista_produto, parent, false)
        return ListaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaProdutoMock.size
    }


    override fun onBindViewHolder(holder: ListaViewHolder, position: Int) {
        val produto = listaProdutoMock[position]
        holder.textView.setText(produto.toString())

    }


}