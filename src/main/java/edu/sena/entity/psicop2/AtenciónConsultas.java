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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "atenci\u00f3n_consultas")
@NamedQueries({
    @NamedQuery(name = "Atenci\u00f3nConsultas.findAll", query = "SELECT a FROM Atenci\u00f3nConsultas a")})
public class AtenciónConsultas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDConsulta")
    private Integer iDConsulta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Consulta")
    @Temporal(TemporalType.DATE)
    private Date fechaConsulta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hora_Consulta")
    @Temporal(TemporalType.TIME)
    private Date horaConsulta;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Valoraci\u00f3n_Inicial")
    private String valoraciónInicial;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Motivo_Consulta")
    private String motivoConsulta;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Recomendaciones")
    private String recomendaciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDConsulta", fetch = FetchType.LAZY)
    private Collection<HistoriasClinicas> historiasClinicasCollection;
    @JoinColumns({
        @JoinColumn(name = "IDPaciente", referencedColumnName = "IDUsuario"),
        @JoinColumn(name = "IDPaciente", referencedColumnName = "IDUsuario")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "IDCita", referencedColumnName = "IDCita")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ProgramaciónCitas iDCita;
    @JoinColumn(name = "IDPsicologo", referencedColumnName = "IDPsicologo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Psicologos iDPsicologo;
    @JoinColumn(name = "IDTipo_Consulta", referencedColumnName = "IDTipo_Consulta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposConsulta iDTipoConsulta;
    @JoinColumn(name = "IDDiagnostico", referencedColumnName = "IDDiagnostico")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposDiagnostico iDDiagnostico;

    public AtenciónConsultas() {
    }

    public AtenciónConsultas(Integer iDConsulta) {
        this.iDConsulta = iDConsulta;
    }

    public AtenciónConsultas(Integer iDConsulta, Date fechaConsulta, Date horaConsulta, String valoraciónInicial, String motivoConsulta, String recomendaciones) {
        this.iDConsulta = iDConsulta;
        this.fechaConsulta = fechaConsulta;
        this.horaConsulta = horaConsulta;
        this.valoraciónInicial = valoraciónInicial;
        this.motivoConsulta = motivoConsulta;
        this.recomendaciones = recomendaciones;
    }

    public Integer getIDConsulta() {
        return iDConsulta;
    }

    public void setIDConsulta(Integer iDConsulta) {
        this.iDConsulta = iDConsulta;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Date getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(Date horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getValoraciónInicial() {
        return valoraciónInicial;
    }

    public void setValoraciónInicial(String valoraciónInicial) {
        this.valoraciónInicial = valoraciónInicial;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public Collection<HistoriasClinicas> getHistoriasClinicasCollection() {
        return historiasClinicasCollection;
    }

    public void setHistoriasClinicasCollection(Collection<HistoriasClinicas> historiasClinicasCollection) {
        this.historiasClinicasCollection = historiasClinicasCollection;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public ProgramaciónCitas getIDCita() {
        return iDCita;
    }

    public void setIDCita(ProgramaciónCitas iDCita) {
        this.iDCita = iDCita;
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

    public TiposDiagnostico getIDDiagnostico() {
        return iDDiagnostico;
    }

    public void setIDDiagnostico(TiposDiagnostico iDDiagnostico) {
        this.iDDiagnostico = iDDiagnostico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDConsulta != null ? iDConsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtenciónConsultas)) {
            return false;
        }
        AtenciónConsultas other = (AtenciónConsultas) object;
        if ((this.iDConsulta == null && other.iDConsulta != null) || (this.iDConsulta != null && !this.iDConsulta.equals(other.iDConsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.Atenci\u00f3nConsultas[ iDConsulta=" + iDConsulta + " ]";
    }
    
}
