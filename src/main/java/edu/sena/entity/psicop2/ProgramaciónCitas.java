/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.psicop2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "programaci\u00f3n_citas")
@NamedQueries({
    @NamedQuery(name = "Programaci\u00f3nCitas.findAll", query = "SELECT p FROM Programaci\u00f3nCitas p")})
public class ProgramaciónCitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCita")
    private Integer iDCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinColumn(name = "IDAsistente", referencedColumnName = "IDAsistente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AsistenteMedico iDAsistente;
    @JoinColumns({
        @JoinColumn(name = "IDPaciente", referencedColumnName = "IDUsuario"),
        @JoinColumn(name = "IDPaciente", referencedColumnName = "IDUsuario")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "IDPsicologo", referencedColumnName = "IDPsicologo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Psicologos iDPsicologo;
    @JoinColumn(name = "IDTipo_Consulta", referencedColumnName = "IDTipo_Consulta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposConsulta iDTipoConsulta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDCita", fetch = FetchType.LAZY)
    private Collection<AtenciónConsultas> atenciónConsultasCollection;

    public ProgramaciónCitas() {
    }

    public ProgramaciónCitas(Integer iDCita) {
        this.iDCita = iDCita;
    }

    public ProgramaciónCitas(Integer iDCita, Date fecha, Date hora) {
        this.iDCita = iDCita;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getIDCita() {
        return iDCita;
    }

    public void setIDCita(Integer iDCita) {
        this.iDCita = iDCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public AsistenteMedico getIDAsistente() {
        return iDAsistente;
    }

    public void setIDAsistente(AsistenteMedico iDAsistente) {
        this.iDAsistente = iDAsistente;
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

    public TiposConsulta getIDTipoConsulta() {
        return iDTipoConsulta;
    }

    public void setIDTipoConsulta(TiposConsulta iDTipoConsulta) {
        this.iDTipoConsulta = iDTipoConsulta;
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
        hash += (iDCita != null ? iDCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramaciónCitas)) {
            return false;
        }
        ProgramaciónCitas other = (ProgramaciónCitas) object;
        if ((this.iDCita == null && other.iDCita != null) || (this.iDCita != null && !this.iDCita.equals(other.iDCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.Programaci\u00f3nCitas[ iDCita=" + iDCita + " ]";
    }
    
}
