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

    }

    void mostraListaDeBaralho(){
        if(novoBaralho.size() == 0){
            System.out.println("Baralho Vazio");
        }
        else{
            for(int i = 0; i < carta.arrayNaipes.length; i++)
            {
                for(int j = 0; j < carta.arrayRanks.length; j++)
                {
                    System.out.println(novoBaralho.get(i).arrayNaipes[i] + novoBaralho.get(j).rank);

                }
            }
        }
    }

    void numeroDeItensNaLista(){
        int cont = 0;
        for(int i = 0; i < novoBaralho.size(); i++)
        {
            cont++;
        }
        System.out.println(cont);
    }


    void flop()
    {
        if(baralhoCheio){
            for(int i=0; i < 3; i++){
                int naipeAleatorio = rand.nextInt(3);
                int rankAleatorio = rand.nextInt(13);
                System.out.println("Saiu o "+ novoBaralho.get(naipeAleatorio).arrayNaipes[naipeAleatorio] +  " " +  novoBaralho.get(rankAleatorio).rank);
                novoBaralho.remove(rankAleatorio);

            }
        }
        else{
            System.out.println("Baralho Vazio");
        }

    }    
    
}
