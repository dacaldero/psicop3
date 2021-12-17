/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.Psicologos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface PsicologosFacadeLocal {

    void create(Psicologos psicologos);

    void edit(Psicologos psicologos);

    void remove(Psicologos psicologos);

    Psicologos find(Object id);

    List<Psicologos> findAll();

    List<Psicologos> findRange(int[] range);

    int count();
    
}
