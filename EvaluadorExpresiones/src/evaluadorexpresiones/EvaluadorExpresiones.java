/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluadorexpresiones;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author marilyn
 */
public class EvaluadorExpresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite expresion que desea evaluar: ");
        String infija = sc.next();
        System.out.println("El resultado es:  " + Evaluador.evaluar(infija));
        
    }
    
}

