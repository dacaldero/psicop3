/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.HistoriasClinicas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LENOVO
 */
@Local
public interface HistoriasClinicasFacadeLocal {

    void create(HistoriasClinicas historiasClinicas);

    void edit(HistoriasClinicas historiasClinicas);

    void remove(HistoriasClinicas historiasClinicas);

    HistoriasClinicas find(Object id);

    List<HistoriasClinicas> findAll();

    List<HistoriasClinicas> findRange(int[] range);

    int count();
    
}
