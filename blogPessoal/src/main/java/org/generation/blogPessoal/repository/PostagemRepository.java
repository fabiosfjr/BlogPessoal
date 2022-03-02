package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.PostagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//mostra para o spring que o arquivo é um repository
@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long>{
	
	public List<PostagemModel> findAllByTituloContainingIgnoreCase (String titulo);
	
}
