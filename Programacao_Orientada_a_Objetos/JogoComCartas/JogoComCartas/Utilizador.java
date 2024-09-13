
public class Utilizador
{
    int id;
    String username;
    String email;
    String password;
    
    boolean autenticado = false;
        
    public Utilizador(){
        
        username = "Visitante";

    }
    
    void fazerLogin(String paramUserName, String paramPassword){
        
        username = "Gefferson";
        password = "1234";
        
        if(paramUserName.equals(username) && paramPassword.equals(password)){
            autenticado = true;
            System.out.print("Logado");
        }else {
            System.out.print("Utilizador ou password incorreto!");
        }
        
        // Supondo um eventual  acesso a BD
               
    }
    void fazerLogout(){
        
        autenticado = false;
        
    }
    void fazerRegistro(){
        
        
    }

   
}
