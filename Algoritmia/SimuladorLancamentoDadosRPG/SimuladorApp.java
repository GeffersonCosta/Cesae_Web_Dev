import java.util.Random;
import java.util.Scanner;


class SimuladorApp{
    Scanner scanNumeroUtilizador = new Scanner(System.in);
    Scanner scanTextoUtilizador = new Scanner(System.in);
    Random objetoNumeroAleatorio = new Random();
    
    SimuladorApp(){
       
        pedidoLancamento();
           
    }

    void pedidoLancamento(){
        System.out.println("bem vindo ao Simulador de Lançamentos!");
        System.out.println("Este programa permite lança dados de 4 lados e de 6 lados e de 8 lados");
        System.out.println("Por favor escreva 4 ou 6 ou 8 para determinar o gênero de dado a lançar");
        
        int valorUtilizadorGuardado = scanNumeroUtilizador.nextInt();
        
        if(valorUtilizadorGuardado == 4 || valorUtilizadorGuardado == 6 || valorUtilizadorGuardado == 8){
            escrevaResultado(valorUtilizadorGuardado);
        }else{
            System.out.println("Não escolheu um gênero de dado suportado");
            relancamentoDado();
        }
        
       
    }
    void relancamentoDado(){
        System.out.println("Por favor escreva 4 ou 6 ou 8 para determinar o gênero de dado a lançar");
        
        int valorUtilizadorGuardado = scanNumeroUtilizador.nextInt();
        
        if(valorUtilizadorGuardado == 4 || valorUtilizadorGuardado == 6 || valorUtilizadorGuardado == 8){
            escrevaResultado(valorUtilizadorGuardado);
        }else{
            System.out.println("Não escolheu um gênero de dado suportado");
            relancamentoDado();
        }
        
    }
    
    void escrevaResultado(int generoDeDadoALancar){
        
        int resultadoDoLancamento = objetoNumeroAleatorio.nextInt(generoDeDadoALancar) + 1;
        
         System.out.println("O resultado do lançamento foi: "+ resultadoDoLancamento);
         System.out.println("Deseja fazer mais algum lançamento? Escreva sim para lançar outro dado");
         System.out.println("Caso contrário, escreva outra coisa qualquer.");
         
         
         // equals() faz comparação boolean 
         /*if(scanNumeroUtilizador.next().intern() == "sim"){
             relancamentoDado();
            }*/
            
            if(scanNumeroUtilizador.next().equalsIgnoreCase("sim")){
              relancamentoDado();
            }
            else{
                    System.out.println("Encerrando programa!");
            }
            
    }
    

   
}
