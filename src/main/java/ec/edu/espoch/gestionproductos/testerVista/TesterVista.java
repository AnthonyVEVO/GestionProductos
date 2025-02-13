/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestionproductos.testerVista;

import ec.edu.espoch.gestionproductos.vista.Vista;

/**
 *
 * @author SO-LAB1-PC28
 */
public class TesterVista {
        private TesterVista vista;

    public TesterVista(TesterVista vista) {
        this.vista = vista;
    }


     public void prueba() {
        try {
            System.out.println("Agregar" + vista.getTxtAgregar);
            System.out.println("Listar" + vista.getTxtListar());
            System.out.println("Salir" + vista.getSalir());

        } catch (NumberFormatException e) {

        }
    }
    
}
