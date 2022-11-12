package TAD;

import javax.swing.JOptionPane;
import Message.*;

public class Pila {
    private Nodo primero;
    int tamano = 0;
    String Lista = "";
    private boolean isEqual = false;

    public Pila() {
        primero = null;
    }

    public void Apilar(Object dato) {
        Nodo actual = new Nodo(dato, primero);
            primero = actual;
    }

    public Object Desapilar() {
        //while(request!=){
        if (primero != null) {
            Nodo actual = primero;
            primero = actual.siguiente;
            return actual.getDato();
        } //}
        else {
            return null;

        }
    }

    public void MostrarCoches() {
        Nodo recorrido = primero;

        while (recorrido != null) {
            Lista += recorrido.dato + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }

    public Object getCima() {
        return primero.getDato();
    }

    public boolean PilaVacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public Pila eliminarDinamico(Pila ppalabras, Pila auxiliar, Object select) {
        int cuentaCoches = 0;
        while (ppalabras.getCima() != select) {
            Object dato = ppalabras.Desapilar();
            auxiliar.Apilar(dato);
            cuentaCoches++;
        }
        JOptionPane.showMessageDialog(null, "Se tuvieron que retirar "
                + cuentaCoches + " coches del parqueadero lograr sacar el seleccionado");
        if (select == ppalabras.getCima()) {
            ppalabras.Desapilar();
        }
        while (auxiliar.PilaVacia() != true) {
            Object dato = auxiliar.Desapilar();
            ppalabras.Apilar(dato);
        }
        return ppalabras;
    }

    /*public boolean comparador(Object select) {
        Nodo recorrido = primero;

        while (recorrido != null) {
            recorrido = recorrido.siguiente;
            if (select == recorrido.siguiente) {
                isEqual = true;
                break;
            }
        }
        return isEqual;
    }*/
}
