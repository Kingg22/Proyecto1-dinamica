package clases;

import javax.swing.JOptionPane;

public class Circular {
    Nodo front, back;
    String ColaCircular = "";

    public Circular () {
        front = back = null;
    }
    
    //Método para saber si la cola esta vacia
    public boolean ColaCircularVacia() {
        if (front == back && front == null) {
            return true;
        } else 
        return false;
    }

    //Método para insertar a la cola
    public void Insertar (int informacion) {
        Nodo auxiliar = new Nodo(informacion);

        if (ColaCircularVacia()) {
            front = auxiliar;
            back = auxiliar;
            auxiliar.siguiente = front;
        } else {
            back.siguiente = auxiliar;
            back = auxiliar;
            auxiliar.siguiente = front;
        }
    }

    //Método para extraer de la cola
    public int Eliminar() {
        if (!ColaCircularVacia()) {
            int informacion = front.informacion;

            if (front == back) {
                front = back = null;
            } else {
                front = front.siguiente;
                informacion = front.informacion;
                back.siguiente = front.siguiente;
            }
            return informacion;
        } else {
            return Integer.MIN_VALUE;
        }
    }
    
    //Método para mostrar el contenido de la cola
    public void imprimirColaCircular() {
        if (ColaCircularVacia()) {
        Nodo recorrido = front;
        String ColaCircularInvertida = "";
        
        while(recorrido != back){
            ColaCircular += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = ColaCircular.split(" ");
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaCircularInvertida += " " +cadena[i];                    
        }
        if (ColaCircularVacia())
        {
            JOptionPane.showMessageDialog(null, 
            ColaCircularInvertida + "\nFrente: 0" + "\nFinal: 0",         
            "Cola Simple", 
            JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
            ColaCircularInvertida + "\nFrente: " + front.informacion + "\nFinal: " + back.informacion,         
            "Cola Simple", 
            JOptionPane.PLAIN_MESSAGE);
        }
        ColaCircular = "";
        }
    }
}
