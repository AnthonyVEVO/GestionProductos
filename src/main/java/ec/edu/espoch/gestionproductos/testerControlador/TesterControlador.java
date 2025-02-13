
package ec.edu.espoch.gestionproductos.testerControlador;

import controlador.ControladorProductos;
import modelo.GestorProductos;
import vista.VistaProductos;

public class TesterControlador {
    
GestorProductos gestor = new GestorProductos();
VistaProductos vista = new VistaProductos();
ControladorPoductos controlador = new ControladorProductos(gestor, vista);
controlador.iniciar();
    }






   
        G