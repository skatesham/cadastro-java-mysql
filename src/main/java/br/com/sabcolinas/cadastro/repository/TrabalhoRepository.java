package br.com.sabcolinas.cadastro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.sabcolinas.cadastro.model.Trabalho;

public interface TrabalhoRepository extends CrudRepository<Trabalho, Long> {

	// Find

	public Trabalho findByEmpresa(String empresa);

	public Trabalho findByProfissao(String profissao);

	public Trabalho findByTelefone(String telefone);

	public List<Trabalho> findAll();

	// Find Contains

	public Trabalho findByEmpresaContains(String empresa);

	public Trabalho findByProfissaoContains(String profissao);

	public Trabalho findByTelefoneContains(String telefone);

	// Query

	@Query("select t from Trabalho t where t.empresa like %?1%")
	public List<Trabalho> buscaEmpresa(String empresa);

	@Query("select t from Trabalho t where t.profissao like %?1%")
	public List<Trabalho> buscaProfissao(String profissao);

	@Query("select t from Trabalho t where t.telefone like %?1%")
	public List<Trabalho> buscaTelefone(String telefone);

}
