import java.util.Scanner;


public class ClasseA
{
    
    Scanner scanUsuario = new Scanner(System.in);
    
    public ClasseA()
    {
       System.out.println("Digite o número de km que deseja converter para milhas: ");
       conversorKmParaMilhas(scanUsuario.nextFloat());
    }
    void conversorKmParaMilhas(float valorUser){
        float valorTotalConvertido = valorUser * 0.62f; 
         System.out.println("O resultado da conversão para milhas é: "+ valorTotalConvertido);
    }

    
}
