import java.util.ArrayList;
import java.util.Random;

public class SalaJogoPoker
{
    int cont=0;
    Jogador jogadorPoker;
    ArrayList<Jogador> listaJogadores;
    Carta carta;
    ArrayList<Carta> novoBaralho = new ArrayList<Carta>();
    Random rand = new Random();
    boolean baralhoCheio = false;
    public SalaJogoPoker()
    {

        listaJogadores = new ArrayList();

    }

    void adicionarJogador(){

        cont++;
        jogadorPoker = new Jogador();
        jogadorPoker.nomeNoJogo = "Player_"+cont;
        listaJogadores.add(jogadorPoker);
        System.out.println(jogadorPoker.nomeNoJogo);

    }

    void contarJogares(){
        System.out.println("Existem "+listaJogadores.size()+" Jogares");
    }

    void ListarJogadores(){
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

        for(int i = 0; i < carta.arrayNaipes.length; i++)
        {
            for(int j = 0; j < carta.arrayRanks.length; j++)
            {
                novoBaralho.add(new Carta(i,j));
            }
        }
        baralhoCheio = true;
        System.out.println("Baralho Criado com Sucesso!");

    }

    void mostraListaDeBaralho(){
        if(novoBaralho.size() == 0){
            System.out.println("Baralho Vazio");
        }
        else{
            for(int i = 0; i < novoBaralho.size(); i++)
            {
                System.out.println(novoBaralho.get(i).naipe + novoBaralho.get(i).rank);
            }
        }
    }

    void numeroDeItensNaLista(){
        System.out.println(novoBaralho.size());
    }


    void flop()
    {
        if(baralhoCheio){
            for(int i=0; i < 3; i++){
                int saidaDeCartasAleatorias = rand.nextInt(novoBaralho.size());
                carta = novoBaralho.get(saidaDeCartasAleatorias);
                System.out.println("Saiu o "+ carta.naipe +  " " +  carta.rank);
               // System.out.println("Saiu o "+ novoBaralho.get(saidaDeCartasAleatorias).naipe +  " " +  novoBaralho.get(saidaDeCartasAleatorias).rank);
                novoBaralho.remove(saidaDeCartasAleatorias);

            }
        }
        else{
            System.out.println("Baralho Vazio");
        }

    }
    
    void todosJogodoresCompramUmaCarta(){
        
         for(int i=0; i < listaJogadores.size(); i++){
                int saidaDeCartasAleatorias = rand.nextInt(novoBaralho.size());
                carta = novoBaralho.get(saidaDeCartasAleatorias);
                novoBaralho.remove(saidaDeCartasAleatorias);
                listaJogadores.get(i).comprarCarta(carta);

            }
        System.out.println("Todos os jogadores compraram uma carta.");
        
        
    }
    
 
    
}
