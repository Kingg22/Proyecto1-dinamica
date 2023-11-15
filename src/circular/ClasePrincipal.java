package circular;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    public static void main(String[] args) {

        
        int opcion = 0, nodo_informacion = 0;
        Circular colaC = new Circular();

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Extraer un nodo\n"
                        + "3. Mostrar contenido de la Cola Circular\n"
                        + "4. Salir.\n\n"));

                switch (opcion) {
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Porfavor ingresa el valor a guardar en el nodo."));
                        colaC.Insertar(nodo_informacion);
                        break;
                    case 2:
                        if (!colaC.ColaCircularVacia()) {
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: " 
                                    + colaC.Eliminar());
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola circular esta vacía");
                        }
                        break;
                    case 3:
                        colaC.imprimirColaCircular();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                        break;
                }

            } catch (NumberFormatException e) {
            }

        } while (opcion != 4);
    }
}
