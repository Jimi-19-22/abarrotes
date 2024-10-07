/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanc
 */
@Entity
@Table(name = "entrada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrada.findAll", query = "SELECT e FROM Entrada e"),
    @NamedQuery(name = "Entrada.findByIdEntradaPk", query = "SELECT e FROM Entrada e WHERE e.idEntradaPk = :idEntradaPk"),
    @NamedQuery(name = "Entrada.findByIdProvedorFk", query = "SELECT e FROM Entrada e WHERE e.idProvedorFk = :idProvedorFk"),
    @NamedQuery(name = "Entrada.findByMovimiento", query = "SELECT e FROM Entrada e WHERE e.movimiento = :movimiento"),
    @NamedQuery(name = "Entrada.findByFecha", query = "SELECT e FROM Entrada e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "Entrada.findByRemision", query = "SELECT e FROM Entrada e WHERE e.remision = :remision"),
    @NamedQuery(name = "Entrada.findByIdSucursalFk", query = "SELECT e FROM Entrada e WHERE e.idSucursalFk = :idSucursalFk"),
    @NamedQuery(name = "Entrada.findByEstatus", query = "SELECT e FROM Entrada e WHERE e.estatus = :estatus"),
    @NamedQuery(name = "Entrada.findByKilosTotales", query = "SELECT e FROM Entrada e WHERE e.kilosTotales = :kilosTotales"),
    @NamedQuery(name = "Entrada.findByComentarios", query = "SELECT e FROM Entrada e WHERE e.comentarios = :comentarios"),
    @NamedQuery(name = "Entrada.findByFechaRemision", query = "SELECT e FROM Entrada e WHERE e.fechaRemision = :fechaRemision"),
    @NamedQuery(name = "Entrada.findByIdUsuarioFk", query = "SELECT e FROM Entrada e WHERE e.idUsuarioFk = :idUsuarioFk"),
    @NamedQuery(name = "Entrada.findByFechaPago", query = "SELECT e FROM Entrada e WHERE e.fechaPago = :fechaPago"),
    @NamedQuery(name = "Entrada.findByUrlImagen", query = "SELECT e FROM Entrada e WHERE e.urlImagen = :urlImagen"),
    @NamedQuery(name = "Entrada.findByFechaCancelacionFk", query = "SELECT e FROM Entrada e WHERE e.fechaCancelacionFk = :fechaCancelacionFk"),
    @NamedQuery(name = "Entrada.findByFactura", query = "SELECT e FROM Entrada e WHERE e.factura = :factura"),
    @NamedQuery(name = "Entrada.findByNumeroFactura", query = "SELECT e FROM Entrada e WHERE e.numeroFactura = :numeroFactura")})
public class Entrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entrada_pk")
    private Integer idEntradaPk;
    @Column(name = "id_provedor_fk")
    private Integer idProvedorFk;
    @Column(name = "movimiento")
    private Integer movimiento;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "remision")
    private String remision;
    @Column(name = "id_sucursal_fk")
    private Integer idSucursalFk;
    @Column(name = "estatus")
    private String estatus;
    @Column(name = "kilos_totales")
    private Long kilosTotales;
    @Column(name = "comentarios")
    private String comentarios;
    @Column(name = "fecha_remision")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRemision;
    @Column(name = "id_usuario_fk")
    private Integer idUsuarioFk;
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    @Column(name = "url_imagen")
    private String urlImagen;
    @Column(name = "fecha_cancelacion_fk")
    private Integer fechaCancelacionFk;
    @Column(name = "factura")
    private String factura;
    @Column(name = "numero_factura")
    private String numeroFactura;

    public Entrada() {
    }

    public Entrada(Integer idEntradaPk) {
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
        if (!(object instanceof Entrada)) {
            return false;
        }
        Entrada other = (Entrada) object;
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
