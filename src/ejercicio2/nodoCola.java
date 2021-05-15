
package ejercicio2;
import ejercicio2.*;

public class nodoCola {
    ciudad elemento;
    nodoCola next;
    
    public nodoCola(ciudad ciudad){
        elemento = ciudad;
        next = null;
    }
}
class cola{
    nodoCola front;
    nodoCola tail;
    
    public cola(){
        front = tail = null;
    }
    public void enqueue(ciudad ciudad){
        nodoCola nuevoNodo = new nodoCola(ciudad);
        if(estaVacia()){
            front = nuevoNodo;
        }else{
            tail.next = nuevoNodo;
        }
        tail = nuevoNodo;
    }
    public ciudad dequeue(){
        ciudad aux = null;
        if(!estaVacia()){
            aux = front.elemento;
            front = front.next;
        }else{
            System.out.println("La lista esta vacia");
        }
        return aux;
    }
    public boolean estaVacia(){
        if(front == null){
            return true;
        }else{
            return false;
        }
    }
}
