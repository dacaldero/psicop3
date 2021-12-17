/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.psicop2;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "tbl_rol")
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")})
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "rol_id")
    private Integer rolId;
    @Size(max = 45)
    @Column(name = "rol_tipo")
    private String rolTipo;
    @Size(max = 45)
    @Column(name = "rol_descripcion")
    private String rolDescripcion;
    @Size(max = 45)
    @Column(name = "rol_ruta")
    private String rolRuta;
    @JoinTable(name = "tbl_usuario_intermedia_rol", joinColumns = {
        @JoinColumn(name = "fk_rolid", referencedColumnName = "rol_id")}, inverseJoinColumns = {
        @JoinColumn(name = "fk_usuarioid", referencedColumnName = "use_usuariosid"),
        @JoinColumn(name = "fk_usuarioid", referencedColumnName = "use_usuariosid")})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Usuarios> usuariosCollection;

    public Rol() {
    }

    public Rol(Integer rolId) {
        this.rolId = rolId;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    public String getRolTipo() {
        return rolTipo;
    }

    public void setRolTipo(String rolTipo) {
        this.rolTipo = rolTipo;
    }

    public String getRolDescripcion() {
        return rolDescripcion;
    }

    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

    public String getRolRuta() {
        return rolRuta;
    }

    public void setRolRuta(String rolRuta) {
        this.rolRuta = rolRuta;
    }

    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolId != null ? rolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.rolId == null && other.rolId != null) || (this.rolId != null && !this.rolId.equals(other.rolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.Rol[ rolId=" + rolId + " ]";
    }
    
}
