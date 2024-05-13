package br.com.icorrea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.icorrea.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
	
	@Query(value = "select u from Usuario u where upper(trim(u.nome)) like %?1%")
	List<Usuario> buscaPorNome(String nome);
	
}
