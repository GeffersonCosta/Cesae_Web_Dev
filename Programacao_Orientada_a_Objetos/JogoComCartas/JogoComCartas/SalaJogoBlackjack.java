import java.util.ArrayList;
import java.util.Random;

public class SalaJogoBlackjack extends SalaJogoPoker
{
    Carta novaCartas;  
    
    public SalaJogoBlackjack()
    {
    }
    
    //Exemplo de Override
    void criarBaralho(){
        
        novoBaralho = new ArrayList<>();
        
        for(int b=0; b<6; b++){
        
            for(int i = 0; i < carta.arrayNaipes.length; i++)
            {
                for(int j = 0; j < carta.arrayRanks.length; j++)
                {
                    novaCartas = new Carta(i,j);
                    novoBaralho.add(novaCartas);
                    System.out.println(novaCartas.naipe +" de "+novaCartas.rank);
                }
                
            }
        }
        System.out.println("Baralho na Sala BlackJack Criado!");
        
    } 
    void mostrarListaCarta(){
        for(int i=0; i < novoBaralho.size(); i++){
            
            System.out.println(novoBaralho.get(i).naipe + novoBaralho.get(i).rank);
        }
        System.out.println("Numero do baralho Completo: "+novoBaralho.size());
    }
    
}


