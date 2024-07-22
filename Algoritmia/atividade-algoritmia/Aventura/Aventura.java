import java.util.Scanner;

class Aventura
{
    Scanner scanEscolhaUsuario = new Scanner(System.in);
    boolean comencadoApp = true;
    Aventura(){
        if(comencadoApp){
            System.out.println("José está perdido em uma floresta, para tentar sair da mata fechada, ele precisa escolher uma direção correta!");
            System.out.println("Escolha alguma das opções para tentar sair da floresta: Norte, Sul, Este, ou Oeste");
            comencadoApp = false;
        }
        tentarSair(scanEscolhaUsuario.next());
    }
    
    
    void tentarSair(String escolha){
        if(escolha.equalsIgnoreCase("Norte")){
            System.out.println("José entrou na localização certa e ficou vivo");
            
        }else{
            if(escolha.equalsIgnoreCase("Sul")){
                System.out.println("José entrou na localização errada e foi comido por leões");
            }
            else{
                if(escolha.equalsIgnoreCase("Este")){
                   System.out.println("José entrou na localização errada e foi comido por jacares");
                }else{
                    System.out.println("José entrou na localização errada e foi comido por sucuri"); 
                }
                
            }
            System.out.println("Tente novamente em outra direção:");
            tentarSair(scanEscolhaUsuario.next()); 
        }
        
    }
}
