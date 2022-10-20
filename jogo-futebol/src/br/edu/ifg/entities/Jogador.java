package br.edu.ifg.entities;

import br.edu.ifg.enums.TipoJogador;

public class Jogador extends Pessoa{
	
	private TipoJogador tipo;

	
	public Jogador() {
		
	}
	
	public Jogador(String nome, TipoJogador tipo) {
		super();
		super.nome = nome;
		this.tipo = tipo;
	}
	
	
	

}
