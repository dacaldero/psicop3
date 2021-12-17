/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.Acudientes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LENOVO
 */
@Stateless
public class AcudientesFacade extends AbstractFacade<Acudientes> implements AcudientesFacadeLocal {

    @PersistenceContext(unitName = "UP_psicop2")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AcudientesFacade() {
        super(Acudientes.class);
    }
    
}
