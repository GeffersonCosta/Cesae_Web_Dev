import java.util.ArrayList;
import java.util.Random;

public class Euromilhoes
{
    ArrayList<Integer> grelhaNumeros = new ArrayList();
    ArrayList<Integer> grelhaEstrela;
    Random numerosAleatorios = new Random();
    public Euromilhoes()
    {
        for(int i = 0; i<50; i++){
            grelhaNumeros.add(i+1);
        }
        System.out.println("Chave do Euromilhões");
        System.out.print("Números: ");
        for(int i=0; i<5; i++){
           // O codigo dessa forma da ERRO int indexNumeroSorteado = grelhaNumeros.get(numerosAleatorios.nextInt(grelhaNumeros.size()));
            int indexNumeroSorteado = numerosAleatorios.nextInt(grelhaNumeros.size());
            System.out.print(grelhaNumeros.get(indexNumeroSorteado));
            
            
            if(i < 4){
                System.out.print(",");
            }
            grelhaNumeros.remove(indexNumeroSorteado);
        }  
    }
    void listaNumeros(){
        for(int i=0; i<grelhaNumeros.size(); i++){
            System.out.println(grelhaNumeros.get(i));
        }
    }

}
