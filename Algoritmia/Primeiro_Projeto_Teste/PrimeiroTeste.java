
// Definição da classe Primeiro Teste
class PrimeiroTeste{
    
    // Definiçãoda função construtora
    PrimeiroTeste(){
        // Declaração e inicialização da variáveis locais
        int preco = 12;
        double numeroRealDouble = 3.186465184;
        float numeroRealFloat = 3.45f;
        char letra = 'H';
        boolean estado = false;
        String letras = "Hey Hey";  
        
        feriasAgosto();
        // Declaração e instanciação de uma String com uma chamada do seu construtor
        String texto = new String("Hello");
        // Fazer escrita de informação no ecrã
        System.out.println("Inicio do construtor");
        System.out.println(texto + preco);
        int a = funcaoQueRetornaValor();
        System.out.println(a);
    }
  
    void feriasAgosto(){
       System.out.println("Hey Hey Hey :) Agosto!");
    }
    
    int funcaoQueRetornaValor(){
        int valor1 =8;
        int valor2 = 9;
        int total = valor1 + valor2;
        return total;
    }
}