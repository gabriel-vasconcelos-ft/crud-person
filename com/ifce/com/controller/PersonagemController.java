package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Personagem;
import com.ifce.br.service.PersonagemService;

@Controller
public class PersonagemController {
	
	@Autowired
	private PersonagemService personagemService;
	
	@GetMapping("personagem/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@GetMapping("/personagem/salvar")
	public String salvar(Personagem personagem) {
		personagemService.cadastrarPersonagem(personagem);
		return "sucesso";
	}
	
	@GetMapping("/personagem/listar")
	public String listarPersonagens() {
		List<Personagem> personagens = personagemService.listarPersonagens();
		ModelAndView mv = new ModelAndView("listagem-personagem");
		
		mv.addObject("listaPersonagens", personagens);
		return mv;
}
	
	@RequestMapping("/personagem/excluir/{codigo}")
	public ModelAndView excluir(@PathVariable Long codigo) {
		personagemService.excluir(codigo);
		
		ModelAndView mv = new ModelAndView("redirect:/personagem/listar");
		return mv;
	}
	
}