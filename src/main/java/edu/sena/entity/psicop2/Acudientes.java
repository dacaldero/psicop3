/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.psicop2;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "acudientes")
@NamedQueries({
    @NamedQuery(name = "Acudientes.findAll", query = "SELECT a FROM Acudientes a")})
public class Acudientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDAcudiente")
    private Integer iDAcudiente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Parentesco")
    private String parentesco;
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
    @Column(name = "Tipo_Identificac\u00edon")
    private String tipoIdentificacíon;
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
    @Column(name = "Ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Departamento")
    private String departamento;
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
    @Size(min = 1, max = 40)
    @Column(name = "Tel\u00e9fono")
    private String teléfono;
    @JoinColumns({
        @JoinColumn(name = "IDPaciente", referencedColumnName = "IDUsuario"),
        @JoinColumn(name = "IDPaciente", referencedColumnName = "IDUsuario")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;

    public Acudientes() {
    }

    public Acudientes(Integer iDAcudiente) {
        this.iDAcudiente = iDAcudiente;
    }

    public Acudientes(Integer iDAcudiente, String parentesco, String nombre, String apellidoPaterno, String apellidoMaterno, String tipoIdentificacíon, int identificación, String dirección, String ciudad, String departamento, String genero, String profesión, String ocupación, String nivelEscolaridad, String estadoCivil, String email, Date fechaNacimiento, int edad, String teléfono) {
        this.iDAcudiente = iDAcudiente;
        this.parentesco = parentesco;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoIdentificacíon = tipoIdentificacíon;
        this.identificación = identificación;
        this.dirección = dirección;
        this.ciudad = ciudad;
        this.departamento = departamento;
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

    public Integer getIDAcudiente() {
        return iDAcudiente;
    }

    public void setIDAcudiente(Integer iDAcudiente) {
        this.iDAcudiente = iDAcudiente;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
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

    public String getTipoIdentificacíon() {
        return tipoIdentificacíon;
    }

    public void setTipoIdentificacíon(String tipoIdentificacíon) {
        this.tipoIdentificacíon = tipoIdentificacíon;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAcudiente != null ? iDAcudiente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acudientes)) {
            return false;
        }
        Acudientes other = (Acudientes) object;
        if ((this.iDAcudiente == null && other.iDAcudiente != null) || (this.iDAcudiente != null && !this.iDAcudiente.equals(other.iDAcudiente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.Acudientes[ iDAcudiente=" + iDAcudiente + " ]";
    }
    
}
