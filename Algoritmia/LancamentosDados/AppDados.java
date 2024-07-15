// importar a biblioteca 
import java.util.Random;
// Definição da Classe
class AppDados{
    // Definição do Construtor;
    AppDados(){
       System.out.println("O programa vai lançar um dado: "+dado()); 
       System.out.println("O programa vai lançar um dado: "+dado());
       System.out.println("O programa vai lançar um dado: "+dado());
       System.out.println("O programa vai lançar um dado: "+dado());
       System.out.println("O programa vai lançar um dado: "+dado());
    }
    
    int dado(){
        Random valorDado = new Random();
        return valorDado.nextInt(6)+1;
    }
   
}