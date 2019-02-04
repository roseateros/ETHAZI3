
package reto3.controlador;

import javax.swing.JOptionPane;

public class Cobro {
        
    public static float precio, cambio=0, pago;
    public static float billete200=0, billete100=0, billete50=0, billete20=0, billete10=0, billete5=0, moneda2=0, moneda1=0;  
    public static float moneda05=0, moneda02=0, moneda01=0, moneda005=0, moneda002=0, moneda001=0;

    public static void calcularTotal(){
        
		double precio=0;

	
    }
        
    public static void calcularPago(){        
        pago = (200*billete200)+(100*billete100)+(50*billete50)
                 +(20*billete20)+(10*billete10)+(5*billete5)+(2*moneda2)
                 +(1*moneda1)+(0.5f*moneda05)+(0.2f*moneda02)+(0.1f*moneda01)+(0.05f*moneda005)+(0.02f*moneda002)+(0.01f*moneda001);         
        pago =(float)(Math.round(pago*100d)/100d);       
    } 

    public static void calcularCambio(){
         
            cambio = (pago-precio);
     
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
            
               JOptionPane.showMessageDialog(null,  "\nSe devolveran: "+(int)billete200+" Billetes de 200€\n"
                                                    + "Se devolveran: "+(int)billete100+" Billetes de 100€\n"
                                                    + "Se devolveran: "+(int)billete50+" Billetes de 50€\n"
                                                    + "Se devolveran: "+(int)billete20+" Billetes de 20€\n"
                                                    + "Se devolveran: "+(int)billete10+" Billetes de 10€\n"
                                                    + "Se devolveran: "+(int)billete5+" Billetes de 5€\n"
                                                    + "Se devolveran: "+(int)moneda2+" Monedas de 2€\n"
                                                    + "Se devolveran: "+(int)moneda1+" Monedas de 1€\n"
                                                    + "Se devolveran: "+(int)moneda05+" Monedas de 50cents\n"
                                                    + "Se devolveran: "+(int)moneda02+" Monedas de 20cents\n"
                                                    + "Se devolveran: "+(int)moneda01+" Monedas de 10cents\n"
                                                    + "Se devolveran: "+(int)moneda005+" Monedas de 5cents\n"
                                                    + "Se devolveran: "+(int)moneda002+" Monedas de 2cents\n"
                                                    + "Se devolveran: "+(int)moneda001+" Monedas de 1cent\n");       
     }

    public static void reiniciarPago(){
        pago=0;      
    }
    
    public static void bi200(){
        billete200++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=1; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void bi100(){        
        billete100++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=1; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void bi50(){
        billete50++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=1; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void bi20(){
                billete20++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=1; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void bi10(){
                billete10++;

        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=1; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void bi5(){
        billete5++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=1; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void mo2(){
        moneda2++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=1; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void mo1(){
        moneda1++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=1;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void mo05(){
        moneda05++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=1; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void mo02(){
        moneda02++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=1; moneda01=0; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void mo01(){
        moneda01++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=1; moneda005=0; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void mo005(){
        moneda005++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=1; moneda002=0; moneda001=0;
            calcularPago();
        }
    }
    
    public static void mo002(){
        moneda002++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=1; moneda001=0;
            calcularPago();
        }
    }
    
    public static void mo001(){
        moneda001++;
        if (pago!=0){
            calcularPago();
        }
        if (pago==0){
            billete200=0; billete100=0; billete50=0; billete20=0; billete10=0; billete5=0; moneda2=0; moneda1=0;
            moneda05=0; moneda02=0; moneda01=0; moneda005=0; moneda002=0; moneda001=1;
            calcularPago();
        }
    }
}
