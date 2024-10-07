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
public class VentaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idVentaPk;
    private Integer idClienteFk;
    private Integer idVendedorFk;
    private Date fechaVenta;
    private Date fechaPromesaPago;
    private Integer statusFk;
    private Date fechaPago;
    private Integer idSuscursalFk;
    private Integer idCajeroFk;
    private Integer idCancelUserFk;
    private Date fechaCancelacion;
    private Date fechaEntrega;
    private Integer idEntregaUserFk;
    private String comentariosCancel;
    private Integer folioSucursal;
    private Character tipoVenta;
    private Integer idUsuarioFk;
    private Character statusAproCancel;
    private Character estatusFactura;
    private String factura;

    public VentaDto() {
    }

    public VentaDto(Integer idVentaPk) {
        this.idVentaPk = idVentaPk;
    }

    public Integer getIdVentaPk() {
        return idVentaPk;
    }

    public void setIdVentaPk(Integer idVentaPk) {
        this.idVentaPk = idVentaPk;
    }

    public Integer getIdClienteFk() {
        return idClienteFk;
    }

    public void setIdClienteFk(Integer idClienteFk) {
        this.idClienteFk = idClienteFk;
    }

    public Integer getIdVendedorFk() {
        return idVendedorFk;
    }

    public void setIdVendedorFk(Integer idVendedorFk) {
        this.idVendedorFk = idVendedorFk;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getFechaPromesaPago() {
        return fechaPromesaPago;
    }

    public void setFechaPromesaPago(Date fechaPromesaPago) {
        this.fechaPromesaPago = fechaPromesaPago;
    }

    public Integer getStatusFk() {
        return statusFk;
    }

    public void setStatusFk(Integer statusFk) {
        this.statusFk = statusFk;
    }

    

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Integer getIdSuscursalFk() {
        return idSuscursalFk;
    }

    public void setIdSuscursalFk(Integer idSuscursalFk) {
        this.idSuscursalFk = idSuscursalFk;
    }

    public Integer getIdCajeroFk() {
        return idCajeroFk;
    }

    public void setIdCajeroFk(Integer idCajeroFk) {
        this.idCajeroFk = idCajeroFk;
    }

    public Integer getIdCancelUserFk() {
        return idCancelUserFk;
    }

    public void setIdCancelUserFk(Integer idCancelUserFk) {
        this.idCancelUserFk = idCancelUserFk;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getIdEntregaUserFk() {
        return idEntregaUserFk;
    }

    public void setIdEntregaUserFk(Integer idEntregaUserFk) {
        this.idEntregaUserFk = idEntregaUserFk;
    }

    public String getComentariosCancel() {
        return comentariosCancel;
    }

    public void setComentariosCancel(String comentariosCancel) {
        this.comentariosCancel = comentariosCancel;
    }

    public Integer getFolioSucursal() {
        return folioSucursal;
    }

    public void setFolioSucursal(Integer folioSucursal) {
        this.folioSucursal = folioSucursal;
    }

    public Character getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(Character tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public Integer getIdUsuarioFk() {
        return idUsuarioFk;
    }

    public void setIdUsuarioFk(Integer idUsuarioFk) {
        this.idUsuarioFk = idUsuarioFk;
    }

    public Character getStatusAproCancel() {
        return statusAproCancel;
    }

    public void setStatusAproCancel(Character statusAproCancel) {
        this.statusAproCancel = statusAproCancel;
    }

    public Character getEstatusFactura() {
        return estatusFactura;
    }

    public void setEstatusFactura(Character estatusFactura) {
        this.estatusFactura = estatusFactura;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVentaPk != null ? idVentaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaDto)) {
            return false;
        }
        VentaDto other = (VentaDto) object;
        if ((this.idVentaPk == null && other.idVentaPk != null) || (this.idVentaPk != null && !this.idVentaPk.equals(other.idVentaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abarrotes.entidades.Venta[ idVentaPk=" + idVentaPk + " ]";
    }
    
}
