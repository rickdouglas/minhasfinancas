package com.rickdm.minhasfinancas2.service;

import com.rickdm.minhasfinancas2.model.entity.Usuario;

public interface UsuarioService {
	Usuario autenticar(String email, String senha);
	Usuario salvarUsuario(Usuario usuario);
	void validarEmail(String email);

}
