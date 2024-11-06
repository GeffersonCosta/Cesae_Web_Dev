package com.example.login

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.login.model.Produto

class ListaTarefaAdapter(val listaTarefa: ArrayList<Produto>):RecyclerView.Adapter<ListaTarefaAdapter.ListaTarefaViewHolder>(){
    class ListaTarefaViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        val textView: TextView = itemView.findViewById(R.id.text_modelo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaTarefaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_lista_tarefa, parent, false)
        return ListaTarefaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaTarefa.size
    }

    override fun onBindViewHolder(holder: ListaTarefaViewHolder, position: Int) {
       val tarefa = listaTarefa[position]
        holder.textView.setText(tarefa.toString())
    }
}