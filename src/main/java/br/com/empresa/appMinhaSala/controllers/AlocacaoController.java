package br.com.empresa.appMinhaSala.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.empresa.appMinhaSala.dtos.AlocacaoDto;
import br.com.empresa.appMinhaSala.entities.Alocacao;
import br.com.empresa.appMinhaSala.repositories.AlocacaoRepository;
import br.com.empresa.appMinhaSala.services.AlocacaoService;

@RestController
@RequestMapping(value="/alocacao")
public class AlocacaoController {
  
  @Autowired
  private AlocacaoRepository repository;
  
  @Autowired
  private AlocacaoService service;
  
  @GetMapping
  public List<Alocacao> encontrarTodos(){
    List<Alocacao> lista = repository.findAll();
    return lista;
  }
  
  @PostMapping
  public void salvar( @RequestBody Alocacao EntityBean ){
    service.salvar(EntityBean);
  }

  @GetMapping("/{id}")
  public Optional<AlocacaoDto> recuperarPeloId( @PathVariable(value="id") 
                                                Long id ){
    return service.encontrarPeloId(id);
  }
}
