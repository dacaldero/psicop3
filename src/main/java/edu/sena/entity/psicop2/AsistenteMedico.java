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
@Table(name = "asistente_medico")
@NamedQueries({
    @NamedQuery(name = "AsistenteMedico.findAll", query = "SELECT a FROM AsistenteMedico a")})
public class AsistenteMedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDAsistente")
    private Integer iDAsistente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Apellido_Paterno")
    private String apellidoPaterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Apellido_Materno")
    private String apellidoMaterno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDAsistente", fetch = FetchType.LAZY)
    private Collection<ProgramaciónCitas> programaciónCitasCollection;

    public AsistenteMedico() {
    }

    public AsistenteMedico(Integer iDAsistente) {
        this.iDAsistente = iDAsistente;
    }

    public AsistenteMedico(Integer iDAsistente, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.iDAsistente = iDAsistente;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getIDAsistente() {
        return iDAsistente;
    }

    public void setIDAsistente(Integer iDAsistente) {
        this.iDAsistente = iDAsistente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Collection<ProgramaciónCitas> getProgramaciónCitasCollection() {
        return programaciónCitasCollection;
    }

    public void setProgramaciónCitasCollection(Collection<ProgramaciónCitas> programaciónCitasCollection) {
        this.programaciónCitasCollection = programaciónCitasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAsistente != null ? iDAsistente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsistenteMedico)) {
            return false;
        }
        AsistenteMedico other = (AsistenteMedico) object;
        if ((this.iDAsistente == null && other.iDAsistente != null) || (this.iDAsistente != null && !this.iDAsistente.equals(other.iDAsistente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.AsistenteMedico[ iDAsistente=" + iDAsistente + " ]";
    }
    
}
