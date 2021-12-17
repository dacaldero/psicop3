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
import javax.validation.constraints.Size;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "pacientes")
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p")})
public class Pacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUsuario")
    private Integer iDUsuario;
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
    @Size(min = 1, max = 20)
    @Column(name = "Tipo_Identificaci\u00f3n")
    private String tipoIdentificación;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Identificaci\u00f3n")
    private int identificación;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Direcci\u00f3n")
    private String dirección;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Departamento")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "Genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Profesi\u00f3n")
    private String profesión;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Ocupaci\u00f3n")
    private String ocupación;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Nivel_Escolaridad")
    private String nivelEscolaridad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Estado_Civil")
    private String estadoCivil;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Edad")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Tel\u00e9fono")
    private String teléfono;
    @Column(name = "Estado")
    private Short estado;
    @Column(name = "fk_usuatiende")
    private Integer fkUsuatiende;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private Collection<Acudientes> acudientesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private Collection<ProgramaciónCitas> programaciónCitasCollection;
    @JoinColumns({
        @JoinColumn(name = "fk_usuasigna", referencedColumnName = "use_usuariosid"),
        @JoinColumn(name = "fk_usuasigna", referencedColumnName = "use_usuariosid")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuarios usuarios;
    @JoinColumns({
        @JoinColumn(name = "fk_usucrea", referencedColumnName = "use_usuariosid"),
        @JoinColumn(name = "fk_usucrea", referencedColumnName = "use_usuariosid")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuarios usuarios1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private Collection<HistoriasClinicas> historiasClinicasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private Collection<AtenciónConsultas> atenciónConsultasCollection;

    public Pacientes() {
    }

    public Pacientes(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public Pacientes(Integer iDUsuario, String nombre, String apellidoPaterno, String apellidoMaterno, String tipoIdentificación, int identificación, String dirección, String departamento, String ciudad, String genero, String profesión, String ocupación, String nivelEscolaridad, String estadoCivil, String email, Date fechaNacimiento, int edad, String teléfono) {
        this.iDUsuario = iDUsuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoIdentificación = tipoIdentificación;
        this.identificación = identificación;
        this.dirección = dirección;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.genero = genero;
        this.profesión = profesión;
        this.ocupación = ocupación;
        this.nivelEscolaridad = nivelEscolaridad;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.teléfono = teléfono;
    }

    public Integer getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
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

    public String getTipoIdentificación() {
        return tipoIdentificación;
    }

    public void setTipoIdentificación(String tipoIdentificación) {
        this.tipoIdentificación = tipoIdentificación;
    }

    public int getIdentificación() {
        return identificación;
    }

    public void setIdentificación(int identificación) {
        this.identificación = identificación;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    public String getOcupación() {
        return ocupación;
    }

    public void setOcupación(String ocupación) {
        this.ocupación = ocupación;
    }

    public String getNivelEscolaridad() {
        return nivelEscolaridad;
    }

    public void setNivelEscolaridad(String nivelEscolaridad) {
        this.nivelEscolaridad = nivelEscolaridad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Integer getFkUsuatiende() {
        return fkUsuatiende;
    }

    public void setFkUsuatiende(Integer fkUsuatiende) {
        this.fkUsuatiende = fkUsuatiende;
    }

    public Collection<Acudientes> getAcudientesCollection() {
        return acudientesCollection;
    }

    public void setAcudientesCollection(Collection<Acudientes> acudientesCollection) {
        this.acudientesCollection = acudientesCollection;
    }

    public Collection<ProgramaciónCitas> getProgramaciónCitasCollection() {
        return programaciónCitasCollection;
    }

    public void setProgramaciónCitasCollection(Collection<ProgramaciónCitas> programaciónCitasCollection) {
        this.programaciónCitasCollection = programaciónCitasCollection;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Usuarios getUsuarios1() {
        return usuarios1;
    }

    public void setUsuarios1(Usuarios usuarios1) {
        this.usuarios1 = usuarios1;
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
        hash += (iDUsuario != null ? iDUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.iDUsuario == null && other.iDUsuario != null) || (this.iDUsuario != null && !this.iDUsuario.equals(other.iDUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.Pacientes[ iDUsuario=" + iDUsuario + " ]";
    }
    
}
