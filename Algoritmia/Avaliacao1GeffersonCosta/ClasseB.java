import java.util.Scanner;

public class ClasseB
{
    
    Scanner scanUsuario = new Scanner(System.in);
    int primeiroNumero;
    int segundoNumero;
    String infoUser;
    
    
    public ClasseB()
    {
       System.out.println("Indique se o calculo será soma ou subtração: ");
       infoUser = scanUsuario.next();
       System.out.println("indique o primeiro número: ");
       primeiroNumero = scanUsuario.nextInt();
       System.out.println("indique o segundo número: ");
       segundoNumero = scanUsuario.nextInt();
       calcular(primeiroNumero,segundoNumero,infoUser);
       
    }
    
    void calcular(int valor1, int valor2, String validacao){
        int soma;
        int sub;
        if(validacao.equalsIgnoreCase("soma")){
            soma = valor1 + valor2;
            System.out.println("O valor da soma é: "+soma);
        }else{
            sub = valor1 - valor2;
            System.out.println("O valor da subtração é: "+sub);
        }  
    }

    
}
