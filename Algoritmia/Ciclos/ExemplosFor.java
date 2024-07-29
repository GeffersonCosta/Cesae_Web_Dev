import java.util.Random;


class ExemplosFor
{
    Random numeroAleatorio = new Random();
     ExemplosFor()
    {
       System.out.println("O sistem irá apresentar 20 números aleatórios");
       for(int i=0; i < 20; i++){
           System.out.println(numeroAleatorio.nextInt(101));
        }
        
    }
    

   
}
