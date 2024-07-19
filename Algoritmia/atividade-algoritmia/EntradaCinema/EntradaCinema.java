import java.util.Scanner;


class EntradaCinema
{
   Scanner scanIdade = new Scanner(System.in); 
   
   EntradaCinema(){
      System.out.println("Digite a sua idade: ");
      validadorIdade(scanIdade.nextInt());
    }
    
    void validadorIdade(int idade){
        if(idade >= 18){
            System.out.println("Entrada permitida");
        }else{
            System.out.println("Proibido Entrar!");
        }
    }
 
}
