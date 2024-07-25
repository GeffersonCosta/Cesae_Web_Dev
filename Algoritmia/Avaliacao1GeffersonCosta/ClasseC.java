import java.util.Scanner;
import java.util.Random;

public class ClasseC
{
    Scanner scanUsuario = new Scanner(System.in);
    Random numeroAleatorio = new Random();
    int cont;
    public ClasseC()
    {
        int ValorAleatonio = numeroAleatorio.nextInt(7)+2;
        System.out.println("Digite o número entre 2 e 8:");
        verificarAcerto(scanUsuario.nextInt(), ValorAleatonio);
    }
    void verificarAcerto(int valorUsuario, int valorSistema){
        cont++;
        if(valorUsuario == valorSistema){
           System.out.println("Parabéns Acertou"); 
           System.out.println("Número de tentativas: "+cont); 
        }else{
             System.out.println("Errou: ");
             if(valorSistema > valorUsuario){
                 System.out.println("O número mistério é maior que o número indicado: "); 
                }
             if(valorSistema < valorUsuario){
                 System.out.println("O número mistério é menor que o número indicado: "); 
                }
            verificarAcerto(scanUsuario.nextInt(), valorSistema);
        }
    
    }

    
  
}
