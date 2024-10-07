/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.BodegaDto;
import com.abarrotes.entidades.Bodega;
import com.abarrotes.repository.BodegaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */
@Service

public class BodegaService {
    @Autowired
    BodegaRepository bodegaRepository;
    public List<Bodega> findAll(){
    List<Bodega> lstBodegaDto = bodegaRepository.findAll();
    return lstBodegaDto;
        }
    
    private BodegaDto converterEntidadDto(Bodega b){
        BodegaDto bodegaDto = new BodegaDto();
        bodegaDto.setDescripcion(b.getDescripcion());
        bodegaDto.setEstatus(b.getEstatus());
        bodegaDto.setFechaAlta(b.getFechaAlta());
        bodegaDto.setIdBodegaPk(b.getIdBodegaPk());
        bodegaDto.setIdUsuarioFk(b.getIdUsuarioFk().getIdUsuarioPk());
        bodegaDto.setNombre(b.getNombre());
        
    return bodegaDto;
    }
    private Bodega converterDtoEntidad(Bodega b){
        Bodega bodega = new Bodega();
        bodega.setDescripcion(b.getDescripcion());
        bodega.setEstatus(b.getEstatus());
        bodega.setFechaAlta(b.getFechaAlta());
        bodega.setIdBodegaPk(b.getIdBodegaPk());
        bodega.setIdUsuarioFk(b.getIdUsuarioFk());
        bodega.setNombre(b.getNombre());
    return bodega;
    }
}