package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Personagem;
import com.ifce.br.repository.PersonagemRepository;

@Service
	public class PersonagemService {
	@Autowired
	private PersonagemRepository personagemRepo;
	
		public void cadastrarFilme(Filme filme) {
			personagemRepo.save(personagem);
		}
		
		public List<Personagem> listarPersonagens(){
			return personagemRepo.findAll();
		}
		
		public void excluir(Long codigo) {
			personagemRepo.deleteById(codigo);
			
		}
	}