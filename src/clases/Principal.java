package clases;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // declaracion de variables
        int opcion1 = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0, nodo = 0, nodo_informacion = 0, nodo_information;
        String opcion5[] = { "Presentacion", "Pila", "Cola Simple", "Cola Circular", "Salir"};
        String opcion6[] = { "Insertar", "Eliminar", "Mostrar Pila", "Regresar" };
        String opcion7[] = { "Insertar", "Eliminar", "Mostrar Cola Simple", "Regresar" };
        String opcion8[] = { "Insertar", "Eliminar", "Mostrar Cola Circular", "Regresar" };

        // creacion de objetos de todas las clases
        Pila pila = new Pila();
        Cola cola = new Cola();
        Circular colaC = new Circular();

        do {
                opcion1 = JOptionPane.showOptionDialog(null, 
                "                                                Menu Principal\n\n", 
                "Estructura de datos", 
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcion5, 
                "");
            try {
                switch (opcion1) {
                    case 0:
                        JOptionPane.showMessageDialog(null, 
                        "Grupo: \nRey Acosta 8-1024-1653 \nPatrick Villaroel E-8-206126"
                        + "\nNathan Carrasco 8-1010-606 \nCarlos Cedeno 8-1019-137",
                        "Proyecto 1", 
                        JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        do {
                                opcion2 = JOptionPane.showOptionDialog(null,
                                        "                                      Menú\n\n"
                                        + "1. Insertar un nodo\n"
                                        + "2. Eliminar un nodo\n"
                                        + "3. Mostrar contenido de la Pila\n"
                                        + "4. Regresar.\n\n", 
                                        "Operaciones con Pilas", 
                                        JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        opcion6, 
                                        "");
                                
                                switch (opcion2) {
                                    case 0:
                                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                                "Porfavor ingresa el valor a guardar en el nodo"));
                                        pila.InsertarNodo(nodo);
                                        break;
                                    case 1:
                                        if(!pila.PilaVacia()){
                                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                                            + pila.EliminarNodo());
                                        }else {
                                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                                        }
                                        break;
                                    case 2:
                                        pila.MostrarValores();
                                        break;
                                        
                                    case 3:
                                        opcion2 = 8;
                                        break;
                                        
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                                        break;
                                }
                        } while (opcion2 != 8);
                        break;
                    case 2:
                        do {
                                opcion3 = JOptionPane.showOptionDialog(null,
                                        "                                                                      Menú\n\n"
                                        + "1. Insertar un nodo\n"
                                        + "2. Extraer un nodo\n"
                                        + "3. Mostrar contenido de la Cola\n"
                                        + "4. Regresar.\n\n", 
                                        "Operaciones con Cola Simple",                                         JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        opcion7, 
                                        "");
                
                                switch (opcion3) {
                                    case 0:
                                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Porfavor ingresa el valor a guardar en el nodo."));
                                        cola.Insertar(nodo_informacion);
                                        break;
                                    case 1:
                                        if (!cola.ColaVacia()) {
                                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " 
                                                    + cola.Extraer());
                                        } else {
                                            JOptionPane.showMessageDialog(null, "La cola esta vacía");
                                        }
                                        break;
                                    case 2:
                                        cola.MostrarContenido();
                                        break;
                                    case 3:
                                        opcion3 = 4;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                                        break;
                                }
                        } while (opcion3 != 4);
                        break;
                    case 3: 
                        do {
                                opcion4 = JOptionPane.showOptionDialog(null,
                                        "                                                                           Menú\n\n"
                                        + "1. Insertar un nodo\n"
                                        + "2. Extraer un nodo\n"
                                        + "3. Mostrar contenido de la Cola Circular\n"
                                        + "4. Regresar.\n\n", 
                                        "Operaciones con Cola Circular",                                         JOptionPane.DEFAULT_OPTION, 
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        opcion8, 
                                        "");
                
                                switch (opcion4) {
                                    case 0:
                                        nodo_information = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                "Porfavor ingresa el valor a guardar en el nodo."));
                                        colaC.Insertar(nodo_information);
                                        break;
                                    case 1:
                                        if (!colaC.ColaCircularVacia()) {
                                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " 
                                                    + colaC.Eliminar());
                                        } else {
                                            JOptionPane.showMessageDialog(null, "La cola circular esta vacía");
                                        }
                                        break;
                                    case 2:
                                        colaC.imprimirColaCircular();
                                        break;
                                    case 3:
                                        opcion4 = 4;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                                        break;
                                }
                        } while (opcion4 != 4);
                        break;
                    case 4:
                        opcion1 = 4;
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
