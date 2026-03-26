package com.clubdeportivo.serviciousuarios.services;

import com.clubdeportivo.serviciousuarios.model.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario> listarUsuarios();
    Usuario buscarUsuario(Long id);
    Usuario crearUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
}