import java.util.ArrayList;
import java.util.Random;

public class Euromilhoes
{
    ArrayList<Integer> grelhaNumeros = new ArrayList<>();
    ArrayList<Integer> grelhaEstrela = new ArrayList<>();
    Random numerosAleatorios = new Random();
    public Euromilhoes()
    {
        for(int i = 0; i<50; i++){
            grelhaNumeros.add(i+1);
        }
        System.out.println();
        System.out.println("Chave do Euromilhões");
        System.out.print("Números: ");
        
        for(int i=0; i<5; i++){
            // indexNumeroSorteado = grelhaNumeros.get(numerosAleatorios.nextInt(grelhaNumeros.size()));
            int indexNumeroSorteado = numerosAleatorios.nextInt(grelhaNumeros.size());
            System.out.print(grelhaNumeros.get(indexNumeroSorteado));
            if(i < 4){
                System.out.print(",");
            }
            grelhaNumeros.remove(indexNumeroSorteado);
        } 
        
           for(int i =0; i<12; i++){
            grelhaEstrela.add(i+1);
        }
        System.out.println("");
        System.out.print("Estrelas: ");
        for(int i=0; i < 2; i++){
            int indexEstrelaSorteada = numerosAleatorios.nextInt(grelhaEstrela.size());
            System.out.print(grelhaEstrela.get(indexEstrelaSorteada));
             if(i < 1){
                System.out.print(",");
            }
            grelhaEstrela.remove(indexEstrelaSorteada);
        }
        
    }
   
}
