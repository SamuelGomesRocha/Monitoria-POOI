package br.edu.ifg.entities;

public class EquipePontuacao {
	
	private Equipe equipe;
	private Integer pontuacao;
	
	public EquipePontuacao() {
		
	}
	
	public EquipePontuacao(Equipe equipe) {
		super();
		this.equipe = equipe;
	}
	
	public EquipePontuacao(Equipe equipe, Integer pontuacao) {
		super();
		this.equipe = equipe;
		this.pontuacao = pontuacao;
	}

	public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Equipe getEquipe() {
		return equipe;
	}
	
	
	

}
