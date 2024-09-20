import java.util.Scanner;


public class TryCatch
{
    Scanner inputUtilizador = new Scanner(System.in);
    
    public TryCatch()
    {
        try{
                System.out.println("Por favor escreva um número inteiro");
                int valorInteiro = inputUtilizador.nextInt();
        }
        catch(Exception e){
            System.out.println("Você não escreveu um número");
        }

        
    }

   
}
