package clases;

import javax.swing.JOptionPane;

public class Circular {
    Nodo front;
    Nodo back;
    String ColaCircular = "";

    public Circular () {
        front = back = null;
    }
    public boolean ColaCircularVacia() {
        if (front == back && front == null) {
            return true;
        } else 
        return false;
    }
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
    public void Insertar (int informacion) {
        Nodo auxiliar = new Nodo(informacion);
        if (ColaCircularVacia()) {
            front = auxiliar;
            back = auxiliar;
            auxiliar.siguiente = front;
        } else {
            back.siguiente = auxiliar;
            auxiliar.siguiente = front;
            back = auxiliar;
        }
    }
    public int Eliminar() {
        int informacion = 0;
        if (!ColaCircularVacia()) {
            if (front == back) {
                informacion = front.informacion;
                front = back = null;
            } else {
                informacion = front.informacion;
                back.siguiente = front.siguiente;
                front = front.siguiente;
            }
        return informacion;
        } else {
            return Integer.MIN_VALUE;
        }
    }
}
