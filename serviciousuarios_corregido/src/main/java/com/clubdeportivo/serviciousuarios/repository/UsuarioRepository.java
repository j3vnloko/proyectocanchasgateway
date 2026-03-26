package com.clubdeportivo.serviciousuarios.repository;

import com.clubdeportivo.serviciousuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}