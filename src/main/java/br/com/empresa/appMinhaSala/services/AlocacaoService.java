package br.com.empresa.appMinhaSala.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.empresa.appMinhaSala.dtos.AlocacaoDto;
import br.com.empresa.appMinhaSala.entities.Alocacao;
import br.com.empresa.appMinhaSala.repositories.AlocacaoRepository;

@Service
public class AlocacaoService {
  
  @Autowired
  private AlocacaoRepository repository;

  public void salvar( Alocacao bean ){
    repository.save(bean);
  }
  
  public Optional<AlocacaoDto> encontrarPeloId(Long id){
    Optional<Alocacao> objeto = repository.findById(id);
    Optional<AlocacaoDto> objetoDto = 
        objeto.map(item->new AlocacaoDto(item));
    return objetoDto;
  }
}
