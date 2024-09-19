import java.util.ArrayList;
import java.util.Random;


public class AtividadeA
{
    ArrayList<Integer> grelhaNumeros = new ArrayList<>();
    ArrayList<Integer> grelhaEstrelas = new ArrayList<>();
    ArrayList<Integer> numerosSorteados = new ArrayList<>();
    Random numerosAleatorios = new Random();
    Random estrelasAleatorias = new Random();
    
    
    public AtividadeA()
    {
    }
    
    void numerosGrela(){
        for(int i = 0; i < 50; i++){
            grelhaNumeros.add(numerosAleatorios.nextInt(50)+1);
        }
        
        
       
    } 
    String numeroSorteado(){
        numerosGrela();
        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        int valor4 = 0;
        int valor5 = 0;
        
        for(int i = 0; i <= 5; i++){
            int valorSorteado = grelhaNumeros.get(numerosAleatorios.nextInt(grelhaNumeros.size()));
            
            if(!numerosSorteados.contains(valorSorteado)){
                numerosSorteados.add(valorSorteado);
            } 
        }
        valor1 = numerosSorteados.get(0);
        valor2 = numerosSorteados.get(1);
        valor3 = numerosSorteados.get(2);
        valor4 = numerosSorteados.get(3);
        valor5 = numerosSorteados.get(4);
        return "Números: "+valor1+","+valor2+","+valor3+","+valor4+","+valor5;
        
        
    }
     String estrelaSorteado(){
        estrelaGrela();
        int valor1=0;
        int valor2=0;
        for(int i = 0; i < 2; i++){
            int valorSorteado = grelhaEstrelas.get(numerosAleatorios.nextInt(grelhaEstrelas.size()));
            if(valor1 == valor2){ 
                valor1 = valorSorteado;
            }
            else{
                valor2 = valorSorteado;   
            }
        }
        return "Estrelas: "+valor1+" e "+valor2;
    }
    
    void euromilhoes(){
        System.out.println("Chave do Euromilhôes");
        System.out.println(numeroSorteado());
        System.out.println(estrelaSorteado());
    }
    
    

    
    void estrelaGrela(){
          for(int i = 0; i < 12; i++){
            grelhaEstrelas.add(numerosAleatorios.nextInt(12)+1);
        } 
    }
    
    
    
    
    
    
     
}
