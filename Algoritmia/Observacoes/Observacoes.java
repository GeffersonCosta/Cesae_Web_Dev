class Observacoes{
    Observacoes(){
        
        int valorX = 6;
        int valorY = 3;
        
        int valorZ = 3 * (valorY - 1) + valorX;
        
        //float valorReal = 6.2f;
        float valorReal = 6.97f;
        
        //valorReal = 6.2f / 3;
        
        int numeroInteiro = (int)valorReal;
        
        System.out.println(Math.round(valorReal));
    }
}