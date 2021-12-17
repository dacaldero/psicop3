/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.AsistenteMedico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface AsistenteMedicoFacadeLocal {

    void create(AsistenteMedico asistenteMedico);

    void edit(AsistenteMedico asistenteMedico);

    void remove(AsistenteMedico asistenteMedico);

    AsistenteMedico find(Object id);

    List<AsistenteMedico> findAll();

    List<AsistenteMedico> findRange(int[] range);

    int count();
    
}
