package com.rickdm.minhasfinancas2.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rickdm.minhasfinancas2.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findbyEmail(String email);
	
	boolean existsByEmail(String email);
}
