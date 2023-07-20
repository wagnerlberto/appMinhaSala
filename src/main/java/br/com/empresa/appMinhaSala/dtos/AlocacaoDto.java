package br.com.empresa.appMinhaSala.dtos;

import br.com.empresa.appMinhaSala.entities.Alocacao;

public class AlocacaoDto {

  private Long id;
  private String semestre;  // Ano (aa)[23]-Ordem do semestre (s)[1 ou 2]  23-1

  public AlocacaoDto() {
  }

  public AlocacaoDto(Alocacao bean) {
    this.id = bean.getId();
    this.semestre = bean.getSemestre();
  }

  public Long getId() {
    return id;
  }

  public String getSemestre() {
    return semestre;
  }

}
