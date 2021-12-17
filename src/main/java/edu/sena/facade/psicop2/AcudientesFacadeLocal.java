/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.Acudientes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface AcudientesFacadeLocal {

    void create(Acudientes acudientes);

    void edit(Acudientes acudientes);

    void remove(Acudientes acudientes);

    Acudientes find(Object id);

    List<Acudientes> findAll();

    List<Acudientes> findRange(int[] range);

    int count();
    
}
