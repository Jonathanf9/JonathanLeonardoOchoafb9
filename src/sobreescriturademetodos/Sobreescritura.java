/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescriturademetodos;

import sobreescriturademetodos.Vaca;
import sobreescriturademetodos.Perro;
import sobreescriturademetodos.Animal;

/**
 *
 * @author jonathanfb
 */
public class Sobreescritura extends Animal {

    public static void main(String[] args) {
        Animal a1 = new Animal();
       
        // Llamo a los metodos que se llaman igual (imprime los metodos de la misma clase).
     
        /* System.out.println(a1);
        *a1.comer();
        *a1.comunicarse();
        
        Se ejecuta los metodos que herendan de la super clase Animal las subclases son  Vaca y Perro.
       
        *Vaca v1 = new Vaca();
        *v1.comer();
        *v1.comunicarse();
        *Perro p1 = new Perro();
       * p1.comer();
       * p1.comunicarse();
       */
    }
}
