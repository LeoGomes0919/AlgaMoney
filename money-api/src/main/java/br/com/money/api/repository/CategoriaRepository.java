package br.com.money.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.money.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
