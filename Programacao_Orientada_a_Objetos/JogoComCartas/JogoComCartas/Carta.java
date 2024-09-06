public class Carta
{
    public String naipe;
    public String rank;
    
    static String[] arrayNaipes = {"Espadas","Paus","Ouros","Copas"};
    static String[] arrayRanks = {" Ás "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "," 8 "," 9 "," 10 "," Dama "," Valete "," Rei "};
    
    public Carta()
    {
        naipe = "Ouro";
        rank = "7";
    }
    
    public Carta(String n, String r)
    {
        this.naipe = n;
        this.rank = r;
    }
    
    public Carta(int n, int r)
    {
        this.naipe = arrayNaipes[n];
        this.rank = arrayRanks[r];
    }
}