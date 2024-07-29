import java.util.Scanner;



public class ExemplosWhile
{
    Scanner objectorScanner = new Scanner(System.in);
   
    int valorUtilizador; 
    public ExemplosWhile()
    {
        System.out.println("Digite o valor entre 30 e 40: ");   
        valorUtilizador  = objectorScanner.nextInt();
     while(valorUtilizador < 30 || valorUtilizador > 40 ){
         System.out.println("Não escreveu um valor correto! Digite novamente: ");
         valorUtilizador = objectorScanner.nextInt();
        }
        
        
    }

   
}
