/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Cuenta.Paciente;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author marilyn
 */
public class Model extends Observable{
    
    private TableModel tablita;
    private int[] col = {0,1,2,3,4,5,6,7,8,9,10};
    private Paciente p;
    private List<Paciente> lis;
    private boolean editar;

    public Model() {
        p = new Paciente();
        tablita = new TableModel(lis, col);
        editar = false;

    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }
    

    public TableModel getTablita() {
        return tablita;
    }

    public void setTablita(List<Paciente> l) {
    tablita = new TableModel(l, col);
    }

  
    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
        refresh();
    }

    public List<Paciente> getLis() {
        return lis;
    }

    public void setLis(List<Paciente> lis) {
        this.lis = lis;
        setTablita(lis);
        refresh();
    }
    
    
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        refresh();
    }
    
    private void refresh (){
        setChanged();
        notifyObservers();
    }

    Paciente getRow(int n) {
        return tablita.getRowAt(n);
    }
    
}
