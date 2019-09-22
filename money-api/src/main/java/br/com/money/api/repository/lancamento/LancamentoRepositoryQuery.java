package br.com.money.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.money.api.model.Lancamento;
import br.com.money.api.repository.filter.LancamentoFilter;
import br.com.money.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentofilter, Pageable pageable);

	public Page<ResumoLancamento> resumir(LancamentoFilter filter, Pageable pageable);
}
