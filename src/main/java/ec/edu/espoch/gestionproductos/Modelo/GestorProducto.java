
package ec.edu.espoch.gestionproductos.Modelo;


public class GestorProducto {
      private final Productos [] Productos;
    private int contadorProductos;

    public GestorProductos() {
        Productos = new Productos[10];
        contadorProductos = 0;
         
}
 public void agregarTarea (int id, String nombre, String precio, boolean disponible) {
    if (contadorProductos < Productos.length) {
        Productos[contadorProductos] = new Productos (id, nombre, precio ); 
        System.out.println("Productos añadida: " + id + " - " + nombre + " - " + precio + " - disponible: " + disponible);  // Espacios añadidos para mejor legibilidad
        contadorProductos++;
        } else {
            System.out.println("No se pueden agregar mas tareas.");
        }
    }

    public void isCompletada() {
        System.out.println("Tareas Pendientes");
        for (int i = 0; i < contadorProductos; i++) {
            if (Productos[i].isDisponible()) {
                System.out.println(i + "; " + Productos[i].getDescripcion());

            }

        }
    }

    public void isCompleta() {
        System.out.println("Tareas Completadas");
        for (int i = 0; i < contadorProductos; i++) {
            if (!Productos[i].isDisponible()) {

            } else {
            }
        }}
}
