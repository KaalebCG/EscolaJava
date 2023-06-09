package br.com.escolajava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.escolajava.models.Aluno;
import br.com.escolajava.models.Habilidade;
import br.com.escolajava.repositorys.AlunoRepository;

@Controller
public class HabilidadeController {

  @Autowired
  private AlunoRepository repository;

  @GetMapping("/habilidade/cadastar/{id}")
  public String cadastrar(@PathVariable String id, Model model){
    Aluno aluno = repository.obterAlunoPor(id);
    model.addAttribute("aluno", aluno);
    model.addAttribute("habilidade", new Habilidade());
    return "habilidade/cadastrar";
  }
}
