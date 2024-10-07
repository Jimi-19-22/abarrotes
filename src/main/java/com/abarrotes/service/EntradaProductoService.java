/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.EntradaProductoDto;
import com.abarrotes.entidades.EntradaProducto;
import com.abarrotes.repository.EntradaProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class EntradaProductoService {
    @Autowired
    EntradaProductoRepository entradaProductoRepository;
    public List<EntradaProducto> findAll(){
    List<EntradaProducto> lstEntradaProductoDto = entradaProductoRepository.findAll();
    return lstEntradaProductoDto;
    }
    
    private EntradaProductoDto converterEntidadDto(EntradaProducto e){
        EntradaProductoDto entradaProductoDto = new EntradaProductoDto();
        entradaProductoDto.setIdEntradaProductoPk(e.getIdEntradaProductoPk());
        entradaProductoDto.setIdEntradaFk(e.getIdEntradaFk());
        entradaProductoDto.setIdProductoFk(e.getIdProductoFk());
        entradaProductoDto.setKilos(e.getKilos());
        entradaProductoDto.setCantidad(e.getCantidad());
        entradaProductoDto.setComentarios(e.getComentarios());
        entradaProductoDto.setCosto(e.getCosto());
        
        return entradaProductoDto;
    }
    
    private EntradaProducto converterDtoEntidad(EntradaProducto e){
        EntradaProducto entradaProducto = new EntradaProducto();
        entradaProducto.setIdEntradaProductoPk(e.getIdEntradaProductoPk());
        entradaProducto.setIdEntradaFk(e.getIdEntradaFk());
        entradaProducto.setIdProductoFk(e.getIdProductoFk());
        entradaProducto.setKilos(e.getKilos());
        entradaProducto.setCantidad(e.getCantidad());
        entradaProducto.setComentarios(e.getComentarios());
        entradaProducto.setCosto(e.getCosto());
        
        return entradaProducto;
    }
        
    }

