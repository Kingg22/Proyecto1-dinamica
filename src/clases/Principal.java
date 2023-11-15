package clases;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // declaracion de variables
        int opcion1 = 0, opcion2 = 0, opcion3 = 0;
        String opcion4[] = { "Presentacion", "Pila", "Cola Simple", "Cola Circular", "Salir"};
        String opcion5[] = { "Insertar", "Eliminar", "Mostrar Pila", "Regresar" };
        String opcion6[] = { "Insertar", "Eliminar", "Mostrar Cola Simple", "Regresar" };
        String opcion7[] = { "Insertar", "Eliminar", "Mostrar Cola Circular", "Regresar" };
        String opcion[] = { "Regresar" };

        // creacion de objetos de todas las clases
        Pila pila = new Pila();
        Cola cola = new Cola();
        Circular circular = new Circular();

        do {
            try {
                opcion1 = JOptionPane.showOptionDialog(null, 
                "                Menu Principal\n\n", 
                "Estructura de datos", 
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcion4, 
                "");
                switch (opcion1) {
                    case 0:
                    JOptionPane.showMessageDialog(null, 
                    "Grupo: \nRey Acosta 8-1024-1653 \nPatrick Villaroel E-8-206126"
                    + "\nNathan Carrasco 8-1010-606 \nCarlos Cedeno 8-1019-137",
                    "Proyecto 1", 
                    JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, 
                        "Opción no dispobible.");
                        break;
                }
            } catch (NumberFormatException nm) {
                JOptionPane.showMessageDialog(null, 
                "Error en el formato de parseo " + nm, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion1 != 4);
    }
}
