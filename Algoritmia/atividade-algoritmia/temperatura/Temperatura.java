import java.util.Random;

public class Temperatura
{
    
    Random temperaturaAleatoria = new Random();
    int temp = temperaturaAleatoria.nextInt(41);
    public Temperatura()
    {
         for(int i=0; i < 4; i++){
           infoTempo();
        }

      
    }
    
    void infoTempo(){
        temp = temperaturaAleatoria.nextInt(41);
        System.out.println(temp);
         if(temp >= 0 && temp <=10){
           System.out.println("Muito frio");
          
        }
        if(temp >= 11 && temp <=20){
            System.out.println("Temperatura moderada");
            
        }
        if(temp >= 21 && temp <=30){
            System.out.println("Está quente");
           
        }
        if(temp >= 31 && temp <=40){
                 System.out.println("Que calor dos diabos!");
                
        }
        
    }
}

    
    


    

