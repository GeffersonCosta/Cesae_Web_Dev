import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class MarcacaoDiaHoraAleatoria
{
    Random numeroAleatorio = new Random();
    String[] diasDaSemana = {"segunda-feira", "terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
    String[] hora = {"09:00", "10:00", "11:00", "14:00", "15:00", "16:00"};
    ArrayList<String> dias = new ArrayList();
    ArrayList<String> horas = new ArrayList();
    
    Scanner scanUtilizador = new Scanner(System.in);
    
    public MarcacaoDiaHoraAleatoria()
    {
        System.out.println("Deseja incluir o Sábado (Sim/Não)");
        String infoUtilizador = scanUtilizador.next();
        if(infoUtilizador.equalsIgnoreCase("Sim")){
            dias.add("Sábado");
        }
       
        for(int i =0; i<diasDaSemana.length; i++){
            dias.add(diasDaSemana[i]);
        }
        int indexAleatorio = numeroAleatorio.nextInt(dias.size());
        for(int i =0; i<hora.length; i++){
           horas.add(hora[i]);
        }
        System.out.println(dias.get(indexAleatorio)+" "+horas.get(indexAleatorio));
        
    }

    
}
