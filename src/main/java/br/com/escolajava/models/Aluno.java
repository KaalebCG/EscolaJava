package br.com.escolajava.models;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

public class Aluno {
  private ObjectId id;

  private String nome;

  private Date dataNascimento;

  private Curso curso;

  private List<Nota> notas;

  private List<Habilidade> habilidades;

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public Date getDataNascimento() {
    return dataNascimento;
  }
  
  public void setDataNascimento(Date date) {
    this.dataNascimento = date;
  }
  

  public Curso getCurso() {
    return curso;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public List<Nota> getNotas() {
    return notas;
  }

  public void setNotas(List<Nota> notas) {
    this.notas = notas;
  }

  public List<Habilidade> getHabilidades() {
    return habilidades;
  }

  public void setHabilidades(List<Habilidade> habilidades) {
    this.habilidades = habilidades;
  }

  public Aluno criarId() {
    setId(new ObjectId());
    return this;
  }



  
}
