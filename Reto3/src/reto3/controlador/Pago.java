
package reto3.controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import reto3.modelo.billete;
import reto3.modelo.cliente;
import reto3.modelo.lineas;
import reto3.vista.Cobro;

public class Pago {
        
    public float cambio=0, pago;
    public float billete200=0, billete100=0, billete50=0, billete20=0, billete10=0, billete5=0, moneda2=0, moneda1=0;  
    public float moneda05=0, moneda02=0, moneda01=0, moneda005=0, moneda002=0, moneda001=0;
    public  ArrayList<billete> billetex;
    public  double valor;
    public cliente clientex;
    public lineas lineasx;
    
    
    public double calcularTotal(lineas lineas, cliente cliente, ArrayList<billete> billete){ 
        clientex=cliente;
        lineasx=lineas;
        billetex =new ArrayList();
        Cobro co = new Cobro(clientex, lineasx, billetex);
        double valor1 = co.valor;
        double pago1 =co.pago;
        return valor1;	
    }
        
    public double calcularPago(){  
        
        pago = (200*billete200)+(100*billete100)+(50*billete50)
                 +(20*billete20)+(10*billete10)+(5*billete5)+(2*moneda2)
                 +(1*moneda1)+(0.5f*moneda05)+(0.2f*moneda02)+(0.1f*moneda01)+(0.05f*moneda005)+(0.02f*moneda002)+(0.01f*moneda001);         
        pago =(float)(Math.round(pago*100d)/100d);    
        
        return pago;
    } 

    public double calcularCambio(){

            float mostrarcambio = (float) (pago-valor);  
            cambio = (float) (pago-valor);
     
            cambio = (float)(Math.round(cambio*100f)/100f);
            billete200 = cambio / 200f;
            cambio = (cambio%200f);
                    
            billete100 = cambio / 100f;
            cambio = (cambio%100f);
                           
            billete50 = cambio / 50f;
            cambio = (cambio%50f);
                  
            billete20 = cambio / 20f;
            cambio = (cambio%20f);
                      
            billete10 = cambio / 10f;
            cambio = (cambio%10f);
                      
            billete5 = cambio / 5f;
            cambio = (cambio%5f);
                 
            moneda2 = cambio / 2f;
            cambio = (cambio%2f);
                     
            moneda1 = cambio / 1f;
            cambio = (cambio%1f);            
           
            moneda05 = cambio / 0.5f;
            cambio =  (cambio%0.5f);
                      
            moneda02 = cambio / 0.2f;
            cambio =  (cambio%0.2f);          
         
            moneda01 = cambio / 0.1f;
            cambio = (cambio%0.1f);        
      
            moneda005 = cambio / 0.05f;
            cambio =  (cambio%0.05f);            
     
            moneda002 = cambio / 0.02f;
            cambio =  (cambio%0.02f);
             
            moneda001 = cambio / 0.01f;
            moneda001 = (Math.round(moneda001*100f)/100f);
            
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
    
    public double bi200(){
        billete200++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=1; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return pago;
    }
    
    public double bi100(){        
        billete100++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=1; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return billete100;
    }
    
    public double bi50(){
        billete50++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=1; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return billete50;
    }
    
    public double bi20(){
        billete20++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=1; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return billete20;
    }
    
    public double bi10(){
        billete10++;

        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=1; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return billete10;
    }
    
    public double bi5(){
        billete5++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=1; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return billete5;
    }
    
    public double mo2(){
        moneda2++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=1; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return moneda2;
    }
    
    public double mo1(){
        moneda1++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=1;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return moneda1;
    }
    
    public double mo05(){
        moneda05++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=1; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return moneda05;
    }
    
    public double mo02(){
        moneda02++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=1; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return moneda02;
    }
    
    public double mo01(){
        moneda01++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=1; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
        return moneda01;
    }
    
    public double mo005(){
        moneda005++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=1; moneda002=0; moneda001=0;
            calcularPago();
        }
        return moneda005;
    }
    
    public double mo002(){
        moneda002++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=1; moneda001=0;
            calcularPago();
        }
        return moneda002;
    }
    
    public double mo001(){
        moneda001++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=1;
            calcularPago();
        }
        return moneda001;
    }
}