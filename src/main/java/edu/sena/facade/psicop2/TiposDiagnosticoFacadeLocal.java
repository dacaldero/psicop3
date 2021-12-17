/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.TiposDiagnostico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface TiposDiagnosticoFacadeLocal {

    void create(TiposDiagnostico tiposDiagnostico);

    void edit(TiposDiagnostico tiposDiagnostico);

    void remove(TiposDiagnostico tiposDiagnostico);

    TiposDiagnostico find(Object id);

    List<TiposDiagnostico> findAll();

    List<TiposDiagnostico> findRange(int[] range);

    int count();
    
}
