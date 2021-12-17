/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.ProgramaciónCitas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface ProgramaciónCitasFacadeLocal {

    void create(ProgramaciónCitas programaciónCitas);

    void edit(ProgramaciónCitas programaciónCitas);

    void remove(ProgramaciónCitas programaciónCitas);

    ProgramaciónCitas find(Object id);

    List<ProgramaciónCitas> findAll();

    List<ProgramaciónCitas> findRange(int[] range);

    int count();
    
}
