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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "psicologos")
@NamedQueries({
    @NamedQuery(name = "Psicologos.findAll", query = "SELECT p FROM Psicologos p")})
public class Psicologos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPsicologo")
    private Integer iDPsicologo;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "Identificaci\u00f3n_Psicologo")
    private int identificaciónPsicologo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tarjeta_Profesional")
    private int tarjetaProfesional;
    @JoinColumn(name = "IDEspecialidad", referencedColumnName = "IDEspecialidad")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Especialidades iDEspecialidad;
    @JoinColumn(name = "IDTipo_Consulta", referencedColumnName = "IDTipo_Consulta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposConsulta iDTipoConsulta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPsicologo", fetch = FetchType.LAZY)
    private Collection<ProgramaciónCitas> programaciónCitasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPsicologo", fetch = FetchType.LAZY)
    private Collection<HistoriasClinicas> historiasClinicasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPsicologo", fetch = FetchType.LAZY)
    private Collection<AtenciónConsultas> atenciónConsultasCollection;

    public Psicologos() {
    }

    public Psicologos(Integer iDPsicologo) {
        this.iDPsicologo = iDPsicologo;
    }

    public Psicologos(Integer iDPsicologo, String nombre, String apellidoPaterno, String apellidoMaterno, int identificaciónPsicologo, int tarjetaProfesional) {
        this.iDPsicologo = iDPsicologo;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.identificaciónPsicologo = identificaciónPsicologo;
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public Integer getIDPsicologo() {
        return iDPsicologo;
    }

    public void setIDPsicologo(Integer iDPsicologo) {
        this.iDPsicologo = iDPsicologo;
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

    public int getIdentificaciónPsicologo() {
        return identificaciónPsicologo;
    }

    public void setIdentificaciónPsicologo(int identificaciónPsicologo) {
        this.identificaciónPsicologo = identificaciónPsicologo;
    }

    public int getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(int tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public Especialidades getIDEspecialidad() {
        return iDEspecialidad;
    }

    public void setIDEspecialidad(Especialidades iDEspecialidad) {
        this.iDEspecialidad = iDEspecialidad;
    }

    public TiposConsulta getIDTipoConsulta() {
        return iDTipoConsulta;
    }

    public void setIDTipoConsulta(TiposConsulta iDTipoConsulta) {
        this.iDTipoConsulta = iDTipoConsulta;
    }

    public Collection<ProgramaciónCitas> getProgramaciónCitasCollection() {
        return programaciónCitasCollection;
    }

    public void setProgramaciónCitasCollection(Collection<ProgramaciónCitas> programaciónCitasCollection) {
        this.programaciónCitasCollection = programaciónCitasCollection;
    }

    public Collection<HistoriasClinicas> getHistoriasClinicasCollection() {
        return historiasClinicasCollection;
    }

    public void setHistoriasClinicasCollection(Collection<HistoriasClinicas> historiasClinicasCollection) {
        this.historiasClinicasCollection = historiasClinicasCollection;
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
        hash += (iDPsicologo != null ? iDPsicologo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Psicologos)) {
            return false;
        }
        Psicologos other = (Psicologos) object;
        if ((this.iDPsicologo == null && other.iDPsicologo != null) || (this.iDPsicologo != null && !this.iDPsicologo.equals(other.iDPsicologo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.Psicologos[ iDPsicologo=" + iDPsicologo + " ]";
    }
    
}
