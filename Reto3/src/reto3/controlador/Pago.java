
package reto3.controlador;

import javax.swing.JOptionPane;

public class Pago {
    public double cambio=0, pago=0;
    public double billete200=0, billete100=0, billete50=0, billete20=0, billete10=0, billete5=0, moneda2=0, moneda1=0;  
    public double moneda05=0, moneda02=0, moneda01=0, moneda005=0, moneda002=0, moneda001=0;

    public double calculadora(double pago2, double suma)
    {
        pago=pago2;
        pago=pago+suma;
        
        return pago;
    }   
    
    public double calcularCambio(double pago,double bille){
        
            double mostrarcambio = pago-bille;  
            cambio = pago-bille;
     
            cambio = (Math.round(cambio*100d)/100d);
            billete200 = cambio / 200;
            cambio = (cambio%200);
                    
            billete100 = cambio / 100;
            cambio = (cambio%100);
                           
            billete50 = cambio / 50;
            cambio = (cambio%50);
                  
            billete20 = cambio / 20;
            cambio = (cambio%20);
                      
            billete10 = cambio / 10;
            cambio = (cambio%10);
                      
            billete5 = cambio / 5;
            cambio = (cambio%5);
                 
            moneda2 = cambio / 2;
            cambio = (cambio%2);
                     
            moneda1 = cambio / 1;
            cambio = (cambio%1);            
           
            moneda05 = cambio / 0.5;
            cambio =  (cambio%0.5);
                      
            moneda02 = cambio / 0.2;
            cambio =  (cambio%0.2);          
         
            moneda01 = cambio / 0.1;
            cambio = (cambio%0.1);        
      
            moneda005 = cambio / 0.05;
            cambio =  (cambio%0.05);            
     
            moneda002 = cambio / 0.02;
            cambio =  (cambio%0.02);
             
            moneda001 = cambio / 0.01;
            moneda001 = (Math.round(moneda001*100d)/100d);
            
            String Change = "\nSu cambio es de: "+ mostrarcambio + "€.\n" +"Se le devolvera en: \n";
            
            if (billete200>=1){
            Change += (int)billete200+" Billete(s) de 200€\n";
            }
            if (billete100>=1){
            Change += (int)billete100+" Billete(s) de 100€\n";
            }
            if (billete50>=1){
            Change += (int)billete50+" Billete(s) de 50\n";
            }
            if (billete20>=1){
            Change += (int)billete20+" Billete(s) de 20€\n";
            }
            if (billete10>=1){
            Change += (int)billete10+" Billete(s) de 10€\n";
            }
            if (billete5>=1){
            Change += (int)billete5+" Billete(s) de 5€\n";
            }
            if (moneda2>=1){
            Change += (int)moneda2+" Moneda(s) de 2€\n";
            }
            if (moneda1>=1){
            Change += (int)moneda1+" Moneda(s) de 1€\n";
            }
            if (moneda05>=1){
            Change += (int)moneda05+" Moneda(s) de 50c\n";
            }
            if (moneda02>=1){
            Change += (int)moneda02+" Moneda(s) de 20c\n";
            }
            if (moneda01>=1){
            Change += (int)moneda01+" Moneda(s) de 10c\n";
            }
            if (moneda005>=1){
            Change += (int)moneda005+" Moneda(s) de 5c\n";
            }
            if (moneda002>=1){
            Change += (int)moneda002+" Moneda(s) de 2c\n";
            }
            if (moneda001>=1){
            Change += (int)moneda001+" Moneda(s) de 1c\n";
            }
            
            JOptionPane.showMessageDialog(null,Change);
            
        return cambio;
     }

    public double reiniciarPago(){
        pago=0;      
        return pago;
    }
}