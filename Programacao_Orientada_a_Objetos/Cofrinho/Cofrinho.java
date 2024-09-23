import java.util.ArrayList;


public class Cofrinho
{
    String euro = "euro";
    String reais = "reais";
    String dolar = "dolar";
    Euro moedaEuro = new Euro();
    ArrayList<Moeda>listaMoedas;  
    
    
    public Cofrinho()
    {
       listaMoedas = new ArrayList();
    }
    void adicionar(String tipomoeda, double valor){
        Moeda instanciaMoeda = new Moeda(tipomoeda, valor);
        listaMoedas.add(instanciaMoeda);
        System.out.println("Valor adicionado!");
    }
    void remover(double valor){
        if(listaMoedas.size()>0){
            for(int i=0; i<listaMoedas.size(); i++){
            if(listaMoedas.get(i).valor == valor){
                listaMoedas.remove(listaMoedas.get(i)); 
                System.out.println("Valor Removido");
            }
        }
        }else{
            System.out.println("Cofrinho vazio");
        }
        
       
    }
    void listagemMoedas(){
        if(listaMoedas.size()>0){
            for(int i=0; i<listaMoedas.size(); i++){
            listaMoedas.get(i).info();
           }
        }
         else{
             System.out.println("Cofrinho vazio!");
            
        }
        
    }
    void totalConvertido(){
        double total =0; 
        for(int i=0; i<listaMoedas.size(); i++){
            if(listaMoedas.get(i).tipoMoeda.equalsIgnoreCase(euro)){
                total += listaMoedas.get(i).valor;
            }
        }
        System.out.println(moedaEuro.converter(total));
        
    }

    
   
}
