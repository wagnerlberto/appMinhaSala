package br.com.empresa.appMinhaSala.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.empresa.appMinhaSala.entities.Alocacao;

public interface AlocacaoRepository extends JpaRepository<Alocacao, Long>{
}
