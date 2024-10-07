/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.dto;

import com.abarrotes.dto.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author juanc
 */

public class UsuarioDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idUsuarioPk;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String contraseña;
    private String userName;
    private String sexo;
    private Date fechaNac;
    private String telefono;
    private String correo;
    private String direccion;
    private String cp;
    private Date fechaDeAlta;
    private Character genero;
    private Character estatus;
    private Long sueldo;
    private String urlFoto;
    private Integer bodegaList;
    private Integer idSucursalFk;

    public UsuarioDto() {
    }

    public UsuarioDto(Integer idUsuarioPk) {
        this.idUsuarioPk = idUsuarioPk;
    }

    public Integer getIdUsuarioPk() {
        return idUsuarioPk;
    }

    public void setIdUsuarioPk(Integer idUsuarioPk) {
        this.idUsuarioPk = idUsuarioPk;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Date getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(Date fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public Character getEstatus() {
        return estatus;
    }

    public void setEstatus(Character estatus) {
        this.estatus = estatus;
    }

    public Long getSueldo() {
        return sueldo;
    }

    public void setSueldo(Long sueldo) {
        this.sueldo = sueldo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public Integer getBodegaList() {
        return bodegaList;
    }

    public void setBodegaList(Integer bodegaList) {
        this.bodegaList = bodegaList;
    }

    public Integer getIdSucursalFk() {
        return idSucursalFk;
    }

    public void setIdSucursalFk(Integer idSucursalFk) {
        this.idSucursalFk = idSucursalFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioPk != null ? idUsuarioPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioDto)) {
            return false;
        }
        UsuarioDto other = (UsuarioDto) object;
        if ((this.idUsuarioPk == null && other.idUsuarioPk != null) || (this.idUsuarioPk != null && !this.idUsuarioPk.equals(other.idUsuarioPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidades.Usuario[ idUsuarioPk=" + idUsuarioPk + " ]";
    }
    
}
