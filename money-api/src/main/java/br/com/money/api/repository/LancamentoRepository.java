package br.com.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.money.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
