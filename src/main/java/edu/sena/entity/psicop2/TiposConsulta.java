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
@Table(name = "tipos_consulta")
@NamedQueries({
    @NamedQuery(name = "TiposConsulta.findAll", query = "SELECT t FROM TiposConsulta t")})
public class TiposConsulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTipo_Consulta")
    private Integer iDTipoConsulta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Nombre_Tipos_Consulta")
    private String nombreTiposConsulta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valor_Consulta")
    private double valorConsulta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDTipoConsulta", fetch = FetchType.LAZY)
    private Collection<Psicologos> psicologosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDTipoConsulta", fetch = FetchType.LAZY)
    private Collection<ProgramaciónCitas> programaciónCitasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDTipoConsulta", fetch = FetchType.LAZY)
    private Collection<AtenciónConsultas> atenciónConsultasCollection;

    public TiposConsulta() {
    }

    public TiposConsulta(Integer iDTipoConsulta) {
        this.iDTipoConsulta = iDTipoConsulta;
    }

    public TiposConsulta(Integer iDTipoConsulta, String nombreTiposConsulta, double valorConsulta) {
        this.iDTipoConsulta = iDTipoConsulta;
        this.nombreTiposConsulta = nombreTiposConsulta;
        this.valorConsulta = valorConsulta;
    }

    public Integer getIDTipoConsulta() {
        return iDTipoConsulta;
    }

    public void setIDTipoConsulta(Integer iDTipoConsulta) {
        this.iDTipoConsulta = iDTipoConsulta;
    }

    public String getNombreTiposConsulta() {
        return nombreTiposConsulta;
    }

    public void setNombreTiposConsulta(String nombreTiposConsulta) {
        this.nombreTiposConsulta = nombreTiposConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Collection<Psicologos> getPsicologosCollection() {
        return psicologosCollection;
    }

    public void setPsicologosCollection(Collection<Psicologos> psicologosCollection) {
        this.psicologosCollection = psicologosCollection;
    }

    public Collection<ProgramaciónCitas> getProgramaciónCitasCollection() {
        return programaciónCitasCollection;
    }

    public void setProgramaciónCitasCollection(Collection<ProgramaciónCitas> programaciónCitasCollection) {
        this.programaciónCitasCollection = programaciónCitasCollection;
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
        hash += (iDTipoConsulta != null ? iDTipoConsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposConsulta)) {
            return false;
        }
        TiposConsulta other = (TiposConsulta) object;
        if ((this.iDTipoConsulta == null && other.iDTipoConsulta != null) || (this.iDTipoConsulta != null && !this.iDTipoConsulta.equals(other.iDTipoConsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.TiposConsulta[ iDTipoConsulta=" + iDTipoConsulta + " ]";
    }
    
}
