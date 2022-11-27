/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listaenlazadamedicina;

/**
 *
 * @author marilyn
 */
public class ListaEnlazadaMedicina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo.Vista v1 = new Modelo.Vista();
        Modelo.Model m1 = new Modelo.Model();
        Modelo.Control c1 = new Modelo.Control(v1, m1);
        v1.setVisible(true);
    }
    
}
