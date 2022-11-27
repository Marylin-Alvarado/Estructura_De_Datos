/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Cuenta.Paciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marilyn
 */
public class TableModel extends AbstractTableModel{
    
    private List<Paciente> row;
    private int[] col;
    private String[] colsName = {"Nombre", "Apellido1", "Apellido2", "Cedula",
    "Patologia", "Fecha de entrada", "Edad", "Genero", "Clasificacion", "Indicaciones",
    "Receta"};

    public TableModel(List<Paciente> row, int[] col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public int getRowCount() {
       return row.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Paciente p = row.get(i);
        switch(i1){
            case 0:return p.getNombre();
            case 1:return p.getApellido1();
            case 2: return p.getApellido2();
            case 3: return p.getCedula();
            case 4: return p.getPatologia();
            case 5: return p.getFecha();
            case 6: return p.getEdad();
            case 7: return p.getGenero();
            case 8: return p.getClasificacion();
            case 9: return p.getIndicaciones();
            case 10: return p.getReceta();
            default: return "";
        }
    
    }

    @Override
    public String getColumnName(int i) {
        return colsName[i];
        
    }

    public Paciente getRowAt(int n) {
        return row.get(n);
        
    }

    
    
    
    
}
