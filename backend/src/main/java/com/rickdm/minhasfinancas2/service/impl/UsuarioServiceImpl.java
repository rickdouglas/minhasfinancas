package com.rickdm.minhasfinancas2.service.impl;

import com.rickdm.minhasfinancas2.model.repository.UsuarioRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickdm.minhasfinancas2.exception.RegraNegocioException;
import com.rickdm.minhasfinancas2.model.entity.Usuario;
import com.rickdm.minhasfinancas2.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	

	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean existe = repository.findbyEmail(email) != null;
		if(existe) {
			throw new RegraNegocioException("Já existe um usuario cadastrado com esse email.");
		}
		
		
	}
	

}
