import java.util.Scanner;

 class IndiceMassaCorporal{
    Scanner ScanDadoUsuario = new Scanner(System.in);
    float peso;
    float altura;
     IndiceMassaCorporal(){
         System.out.println("Digite o seu peso kg: ");
         peso = ScanDadoUsuario.nextFloat();
         System.out.println("Digite a sua altura: ");
         altura = ScanDadoUsuario.nextFloat();
         calcular(peso, altura);
    }
    
    void calcular(float peso, float altura){
        float indice = peso / (altura * altura);
        
        System.out.println("índice de massa corporal: "+indice);
    }

    
}
