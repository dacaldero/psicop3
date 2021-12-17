/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.psicop2;

import edu.sena.psicop2.Usuarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author LENOVO
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> implements UsuariosFacadeLocal {

    @PersistenceContext(unitName = "UP_psicop2")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }
    public Usuarios inicioSession (String correoIn , String claveIn) {
        try {
             Query q = em.createQuery ("SELECT u FROM Usuarios u WHERE u.use_correoelectronico = : correoIn AND u.use_clavel = claveIn");
        
        q.setParameter("correoIn",correoIn );
        q.setParameter("claveIn", claveIn);
        return (Usuarios) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
       
    }
}
