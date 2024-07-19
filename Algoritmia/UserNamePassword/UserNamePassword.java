import java.util.Scanner;

class UserNamePassword
{
    Scanner scanUsuario = new Scanner(System.in);
    int contador = 0; 
    String scanUserName;
    String scanPassword;
   UserNamePassword(){
       System.out.println("Digite o Username: ");
       scanUserName = scanUsuario.next();
       System.out.println("Digite o password: ");
       scanPassword = scanUsuario.next();
       autenticador(scanUserName,scanPassword);
    }
   
    void autenticador(String user, String pass){
        if(user.equals("utilizador") && pass.equals("abz")){
            System.out.println("Autenticação Completa");
        }
        else{
            System.out.println("Autenticação Inválida");
            contador++;
            if(contador == 3){
                System.out.print("Este computador será autodestruido em 5 segundos!");
            }
            else{
                System.out.println("Digite o Username: ");
                scanUserName = scanUsuario.next();
                System.out.println("Digite o password: ");
                scanPassword = scanUsuario.next();
                autenticador(scanUserName,scanPassword); 
            }
        }
    }
    
}
