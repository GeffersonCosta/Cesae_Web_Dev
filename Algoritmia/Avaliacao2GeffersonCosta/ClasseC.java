import java.util.Scanner;
import java.util.Random;


public class ClasseC
{
    Scanner scanUser = new Scanner(System.in);
    Random numeroAleatorio = new Random();
    int escolhaUser;
    
    public ClasseC()
    {
        System.out.println("Digite um número de 1 a 7: ");
        escolhaUser = scanUser.nextInt();
        while(escolhaUser <= 1 || escolhaUser >= 7){
            System.out.println("Valor inválido: Digite um número de 1 a 7: ");
            escolhaUser = scanUser.nextInt();
        }
        numerosAleatorios();
    }
    
    
    void numerosAleatorios(){
        int somatotalNumAleatorios=0;
        int numeros;
        for(int i = 0; i < escolhaUser; i++){
           numeros = numeroAleatorio.nextInt(21);
           System.out.println(numeros); 
           somatotalNumAleatorios += numeros; 
        } 
        System.out.println("Soma total dos números aleatórios: "+somatotalNumAleatorios);   
    }

}
