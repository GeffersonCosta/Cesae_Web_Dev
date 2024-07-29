import java.util.Scanner;
import java.util.Random;

public class ClasseB
{
    Scanner scanUser = new Scanner(System.in);
    Random numeroAleatorio = new Random();
    
    public ClasseB()
    {
        
         System.out.println("Digite o nome do clube de futebol: ");
         IniciarGame(scanUser.nextLine());
    }
    
    void IniciarGame(String nomeClube){
       
        int ClubeUser = numeroAleatorio.nextInt(5);
        int adversario = numeroAleatorio.nextInt(5);
        System.out.println(nomeClube + " Marcou "+ClubeUser+" golos");
        System.out.println("Adversário Marcou "+adversario+" golos");
        if(ClubeUser > adversario){
            System.out.println(nomeClube+" Ganhou!!!");
        }
         if(ClubeUser < adversario){
            System.out.println(nomeClube+" Perdeu!!!");
        }
          if(ClubeUser == adversario){
            System.out.println(nomeClube+" Empatou!!!");
        }
        
          
    }

}
