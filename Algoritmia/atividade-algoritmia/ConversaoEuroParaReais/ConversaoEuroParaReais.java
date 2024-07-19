import java.util.Scanner;

class ConversaoEuroParaReais{
    Scanner scanValorUsuario = new Scanner(System.in);
    ConversaoEuroParaReais(){
        System.out.println("Digite quanto em euro deseja converter: ");
        conversor(scanValorUsuario.nextFloat());
    }
    void conversor(float valor){
        
        float valorReais = valor * 6.04f;
        
        System.out.println("Valor total convertido para reais: "+valorReais);
    }


    
}
