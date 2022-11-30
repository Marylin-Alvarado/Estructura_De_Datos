/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluadorexpresiones;

/**
 *
 * @author marilyn
 */
public class Evaluador {

    public static double evaluar(String infija) {
        String posfija = convertir(infija);
        return evaluarPosfija(posfija);
    }

    private static String convertir(String infija) {
        String posfija = "";
        Pila pila = new Pila(100);
        for (int i = 0; i < infija.length(); i++) {
            char letra = infija.charAt(i);
            if (esOperador(letra)) {
                if (pila.estaVacia()) {
                    pila.apilar(letra);
                } else {
                    if (prioridadEnExpresion(letra) > prioridadEnPila(pila.estaLlena())) {
                    
                    }
                }
            } else {
                posfija += letra;
            }
        }
        return posfija;
    }
    
    private static int prioridadEnExpresion(char operador) {
        if(operador == '(') return 5;
        if(operador == '{') return 2;
        
        return 0;
        
    }

    private static double evaluarPosfija(String posfija) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean esOperador(char letra) {
        if (letra == '*' || letra == '/' || letra == '+' || letra == '-' || letra == '(' || letra == ')' || letra == '{' || letra == ']') {
            return true;
        }
        return false;

    }

    private static void apilar(char letra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static int prioridadEnPila(boolean estaLlena) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
