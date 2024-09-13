import java.util.ArrayList;

public class SalaJogoPoker
{
    int cont=0;
    Jogador jogadorPoker;
    ArrayList<Jogador> listaJogadores;
    Utilizador utilizadorId;
    Carta carta = new Carta();
    ArrayList<Carta> novoBaralho;
    public SalaJogoPoker()
    {
     
       listaJogadores = new ArrayList();
       
    }
    
    void adicionarJogador(){
        
        cont++;
        jogadorPoker = new Jogador();
        jogadorPoker.nomeNoJogo = "Player_"+cont;
        listaJogadores.add(jogadorPoker);
                
    }
    void contarJogares(){
      System.out.println("Existem "+listaJogadores.size()+" Jogares");
    }
    
    void mostrarLista(){
        if(listaJogadores.size() != 0){
            for(int i=0; i < listaJogadores.size(); i++){
            System.out.println("Jogador: "+listaJogadores.get(i).nomeNoJogo);
        }
        }
        else{
            System.out.println("Lista vazia");
            
        }
    }
    
    void criarBaralho(){
        novoBaralho = new ArrayList();
        for(int i = 0; i < carta.arrayNaipes.length; i++)
        {
            for(int j = 0; j < carta.arrayRanks.length; j++)
            {
                novoBaralho.add(new Carta(i,j));
               System.out.println(novoBaralho.get(j).rank + novoBaralho.get(i).naipe);
            }
        }
        
    }
    
    void flop()
    {
        for(int i=0; i < 2; i++){
            for(int j=0; j < 2; j++ ){
                 
                 System.out.println(novoBaralho.get(i).rank);
                
                 //System.out.println("Saiu o " + carta.rank + " " +  carta.naipe);
            }
        }
        
    }    
    
    
    

    
}
