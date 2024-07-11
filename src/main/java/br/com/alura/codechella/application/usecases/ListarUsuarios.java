package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.Usuario;

import java.util.List;

public class ListarUsuarios {

    private final RepositorioDeUsuario repository;

    public List<Usuario> obterTodosOsUsuarios () {
        return repository.listarTodos();
    }

    public ListarUsuarios(RepositorioDeUsuario repository) {
        this.repository = repository;
    }
}