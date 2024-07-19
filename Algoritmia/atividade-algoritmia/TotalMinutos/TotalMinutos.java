import java.util.Scanner;

class TotalMinutos
{
   Scanner scanNumeroDias = new Scanner(System.in); 
   
   TotalMinutos(){
       System.out.println("Forneça o número de dias para converter em minutos: ");
       conversorTotalMinutos(scanNumeroDias.nextInt());
    }
    
    void conversorTotalMinutos(int numeroDias){
       
       int totalDiasHoras = numeroDias * 24;
       int totalDiasMinutos = totalDiasHoras * 60;
       
       System.out.println("O total de dias digitados foram "+numeroDias);
       System.out.println("O total em minutos são: "+totalDiasMinutos);
       
    }
}
