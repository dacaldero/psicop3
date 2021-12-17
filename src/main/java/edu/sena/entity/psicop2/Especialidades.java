/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.psicop2;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "especialidades")
@NamedQueries({
    @NamedQuery(name = "Especialidades.findAll", query = "SELECT e FROM Especialidades e")})
public class Especialidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDEspecialidad")
    private Integer iDEspecialidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Nombre_Especialidad")
    private String nombreEspecialidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDEspecialidad", fetch = FetchType.LAZY)
    private Collection<Psicologos> psicologosCollection;

    public Especialidades() {
    }

    public Especialidades(Integer iDEspecialidad) {
        this.iDEspecialidad = iDEspecialidad;
    }

    public Especialidades(Integer iDEspecialidad, String nombreEspecialidad) {
        this.iDEspecialidad = iDEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public Integer getIDEspecialidad() {
        return iDEspecialidad;
    }

    public void setIDEspecialidad(Integer iDEspecialidad) {
        this.iDEspecialidad = iDEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public Collection<Psicologos> getPsicologosCollection() {
        return psicologosCollection;
    }

    public void setPsicologosCollection(Collection<Psicologos> psicologosCollection) {
        this.psicologosCollection = psicologosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEspecialidad != null ? iDEspecialidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialidades)) {
            return false;
        }
        Especialidades other = (Especialidades) object;
        if ((this.iDEspecialidad == null && other.iDEspecialidad != null) || (this.iDEspecialidad != null && !this.iDEspecialidad.equals(other.iDEspecialidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.Especialidades[ iDEspecialidad=" + iDEspecialidad + " ]";
    }
    
}
