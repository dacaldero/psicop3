/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.Especialidades;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface EspecialidadesFacadeLocal {

    void create(Especialidades especialidades);

    void edit(Especialidades especialidades);

    void remove(Especialidades especialidades);

    Especialidades find(Object id);

    List<Especialidades> findAll();

    List<Especialidades> findRange(int[] range);

    int count();
    
}
