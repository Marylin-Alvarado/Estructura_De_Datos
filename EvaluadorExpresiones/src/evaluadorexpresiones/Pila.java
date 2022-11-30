/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluadorexpresiones;

/**
 *
 * @author marilyn
 */
public class Pila {
    
    private int n;
    private int tope;
    private Object pila [];

    public Pila(int n) {
        this.n = n;
        tope = 0;
        pila = new Object [n];
    }
    
    public boolean estaVacia () {
        return tope == 0;
    }
    
    public boolean estaLlena () {
        return tope == n;
    }
    
    public boolean apilar (Object dato){
        if (estaLlena()) {
            return false;
        }
        
        pila[tope] = dato;
        tope++;
        return true;
    }
    
    public Object desapilar(){
        if(estaVacia()) {
            return null;
        }
        tope--;
        return pila[tope];
    }
    
    
    
}
