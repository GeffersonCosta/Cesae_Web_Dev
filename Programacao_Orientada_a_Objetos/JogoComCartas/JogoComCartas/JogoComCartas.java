import java.util.Random;
import java.util.ArrayList;

public class JogoComCartas
{
    public Carta card;
    
    public Random rand = new Random();
    
    public ArrayList<Carta> listaBaralho = new ArrayList<Carta>();
    
    public JogoComCartas()
    {
        //this.TirarUmaCarta();
        this.CriarNovoBaralho();
    }
    
    public void CriarNovoBaralho()
    {
        for(int i = 0; i < card.arrayNaipes.length; i++)
        {
            for(int j = 0; j < card.arrayRanks.length; j++)
            {
                listaBaralho.add(new Carta(i,j));
            }
        }
    }
    
    public void TirarUmaCarta()
    {
        card = new Carta(rand.nextInt(3),rand.nextInt(13));
        
        System.out.println("Saiu o " + card.rank + " " +  card.naipe);
    }
    
    public void ComprarCartas(int numerosDeCartasAComprar)
    {
        for(int i = 0; i < numerosDeCartasAComprar;i++)
        {
            if(listaBaralho.size() == 0){
                System.out.println("O baralho acabou");
                break;
            }
            else{
                int numberIndex = rand.nextInt(listaBaralho.size());
                System.out.println(listaBaralho.get(numberIndex).rank + listaBaralho.get(numberIndex).naipe);
                listaBaralho.remove(numberIndex);
            }
       
            
           
        }
         
        
    }
    
    //quando o baralho nao tiver mais cartar aparecer mensagem utilizador. "Acabou o baralho"
    
}