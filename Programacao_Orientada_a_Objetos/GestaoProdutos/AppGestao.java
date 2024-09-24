import java.util.ArrayList;

public class AppGestao
{
    ArrayList<Produto> listaProduto;
    
    public AppGestao()
    {
      listaProduto = new ArrayList<>();
      System.out.println("Bem-vindo/a à Aplicação de Gestão");
      
    }
    
    void inserirProduto(String nome, float preco){
        
        Produto instanciaProduto = new Produto(nome, preco);
        listaProduto.add(instanciaProduto);
        System.out.println("item adicionado!");
        
    }
    void listarProduto(){
        if(listaProduto.size() > 0){
            for(int i=0; i<listaProduto.size(); i++){
            Produto prod = listaProduto.get(i);
            System.out.println(prod.nome +" "+"€"+prod.preco);
         }
        }
        else{
            System.out.println("Não existem produtos!");
        }
    
        
    }
    void totalPrecos(){
        if(listaProduto.size() > 0){
            float total = 0;
          for(int i=0; i<listaProduto.size(); i++){
              total += listaProduto.get(i).preco; 
           }
             System.out.print("Total: €"+total);
        }else{
            System.out.println("Não existem produtos!");
        }
       
        
    }

   
}
