package br.com.icorrea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.icorrea.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
