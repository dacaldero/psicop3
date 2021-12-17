/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.psicop2;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "tbl_usuarios")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "use_usuariosid")
    private Integer useUsuariosid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "use_tipodocumento")
    private String useTipodocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "use_documento")
    private int useDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "use_nombre")
    private String useNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "use_apellido")
    private String useApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "use_correoelectronico")
    private String useCorreoelectronico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "use_clavel")
    private String useClavel;
    @Column(name = "estado")
    private Short estado;
    @ManyToMany(mappedBy = "usuariosCollection", fetch = FetchType.LAZY)
    private Collection<Rol> rolCollection;
    @OneToMany(mappedBy = "usuarios", fetch = FetchType.LAZY)
    private Collection<Pacientes> pacientesCollection;
    @OneToMany(mappedBy = "usuarios1", fetch = FetchType.LAZY)
    private Collection<Pacientes> pacientesCollection1;

    public Usuarios() {
    }

    public Usuarios(Integer useUsuariosid) {
        this.useUsuariosid = useUsuariosid;
    }

    public Usuarios(Integer useUsuariosid, String useTipodocumento, int useDocumento, String useNombre, String useApellido, String useCorreoelectronico, String useClavel) {
        this.useUsuariosid = useUsuariosid;
        this.useTipodocumento = useTipodocumento;
        this.useDocumento = useDocumento;
        this.useNombre = useNombre;
        this.useApellido = useApellido;
        this.useCorreoelectronico = useCorreoelectronico;
        this.useClavel = useClavel;
    }

    public Integer getUseUsuariosid() {
        return useUsuariosid;
    }

    public void setUseUsuariosid(Integer useUsuariosid) {
        this.useUsuariosid = useUsuariosid;
    }

    public String getUseTipodocumento() {
        return useTipodocumento;
    }

    public void setUseTipodocumento(String useTipodocumento) {
        this.useTipodocumento = useTipodocumento;
    }

    public int getUseDocumento() {
        return useDocumento;
    }

    public void setUseDocumento(int useDocumento) {
        this.useDocumento = useDocumento;
    }

    public String getUseNombre() {
        return useNombre;
    }

    public void setUseNombre(String useNombre) {
        this.useNombre = useNombre;
    }

    public String getUseApellido() {
        return useApellido;
    }

    public void setUseApellido(String useApellido) {
        this.useApellido = useApellido;
    }

    public String getUseCorreoelectronico() {
        return useCorreoelectronico;
    }

    public void setUseCorreoelectronico(String useCorreoelectronico) {
        this.useCorreoelectronico = useCorreoelectronico;
    }

    public String getUseClavel() {
        return useClavel;
    }

    public void setUseClavel(String useClavel) {
        this.useClavel = useClavel;
    }

    public Short getEstado() {
        return estado;
    }

    public void setEstado(Short estado) {
        this.estado = estado;
    }

    public Collection<Rol> getRolCollection() {
        return rolCollection;
    }

    public void setRolCollection(Collection<Rol> rolCollection) {
        this.rolCollection = rolCollection;
    }

    public Collection<Pacientes> getPacientesCollection() {
        return pacientesCollection;
    }

    public void setPacientesCollection(Collection<Pacientes> pacientesCollection) {
        this.pacientesCollection = pacientesCollection;
    }

    public Collection<Pacientes> getPacientesCollection1() {
        return pacientesCollection1;
    }

    public void setPacientesCollection1(Collection<Pacientes> pacientesCollection1) {
        this.pacientesCollection1 = pacientesCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (useUsuariosid != null ? useUsuariosid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.useUsuariosid == null && other.useUsuariosid != null) || (this.useUsuariosid != null && !this.useUsuariosid.equals(other.useUsuariosid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.psicop2.Usuarios[ useUsuariosid=" + useUsuariosid + " ]";
    }
    
}
