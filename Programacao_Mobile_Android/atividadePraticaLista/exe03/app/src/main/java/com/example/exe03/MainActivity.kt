package com.example.exe03

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.exe03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val listaAlunos = ArrayList<Aluno>();
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        listaAlunos.add(Aluno("gefferson", "Rua Barroco", "gefferson@teste.com"))
        listaAlunos.add(Aluno("Henrique", "Rua Estrela", "henrique@teste.com"))
        listaAlunos.add(Aluno("Joana", "Rua Barroco", "joana@teste.com"))
        listaAlunos.add(Aluno("Ana", "Rua Povoa", "ana@teste.com"))
        binding.listaAlunos.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaAlunos)

        binding.listaAlunos.setOnItemClickListener{ parent, view, position, id ->
         val i: Intent = Intent(this, InformationAlunoActivity::class.java)
          i.putExtra("nome", listaAlunos.get(position).alunoNome)
          i.putExtra("morada", listaAlunos.get(position).morada)
            i.putExtra("email", listaAlunos.get(position).email)
            startActivity(i);

        }
    }
}