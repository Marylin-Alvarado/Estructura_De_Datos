/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dato;

import Cuenta.Medico;
import Cuenta.Paciente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author marilyn
 */
public class Hospital {

    private static Hospital instance = null;
    private Map<String, Paciente> pacientes;
    private Map<String, Medico> medicos;

    private Hospital() {
        pacientes = new HashMap<String, Paciente>();
        medicos = new HashMap<String, Medico>();
    }

    public static Hospital getInstance() {
        if (instance == null) {
            instance = new Hospital();
        }
        return instance;
    }

    public void addPaciente(Paciente pacient) throws Exception {
        Paciente p = pacientes.get(pacient.getCedula());
        if (p == null) {
            pacientes.put(pacient.getCedula(), pacient);
        } else {
            throw new Exception("Paciente ya existe");
        }
    }

    public void addMedico(Medico medic) throws Exception {
        Medico md = medicos.get(medic.getCedula());
        if (md == null) {
            medicos.put(medic.getCedula(), medic);
        } else {
            throw new Exception("Medico ya existe");
        }
    }

    public List<Paciente> getPacientes() {
        List<Paciente> lis = new ArrayList<>();
        for (Map.Entry<String, Paciente> entry : pacientes.entrySet()) {
            lis.add(entry.getValue());

        }
        return lis;

    }

    public List<Medico> getMedicos() {
        List<Medico> lis = new ArrayList<>();
        for (Map.Entry<String, Medico> entry : medicos.entrySet()) {
            lis.add(entry.getValue());
        }
        return lis;

    }

    public List<Paciente> getPacientePorcedula(String cedl) throws Exception {
        List<Paciente> lis = new ArrayList<>();
        Paciente p = pacientes.get(cedl);
        if (p != null) {
            lis.add(p);
            return lis;
        } else {
            throw new Exception("Paciente no existe");
        }

    }

    public List<Medico> getMedicoPorcedula(String cedl) throws Exception {
        List<Medico> lis = new ArrayList<>();
        Medico md = medicos.get(cedl);
        if (md != null) {
            lis.add(md);
            return lis;
        } else {
            throw new Exception("Medico no existe");
        }

    }

    public void eliminar(Paciente p) {
        pacientes.remove(p.getCedula());
        
    }

    public void editar(Paciente pacient) {
        Paciente p = pacientes.get(pacient.getCedula());
        p.setApellido1(pacient.getApellido1());
        p.setApellido2(pacient.getApellido2());
        p.setCedula(pacient.getCedula());
        p.setClasificacion(pacient.getClasificacion());
        p.setEdad(pacient.getEdad());
        p.setFecha(pacient.getFecha());
        p.setGenero(pacient.getGenero());
        p.setIndicaciones(pacient.getIndicaciones());
        p.setNombre(pacient.getNombre());
        p.setPatologia(pacient.getPatologia());
        p.setReceta(pacient.getReceta());
        
    }

}
