/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.controlador.psicop2;


import edu.sena.facade.psicop2.UsuariosFacadeLocal;
import edu.sena.psicop2.Usuarios;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author LENOVO
 */
@Named(value = "usuarioSession")
@SessionScoped
public class UsuarioSession implements Serializable {
@EJB 
UsuariosFacadeLocal usuarioFacadeLocal;
@EJB
private Usuarios uselog = new Usuarios();
private String correoIn = "";
private String claveIn = "";
public void validarUsuarios(){
    try {
        uselog = usuarioFacadeLocal.inicioSession(correoIn,claveIn);
        if (uselog !=null){
            FacesContext fc = FacesContext.getCurrentInstance();
            fc.getExternalContext().redirect("usuario/index.xhtml");
            
        } else {
            PrimeFaces.current().executeScript("alert('Usuario no existe')");
        }
    } catch (Exception e) {
    }
}
    /**
     * Creates a new instance of UsuarioSession
     */
    public UsuarioSession() {
    }
    public List <Usuarios> leerTodo(){
     return usuarioFacadeLocal.findAll();
    }

    public String getCorreoIn() {
        return correoIn;
    }

    public void setCorreoIn(String correoIn) {
        this.correoIn = correoIn;
    }

    public String getClaveIn() {
        return claveIn;
    }

    public void setClaveIn(String claveIn) {
        this.claveIn = claveIn;
    }

    public Usuarios getUselog() {
        return uselog;
    }

    public void setUselog(Usuarios uselog) {
        this.uselog = uselog;
    }
}

