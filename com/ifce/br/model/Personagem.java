package com.ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Personagem {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long Codigo;
		private String Personagem;
		private String Anime;
		private String Episodios;
		public Long getCodigo() {
			return Codigo;
		}
		public void setCodigo(Long codigo) {
			Codigo = codigo;
		}
		public String getPersonagem() {
			return Personagem;
		}
		public void setPersonagem(String personagem) {
			Personagem = personagem;
		}
		public String getAnime() {
			return Anime;
		}
		public void setAnime(String anime) {
			Anime = anime;
		}
		public String getEpisodios() {
			return Episodios;
		}
		public void setEpisodios(String episodios) {
			Episodios = episodios;
		}
		
		
}
