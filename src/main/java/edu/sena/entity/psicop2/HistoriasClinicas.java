/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.psicop2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "historias_clinicas")
@NamedQueries({
    @NamedQuery(name = "HistoriasClinicas.findAll", query = "SELECT h FROM HistoriasClinicas h")})
public class HistoriasClinicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDHistoria_Clinica")
    private Integer iDHistoriaClinica;
    @JoinColumn(name = "IDConsulta", referencedColumnName = "IDConsulta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AtenciónConsultas iDConsulta;
    @JoinColumns({
        @JoinColumn(name = "IDPaciente", referencedColumnName = "IDUsuario"),
        @JoinColumn(name = "IDPaciente", referencedColumnName = "IDUsuario")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "IDPsicologo", referencedColumnName = "IDPsicologo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Psicologos iDPsicologo;

    public HistoriasClinicas() {
    }

    public HistoriasClinicas(Integer iDHistoriaClinica) {
        this.iDHistoriaClinica = iDHistoriaClinica;
    }

    public Integer getIDHistoriaClinica() {
        return iDHistoriaClinica;
    }

    public void setIDHistoriaClinica(Integer iDHistoriaClinica) {
        this.iDHistoriaClinica = iDHistoriaClinica;
    }

    public AtenciónConsultas getIDConsulta() {
        return iDConsulta;
    }

    public void setIDConsulta(AtenciónConsultas iDConsulta) {
        this.iDConsulta = iDConsulta;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Psicologos getIDPsicologo() {
        return iDPsicologo;
    }

    public void setIDPsicologo(Psicologos iDPsicologo) {
        this.iDPsicologo = iDPsicologo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDHistoriaClinica != null ? iDHistoriaClinica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriasClinicas)) {
            return false;
        }
        HistoriasClinicas other = (HistoriasClinicas) object;
        if ((this.iDHistoriaClinica == null && other.iDHistoriaClinica != null) || (this.iDHistoriaClinica != null && !this.iDHistoriaClinica.equals(other.iDHistoriaClinica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.HistoriasClinicas[ iDHistoriaClinica=" + iDHistoriaClinica + " ]";
    }
    
}
