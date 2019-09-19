package br.com.money.api.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.money.api.model.Lancamento;
import br.com.money.api.model.Pessoa;
import br.com.money.api.repository.LancamentoRepository;
import br.com.money.api.repository.PessoaRepository;
import br.com.money.api.service.exception.PessoaInexistenteOuInativaExcpetion;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento salvar(@Valid Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo()).orElse(null);;
		if (pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaExcpetion();
		}
		return lancamentoRepository.save(lancamento);
	}
}
