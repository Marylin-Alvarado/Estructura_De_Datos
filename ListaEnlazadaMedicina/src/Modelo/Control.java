/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Cuenta.Paciente;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marilyn
 */
public class Control {

    private Vista vista;
    private Model model;

    public Control(Vista vista, Model model) {
        this.vista = vista;
        this.model = model;

    }

    public void agregar(boolean editar, String nom, String ape1, String ape2, String cedl, String fecha, String patolg, String edad, String genero, String gene, String clasif, String clasf, String clasific, String clasifica, String indi, String recet) {
        Paciente pacient = new Paciente(nom, ape1, ape2, cedl, fecha, patolg,
                edad, genero, gene, clasif, clasf, clasific, clasifica, indi, recet);
        try {
            if (!editar) {

                Dato.Hospital.getInstance().addPaciente(pacient);
                List<Paciente> li = Dato.Hospital.getInstance().getPacientes();
                model.setLis(li);
            } else {
                Dato.Hospital.getInstance().editar(pacient);
                cargarTodos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        model.setP(new Paciente());
        model.setEditar(false);
    }

    public void cancelar() {
        model.setP(new Paciente());
    }

    public void buscarPorCedula(String str) {
        try {
            List<Paciente> li = Dato.Hospital.getInstance().getPacientePorcedula(str);
            model.setLis(li);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        model.setP(new Paciente());
    }

    public void cargarTodos() {
        List<Paciente> li = Dato.Hospital.getInstance().getPacientes();
        model.setLis(li);

    }

    public void eliminar(int n) {
        Paciente p = model.getRow(n);
        Dato.Hospital.getInstance().eliminar(p);
        cargarTodos();
    }

    void editar(int n) {
        Paciente p = model.getRow(n);
        model.setEditar(true);
        model.setP(p);
        
    }

}
