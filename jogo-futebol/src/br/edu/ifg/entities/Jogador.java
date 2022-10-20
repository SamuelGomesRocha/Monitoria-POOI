package br.edu.ifg.entities;

import br.edu.ifg.enums.TipoJogador;

public class Jogador extends Pessoa{
	
	private TipoJogador tipo;

	
	public Jogador() {
		
	}
	
	public Jogador(TipoJogador tipo) {
		super();
		this.tipo = tipo;
	}
	
	
	

}
