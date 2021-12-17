/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.TiposConsulta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface TiposConsultaFacadeLocal {

    void create(TiposConsulta tiposConsulta);

    void edit(TiposConsulta tiposConsulta);

    void remove(TiposConsulta tiposConsulta);

    TiposConsulta find(Object id);

    List<TiposConsulta> findAll();

    List<TiposConsulta> findRange(int[] range);

    int count();
    
}
