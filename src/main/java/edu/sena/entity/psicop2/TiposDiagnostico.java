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
import javax.persistence.Lob;
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
@Table(name = "tipos_diagnostico")
@NamedQueries({
    @NamedQuery(name = "TiposDiagnostico.findAll", query = "SELECT t FROM TiposDiagnostico t")})
public class TiposDiagnostico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDDiagnostico")
    private Integer iDDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre_Diagnostico")
    private String nombreDiagnostico;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Descripci\u00f3n")
    private String descripción;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDiagnostico", fetch = FetchType.LAZY)
    private Collection<AtenciónConsultas> atenciónConsultasCollection;

    public TiposDiagnostico() {
    }

    public TiposDiagnostico(Integer iDDiagnostico) {
        this.iDDiagnostico = iDDiagnostico;
    }

    public TiposDiagnostico(Integer iDDiagnostico, String nombreDiagnostico, String descripción) {
        this.iDDiagnostico = iDDiagnostico;
        this.nombreDiagnostico = nombreDiagnostico;
        this.descripción = descripción;
    }

    public Integer getIDDiagnostico() {
        return iDDiagnostico;
    }

    public void setIDDiagnostico(Integer iDDiagnostico) {
        this.iDDiagnostico = iDDiagnostico;
    }

    public String getNombreDiagnostico() {
        return nombreDiagnostico;
    }

    public void setNombreDiagnostico(String nombreDiagnostico) {
        this.nombreDiagnostico = nombreDiagnostico;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Collection<AtenciónConsultas> getAtenciónConsultasCollection() {
        return atenciónConsultasCollection;
    }

    public void setAtenciónConsultasCollection(Collection<AtenciónConsultas> atenciónConsultasCollection) {
        this.atenciónConsultasCollection = atenciónConsultasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDiagnostico != null ? iDDiagnostico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposDiagnostico)) {
            return false;
        }
        TiposDiagnostico other = (TiposDiagnostico) object;
        if ((this.iDDiagnostico == null && other.iDDiagnostico != null) || (this.iDDiagnostico != null && !this.iDDiagnostico.equals(other.iDDiagnostico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.TiposDiagnostico[ iDDiagnostico=" + iDDiagnostico + " ]";
    }
    
}
