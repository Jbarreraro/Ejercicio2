/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import ejercicio2.*;

/**
 *
 * @author Juan Andres
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vacuna vacuna1 = new vacuna("pfizer",311);
        vacuna vacuna2 = new vacuna("astraseneca",31112);
        System.out.println(vacuna1.marca);
        System.out.println(vacuna1.cantidad);
        ciudad ciudad1 = new ciudad("bogota",3000);
        System.out.println(ciudad1.nombre);
        System.out.println(ciudad1.cantidadVacunas);
        pila pila1;
        pila1 = new pila();
        pila1.push(vacuna1);
        pila1.push(vacuna2);
        System.out.println(pila1.size);
        cola cola1 = new cola();
        cola1.enqueue(ciudad1);
        System.out.println(cola1.estaVacia());
    }
    
}
