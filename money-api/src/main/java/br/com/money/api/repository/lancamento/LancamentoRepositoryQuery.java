package br.com.money.api.repository.lancamento;

import java.util.List;

import br.com.money.api.model.Lancamento;
import br.com.money.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter filter);
}
