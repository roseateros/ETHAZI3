
package reto3.modelo;

public class autobus {
    public String color;
    public int Cod_Bus, N_Plazas;
    public double Consumo_km;
  
    
    public autobus (String color, int Cod_Bus, int N_Plazas, double Consumo_km)
    {
    this.Cod_Bus=Cod_Bus;
    this.Consumo_km=Consumo_km;
    this.N_Plazas=N_Plazas;
    this.color=color;

    }
}
