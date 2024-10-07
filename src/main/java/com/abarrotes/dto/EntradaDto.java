/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author juanc
 */

public class EntradaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idEntradaPk;
    private Integer idProvedorFk;
    private Integer movimiento;
    private Date fecha;
    private String remision;
    private Integer idSucursalFk;
    private String estatus;
    private Long kilosTotales;
    private String comentarios;
    private Date fechaRemision;
    private Integer idUsuarioFk;
    private Date fechaPago;
    private String urlImagen;
    private Integer fechaCancelacionFk;
    private String factura;
    private String numeroFactura;

    public EntradaDto() {
    }

    public EntradaDto(Integer idEntradaPk) {
        this.idEntradaPk = idEntradaPk;
    }

    public Integer getIdEntradaPk() {
        return idEntradaPk;
    }

    public void setIdEntradaPk(Integer idEntradaPk) {
        this.idEntradaPk = idEntradaPk;
    }

    public Integer getIdProvedorFk() {
        return idProvedorFk;
    }

    public void setIdProvedorFk(Integer idProvedorFk) {
        this.idProvedorFk = idProvedorFk;
    }

    public Integer getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Integer movimiento) {
        this.movimiento = movimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRemision() {
        return remision;
    }

    public void setRemision(String remision) {
        this.remision = remision;
    }

    public Integer getIdSucursalFk() {
        return idSucursalFk;
    }

    public void setIdSucursalFk(Integer idSucursalFk) {
        this.idSucursalFk = idSucursalFk;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Long getKilosTotales() {
        return kilosTotales;
    }

    public void setKilosTotales(Long kilosTotales) {
        this.kilosTotales = kilosTotales;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFechaRemision() {
        return fechaRemision;
    }

    public void setFechaRemision(Date fechaRemision) {
        this.fechaRemision = fechaRemision;
    }

    public Integer getIdUsuarioFk() {
        return idUsuarioFk;
    }

    public void setIdUsuarioFk(Integer idUsuarioFk) {
        this.idUsuarioFk = idUsuarioFk;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public Integer getFechaCancelacionFk() {
        return fechaCancelacionFk;
    }

    public void setFechaCancelacionFk(Integer fechaCancelacionFk) {
        this.fechaCancelacionFk = fechaCancelacionFk;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntradaPk != null ? idEntradaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntradaDto)) {
            return false;
        }
        EntradaDto other = (EntradaDto) object;
        if ((this.idEntradaPk == null && other.idEntradaPk != null) || (this.idEntradaPk != null && !this.idEntradaPk.equals(other.idEntradaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidades.Entrada[ idEntradaPk=" + idEntradaPk + " ]";
    }
    
}
