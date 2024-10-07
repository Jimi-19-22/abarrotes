/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.CategoriaDto;
import com.abarrotes.entidades.Categoria;
import com.abarrotes.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;
    public List<Categoria> findAll(){
    List<Categoria> lstCategoriaDto = categoriaRepository.findAll();
    return lstCategoriaDto;
        }
     private CategoriaDto converterEntidadDto(Categoria c){
     CategoriaDto categoriaDto = new CategoriaDto();
     categoriaDto.setIdCategoriaPk(c.getIdCategoriaPk());
     categoriaDto.setNombre(c.getNombre());
     categoriaDto.setFechaAlta(c.getFechaAlta());
     categoriaDto.setEstatus(c.getEstatus());

     
     return categoriaDto;
     }
    private Categoria converterDtoEntidad(Categoria c){
     Categoria categoria = new Categoria();
     categoria.setIdCategoriaPk(c.getIdCategoriaPk());
     categoria.setNombre(c.getNombre());
     categoria.setFechaAlta(c.getFechaAlta());
     categoria.setEstatus(c.getEstatus());

     
     return categoria;
     }
}
