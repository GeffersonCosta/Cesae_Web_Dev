import java.util.Scanner;

public class ClasseA
{
    Scanner scanUser = new Scanner(System.in);
    public ClasseA()
    {
       System.out.println("Digite sua idade: ");
       validadorIdade(scanUser.nextInt());
       
    }
    
    void validadorIdade(int idade){
       if(idade >= 18){
           System.out.println("Já pode tirar a carta de condução!");
        }
        else{
            int faltaIdade = 18 - idade; 
            System.out.println("Faltam "+faltaIdade+" anos para tirar a carta de condução!");
        } 
    }

    
}
