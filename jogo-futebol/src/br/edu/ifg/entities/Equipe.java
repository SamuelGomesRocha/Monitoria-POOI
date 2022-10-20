package br.edu.ifg.entities;

import java.util.List;

public class Equipe {
	
	private String nome;
	private List<Jogador> jogadores;
	private List<Tecnico> tecnicos;
	private String natalidade;
	
	public Equipe() {
		
	}
	
	public Equipe(String nome, List<Jogador> jogadores, List<Tecnico> tecnicos, String natalidade) {
		super();
		this.nome = nome;
		this.jogadores = jogadores;
		this.tecnicos = tecnicos;
		this.natalidade = natalidade;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}

	public void setTecnicos(List<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}

	public String getNatalidade() {
		return natalidade;
	}

	public void setNatalidade(String natalidade) {
		this.natalidade = natalidade;
	}
	
	
	
	
	
}
