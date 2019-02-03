
package reto3.controlador;

import javax.swing.JOptionPane;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;

public class BorrarCliente {
    
    public String us;
    public String pass;

    public BorrarCliente(String us,String  pass){

        if ( (us.equals("")) || (pass.equals("")) ){
        JOptionPane.showMessageDialog(null, "Ingrese Usuario y/o Contraseña");
        }
        if((!us.equals("")) || (!pass.equals("")) ){
        int n= JOptionPane.showConfirmDialog(null, "Esta seguro que quiere borrar su usuario?", "An Inane Question" , JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
          
          JOptionPane.showMessageDialog(null, "Deseamos que vuelva pronto");
                Consultas cone =new Consultas(); 
                cliente cliente; 
                cliente = cone.BorrarCliente(us,pass); 
        }
        else {
           JOptionPane.showMessageDialog(null, "GRACIAS");
            }
        }   
    }
}

      


