
package ejercicio2;
import ejercicio2.*;
public class nodoPila {
    vacuna elemento;
    nodoPila next;
    boolean getElemento;
    
    public nodoPila(vacuna vacunas){
        this.elemento = vacunas;
        this.next = null;
    }
}
    class pila{
        private nodoPila top;
        int size = 0;
        
        public pila(){
            top = null;
        }
        public boolean estaVacia(){
            if(top == null){
                return true;
            }else{
                return false;
            }
        }
        public void push(vacuna vacunas){
            nodoPila nuevoNodo = new nodoPila(vacunas);
            nuevoNodo.next = top;
            top = nuevoNodo;
            size++;
        }
        public vacuna pop(){
            if(estaVacia()){
                System.out.println("La lista esta vacia");
                size = 0;
            }
                vacuna aux = top.elemento;
                top = top.next;
                size--;
                return aux;
        }
    }

