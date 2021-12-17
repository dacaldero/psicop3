/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.Pacientes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface PacientesFacadeLocal {

    void create(Pacientes pacientes);

    void edit(Pacientes pacientes);

    void remove(Pacientes pacientes);

    Pacientes find(Object id);

    List<Pacientes> findAll();

    List<Pacientes> findRange(int[] range);

    int count();
    
}
