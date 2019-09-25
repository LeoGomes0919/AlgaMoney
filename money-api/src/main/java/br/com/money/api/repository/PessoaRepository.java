package br.com.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.money.api.model.Pessoa;
import br.com.money.api.repository.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

}
