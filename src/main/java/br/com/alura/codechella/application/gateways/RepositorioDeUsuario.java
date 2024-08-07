package br.com.alura.codechella.application.gateways;

import br.com.alura.codechella.domain.entities.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();

    Usuario atualizarUsuario(Long id, Usuario usuario);

    void deletarUsuario(Long id);
}
