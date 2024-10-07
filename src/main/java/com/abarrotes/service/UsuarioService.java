/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes.service;

import com.abarrotes.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abarrotes.repository.UsuarioRepository;
import java.io.Serializable;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException; 

/**
 *
 * @author juanc
 */
@Service
public class UsuarioService implements Serializable, UserDetailsService{
    @Autowired
    UsuarioRepository usuarioRepository; 

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = usuarioRepository.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));
        return User.builder().username(user.getUserName()).password(user.getContraseña()).roles(new String[]{"USER"}).build();
    }
    
}

