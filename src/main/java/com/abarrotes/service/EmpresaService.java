/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.entidades.Empresa;
import com.abarrotes.repository.EmpresaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author world
 */

@Service

public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;
    public List<Empresa> findAll(){
       List<Empresa> lstEmpresaDto = empresaRepository.findAll();
       return lstEmpresaDto;
    }
}
