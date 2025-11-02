package com.anuncios.AutomatAununcios.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.anuncios.AutomatAununcios.dtos.UsuarioRequestDTO;
import com.anuncios.AutomatAununcios.dtos.UsuarioResponseDTO;
import com.anuncios.AutomatAununcios.entities.Usuario;
import com.anuncios.AutomatAununcios.repositories.UsuarioRepositories;

@Service
public class UsuarioService {
    private final UsuarioRepositories usuarioRepositories;

    public UsuarioService(UsuarioRepositories usuarioRepositories) {
        this.usuarioRepositories = usuarioRepositories;
    }

    public UsuarioResponseDTO crearUsuario(UsuarioRequestDTO usuarioRequestDTO){
        Usuario usuario = new Usuario();
        usuario.setCorreo(usuarioRequestDTO.getCorreo());
        usuario.setContrasenia(usuarioRequestDTO.getContrasenia());
        Usuario usuarioGuardado = usuarioRepositories.save(usuario);

        return convertirDTO(usuarioGuardado);
    }

    public List<UsuarioResponseDTO> listarUsuarios(){
        List<Usuario> usuarios = usuarioRepositories.findAll();
        return usuarios.stream().map(this::convertirDTO).collect(Collectors.toList());

    }

    private UsuarioResponseDTO convertirDTO(Usuario usuario){
        UsuarioResponseDTO dto = new UsuarioResponseDTO();
        dto.setId(usuario.getId());
        dto.setCorreo(usuario.getCorreo());
        dto.setContrasenia(usuario.getContrasenia());
        return dto;
    }

}
