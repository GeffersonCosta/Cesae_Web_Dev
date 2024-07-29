import java.util.Scanner;

public class Tabuada
{
    Scanner scanValorUsuario = new Scanner(System.in);
    
    public Tabuada()
    {
        System.out.println("Digite um número para printar a tabuada: ");
        int valor = scanValorUsuario.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(valor+"X"+i+"= "+(valor * i));
        }
 
    }

}
