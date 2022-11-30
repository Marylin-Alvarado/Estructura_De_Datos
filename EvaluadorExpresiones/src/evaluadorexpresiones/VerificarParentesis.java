/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluadorexpresiones;

import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author marilyn
 */
public class VerificarParentesis {
    
    
  public static void main(String[] args) {
        String cadena1 = "(3+(4*8)";
        String cadena2 = "(3*(5-5))";

        System.out.println(verificaParentesis(cadena1) + cadena1);
        System.out.println(verificaParentesis(cadena2) + cadena2);

    }

    private static String verificaParentesis(String cadena) {
        Stack<String> pila = new Stack<String>();
        int i = 0;
        while (i < cadena.length()) {
            if (cadena.charAt(i) == '{') {
                pila.push("{");
            } else if (cadena.charAt(i) == '}') {
                if (!pila.empty()) {
                    pila.pop();
                } else {
                    pila.push("}");
                    break;
                }

            }

            i++;
        }
        if (pila.empty()){
            return "Si equilibrada";
        } else {
            return "No equilibrada";
        }
    }

}

