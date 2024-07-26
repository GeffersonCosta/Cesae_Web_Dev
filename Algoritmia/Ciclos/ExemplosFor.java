import java.util.Random;


class ExemplosFor
{
    Random numeroAleatorio = new Random();
    int valor;
     ExemplosFor()
    {
       System.out.println("O sistem irá apresentar 20 números aleatórios");
       for(int i=0; i < 20; i++){
           valor = numeroAleatorio.nextInt(101);
           System.out.println(valor);
        }
        
    }
    

   
}
