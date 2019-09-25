package br.com.money.api.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.money.api.model.Pessoa;
import br.com.money.api.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {

	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);
}
