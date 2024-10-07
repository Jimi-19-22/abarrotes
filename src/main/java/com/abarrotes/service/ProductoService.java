/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.dto.ProductoDto;
import com.abarrotes.entidades.Producto;
import com.abarrotes.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository ;
    public List<Producto> findAll(){
    List<Producto> lstProductoDto = productoRepository.findAll();
    return lstProductoDto;
    }
    private ProductoDto converterEntidadDto(Producto p){
    ProductoDto productoDto = new ProductoDto();
    productoDto.setIdProductoPk(p.getIdProductoPk());
    productoDto.setNombre(p.getNombre());
    productoDto.setDescripcion(p.getDescripcion());
    productoDto.setUrlImagen(p.getUrlImagen());
    productoDto.setIdCategoriaFk(p.getIdCategoriaFk());
    productoDto.setCClaveproductoserv(p.getCClaveproductoserv());
    productoDto.setClaveUnidad(p.getClaveUnidad());
    productoDto.setCFraccionarancelariaFk(p.getCFraccionarancelariaFk());
    productoDto.setIdExterno(p.getIdExterno());
    productoDto.setEstatus(p.getEstatus());
    productoDto.setServicio(p.getServicio());
    
    return productoDto;
    }
    
    private Producto converterDtoEntidad(Producto p){
    Producto producto = new Producto();
    producto.setIdProductoPk(p.getIdProductoPk());
    producto.setNombre(p.getNombre());
    producto.setDescripcion(p.getDescripcion());
    producto.setUrlImagen(p.getUrlImagen());
    producto.setIdCategoriaFk(p.getIdCategoriaFk());
    producto.setCClaveproductoserv(p.getCClaveproductoserv());
    producto.setClaveUnidad(p.getClaveUnidad());
    producto.setCFraccionarancelariaFk(p.getCFraccionarancelariaFk());
    producto.setIdExterno(p.getIdExterno());
    producto.setEstatus(p.getEstatus());
    producto.setServicio(p.getServicio());
    
    return producto;
    }
}
