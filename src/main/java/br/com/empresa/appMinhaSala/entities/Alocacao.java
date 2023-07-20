package br.com.empresa.appMinhaSala.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alocacao {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String semestre;  // Ano (aa)[23]-Ordem do semestre (s)[1 ou 2]  23-1
  private String periodo;  // Matutino (m) ou Noturno (n)
  private String numeroSala;
  
  public Alocacao() {
  }

  public Alocacao(Long id, String semestre,
                  String periodo, String numeroSala) {
    this.id = id;
    this.semestre = semestre;
    this.periodo = periodo;
    this.numeroSala = numeroSala;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSemestre() {
    return semestre;
  }

  public void setSemestre(String semestre) {
    this.semestre = semestre;
  }

  public String getPeriodo() {
    return periodo;
  }

  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }

  public String getNumeroSala() {
    return numeroSala;
  }

  public void setNumeroSala(String numeroSala) {
    this.numeroSala = numeroSala;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Alocacao other = (Alocacao) obj;
    return Objects.equals(id, other.id);
  }
}
