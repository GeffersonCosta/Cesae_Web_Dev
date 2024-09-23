import java.util.ArrayList;

// extends é uma keyword que implementa o conceito de Herança(Inheritance)
public class Jogador extends Utilizador
{
    // Pontos nunca podem ser negativos
    private int pontos;
    String nomeNoJogo;
    Carta cartaDoJogador;
    
    ArrayList<Carta> cartasNaMao;
    
   
    public Jogador(){
       
        cartasNaMao = new ArrayList();
        pontos = 0;
    }
    
    // Regra de casino que não permite pontos inferior a zero
    //Setter
    public void setPontos(int paramPontos){
        if(paramPontos < 0){
            pontos = 0;
        }else{
            pontos = paramPontos;
        }  
    }
    public int getPontos(){
        return pontos;
    }
    
    void comprarCarta(Carta paramCarta){
        
        cartasNaMao.add(paramCarta);
        
    }
    void descartarCarta(){
        
    }
    void mostrarMao(){
        
        if(cartasNaMao.size() == 0){
            System.out.println("O "+nomeNoJogo+ " não tem cartas na mão!");
        }else{
            System.out.println("O "+nomeNoJogo+ " tem a seguinte mão!");
            for(int i=0; i < cartasNaMao.size(); i++){
               cartaDoJogador = cartasNaMao.get(i);
               System.out.println(cartaDoJogador.rank +" de "+ cartasNaMao.get(i).naipe);
               
            }
        }
        
        
    }
   

    
}
