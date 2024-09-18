import java.util.ArrayList;

// extends é uma keyword que implementa o conceito de Herança(Inheritance)
public class Jogador extends Utilizador
{

    int pontos;
    String nomeNoJogo;
    Carta cartaDoJogador;
    
    ArrayList<Carta> cartasNaMao;
    
   
    public Jogador(){
       
        cartasNaMao = new ArrayList();
    }
    
    void comprarCarta(Carta paramCarta){
        
        cartasNaMao.add(paramCarta);
        
    }
    void descartarCarta(){
        
    }
    void mostrarMao(){
        
    }
   

    
}
