/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescriturademetodos;

/**
 *
 * @author jonathanfb
 */
public class Animal {

    public void comunicarse() {
        System.out.println("Animal comunicandose");
    }

    public void comer() {
        System.out.println("Animal esta comiendo ");
    }

    @Override
    public String toString() {
       return "objeto de la clase animal";
    }
}

