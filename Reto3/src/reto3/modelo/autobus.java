
package reto3.modelo;

public class autobus {
    public String color;
    public int Cod_bus, N_Plazas;
    public double Consumo_km;
    
    public autobus (String color, int Cod_bus, int N_Plazas, double Consumo_km)
    {
    this.Cod_bus=Cod_bus;
    this.Consumo_km=Consumo_km;
    this.N_Plazas=N_Plazas;
    this.color=color;
    }
}
