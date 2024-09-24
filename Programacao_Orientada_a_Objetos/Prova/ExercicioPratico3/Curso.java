import java.util.ArrayList;
import java.util.Random;

public class Curso
{
    ArrayList<Aluno> listaAluno;
    Random aleatorio = new Random();
    public Curso()
    {
        listaAluno = new ArrayList();
        System.out.println("Bem-vindo/a à Aplicação de operações sobre o curso!");
    }
    
    void inserirAluno(String paramNome, float paramNota){
        listaAluno.add(new Aluno(paramNome, paramNota));
    }
    
    void ordenacaoAleatoriaDeAlunos(){
       
        ArrayList<String> nomes = new ArrayList();
        for(int i =0; i < listaAluno.size(); i++){
           int indeXaleatorio = aleatorio.nextInt(listaAluno.size());
           System.out.println(listaAluno);
        }
        System.out.println(nomes.spliterator());        
        
        if(listaAluno.size() == 0){
            System.out.println("Não exitem ainda alunos no curso");
        }
    }
    void mediaNotasDaTurma(){
        float nota=0;
        for(int i =0; i < listaAluno.size(); i++){
            nota += listaAluno.get(i).nota;
        }
        System.out.println("Média: "+(nota/listaAluno.size()));
        if(listaAluno.size() == 0){
            System.out.println("Não exitem ainda alunos no curso");
        }
    }

    
}
