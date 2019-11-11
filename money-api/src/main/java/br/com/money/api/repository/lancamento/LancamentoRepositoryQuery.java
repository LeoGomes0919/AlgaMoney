package br.com.money.api.repository.lancamento;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.money.api.dto.LancamentoEstatisticaCategoria;
import br.com.money.api.dto.LancamentoEstatisticaDia;
import br.com.money.api.dto.LancamentoEstatisticaPessoa;
import br.com.money.api.model.Lancamento;
import br.com.money.api.repository.filter.LancamentoFilter;
import br.com.money.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentofilter, Pageable pageable);

	public Page<ResumoLancamento> resumir(LancamentoFilter filter, Pageable pageable);

	public List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);

	public List<LancamentoEstatisticaDia> porDia(LocalDate mesReferencia);

	public List<LancamentoEstatisticaPessoa> porPessoa(LocalDate inicio, LocalDate fim);

}
