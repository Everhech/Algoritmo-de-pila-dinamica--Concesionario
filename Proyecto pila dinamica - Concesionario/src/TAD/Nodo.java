
package TAD;


public class Nodo {
    Object dato;
    Nodo siguiente;

    public Nodo(){
        this.dato=null;
        this.siguiente=null;
    }

    public Nodo(Object dato, Nodo Siguiente){
        this.dato=dato;
        this.siguiente=Siguiente;
    }

    public Object getDato(){
        return this.dato;
    }

    public void setDato(Object dato){
        this.dato=dato;
    }

    public Object getSiguiente(){
        return this.siguiente;
    }

    public void setDato(Nodo siguiente){
        this.siguiente=siguiente;
    }
}
