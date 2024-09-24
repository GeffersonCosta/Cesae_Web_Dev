import java.util.Random;
import java.util.Scanner;

public class PagamentoTroco
{
    Random valorAleatorio = new Random();
    Scanner scanUtilizador = new Scanner(System.in);
    int valorPerfume = 0;
    int valorUtilizador = 0;
    int valorEmFalta=0;
    int troco=0;
    boolean controle = true;
    
    public PagamentoTroco()
    {
        valorPerfume = valorAleatorio.nextInt(20)+1;
        System.out.println("Preço do Perfume: "+valorPerfume);
        int valorUtilizador = scanUtilizador.nextInt();
        while(true){
            if(valorUtilizador == valorPerfume){
                System.out.println("Pago sem troco");
                break;
            }
            if(valorUtilizador > valorPerfume){
                troco = valorUtilizador - valorPerfume;
                System.out.println("Pagamento Efetuado!");
                System.out.println("Valor de troco: "+troco);
                break;
            }
            if(valorUtilizador < valorPerfume){
                if(controle){
                    valorEmFalta = valorPerfume - valorUtilizador;
                    controle = false;
                }
                System.out.println("Valor em falta "+valorEmFalta);
                valorUtilizador = scanUtilizador.nextInt();
                valorEmFalta -= valorUtilizador;
                if(valorEmFalta == 0){
                    System.out.println("Pagamento Efetuado, Sem troco!");
                    break;
                }
                
            }
            
        }  
        
        
        
      
    
      
        
        
        
        
        
    }

   
}
