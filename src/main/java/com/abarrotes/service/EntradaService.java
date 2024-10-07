/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.EntradaDto;
import com.abarrotes.entidades.Entrada;
import com.abarrotes.repository.EntradaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class EntradaService {
    @Autowired
    EntradaRepository entradaRepository;
    public List<Entrada> findAll(){
    List<Entrada> lstEntradaDto = entradaRepository.findAll();
    return lstEntradaDto;
        }
    private EntradaDto converterEntidadDto (Entrada e){
    EntradaDto entradaDto = new EntradaDto();
    entradaDto.setIdEntradaPk(e.getIdEntradaPk());
    entradaDto.setIdProvedorFk(e.getIdProvedorFk());
    entradaDto.setMovimiento(e.getMovimiento());
    entradaDto.setFecha(e.getFecha());
    entradaDto.setRemision(e.getRemision());
    entradaDto.setIdSucursalFk(e.getIdSucursalFk());
    entradaDto.setEstatus(e.getEstatus());
    entradaDto.setKilosTotales(e.getKilosTotales());
    entradaDto.setComentarios(e.getComentarios());
    entradaDto.setFechaRemision(e.getFechaRemision());
    entradaDto.setIdUsuarioFk(e.getIdUsuarioFk());
    entradaDto.setFechaPago(e.getFechaPago());
    entradaDto.setUrlImagen(e.getUrlImagen());
    entradaDto.setFechaCancelacionFk(e.getFechaCancelacionFk());
    entradaDto.setFactura(e.getFactura());
    
    return entradaDto;
    }
    
    private Entrada converterDtoEntidad (Entrada e){
    Entrada entrada = new Entrada();
    entrada.setIdEntradaPk(e.getIdEntradaPk());
    entrada.setIdProvedorFk(e.getIdProvedorFk());
    entrada.setMovimiento(e.getMovimiento());
    entrada.setFecha(e.getFecha());
    entrada.setRemision(e.getRemision());
    entrada.setIdSucursalFk(e.getIdSucursalFk());
    entrada.setEstatus(e.getEstatus());
    entrada.setKilosTotales(e.getKilosTotales());
    entrada.setComentarios(e.getComentarios());
    entrada.setFechaRemision(e.getFechaRemision());
    entrada.setIdUsuarioFk(e.getIdUsuarioFk());
    entrada.setFechaPago(e.getFechaPago());
    entrada.setUrlImagen(e.getUrlImagen());
    entrada.setFechaCancelacionFk(e.getFechaCancelacionFk());
    entrada.setFactura(e.getFactura());
    
    return entrada;
    }
}
