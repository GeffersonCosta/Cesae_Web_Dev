
public class  Moeda
{
    String tipoMoeda;
    double valor;
    
    public Moeda(String paramTipoMoeda, double paramValor)
    {
       tipoMoeda = paramTipoMoeda;
       valor = paramValor;
    }
    
    void info(){
        System.out.println(valor+" "+tipoMoeda);
    }

   
}
