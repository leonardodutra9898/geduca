package org.idea.geduca.gedu.controllers;

import java.util.ArrayList;
import java.util.List;

import org.idea.geduca.gedu.model.Usuario;
import org.idea.geduca.gedu.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioController {

	private List<Usuario> usuarios = new ArrayList<>();
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
}
