package reto3.controlador;

import javax.swing.JOptionPane;
import reto3.modelo.Consultas;
import reto3.modelo.cliente;

public class BorrarCliente {
    
    public String us;
    public String pass;

    public BorrarCliente(String us,String  pass){

        if ( (us == null) || (us.equals("")) )
        {
           JOptionPane.showMessageDialog(null,"No has ingresado el Nombre del usuario");
        }
             else if ( (pass == null) || (pass.equals("")) )
             {
                JOptionPane.showMessageDialog(null,"No has ingresado la Contraseña");
             }
                else if ( (pass != null) || us != null )
                {                                           
                        Consultas conex =new Consultas(); 
                        cliente clientex; 
                        clientex = conex.ObtenerCliente(us,pass); 
                        if (clientex==null){
                                JOptionPane.showMessageDialog(null,"No se ha podido borrar el usuario "+us+" porque no existe o has introducido mal la contraseña");
                        } else {     
                        int n= JOptionPane.showConfirmDialog(null, "¿Quiere borrar su usuario?", "Borrar Usuario" , JOptionPane.YES_NO_OPTION);
                        if (n == JOptionPane.YES_OPTION) 
                        {
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
}
    

      


