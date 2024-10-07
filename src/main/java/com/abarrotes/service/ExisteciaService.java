/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.ExistenciaDto;
import com.abarrotes.entidades.Existencia;
import com.abarrotes.repository.ExistenciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class ExisteciaService {
        @Autowired
        ExistenciaRepository existenciaRepository;
        public List<Existencia> findAll(){
        List<Existencia> lstExistenciaDto = existenciaRepository.findAll();
        return lstExistenciaDto;
        }
        private ExistenciaDto converterEntidadDto(Existencia e){
        ExistenciaDto existenciaDto = new ExistenciaDto();
        existenciaDto.setIdExistenciaPk(e.getIdExistenciaPk());
        existenciaDto.setCantidad(e.getCantidad());
        existenciaDto.setKilos(e.getKilos());
        existenciaDto.setIdProductoFk(e.getIdProductoFk());
        existenciaDto.setIdBodegaFk(e.getIdBodegaFk());
        existenciaDto.setCosto(e.getCosto());
        existenciaDto.setPrecioMinimo(e.getPrecioMinimo());
        existenciaDto.setPrecioVenta(e.getPrecioVenta());
        existenciaDto.setPrecioMaximo(e.getPrecioMaximo());
        existenciaDto.setUrlImagen(e.getUrlImagen());
        existenciaDto.setUrlVideo(e.getUrlVideo());
        
        return existenciaDto;
        }
        
       private Existencia converterDtoEntidad(Existencia e){
        Existencia existencia = new Existencia();
        existencia.setIdExistenciaPk(e.getIdExistenciaPk());
        existencia.setCantidad(e.getCantidad());
        existencia.setKilos(e.getKilos());
        existencia.setIdProductoFk(e.getIdProductoFk());
        existencia.setIdBodegaFk(e.getIdBodegaFk());
        existencia.setCosto(e.getCosto());
        existencia.setPrecioMinimo(e.getPrecioMinimo());
        existencia.setPrecioVenta(e.getPrecioVenta());
        existencia.setPrecioMaximo(e.getPrecioMaximo());
        existencia.setUrlImagen(e.getUrlImagen());
        existencia.setUrlVideo(e.getUrlVideo());
        
        return existencia;
        }
}
