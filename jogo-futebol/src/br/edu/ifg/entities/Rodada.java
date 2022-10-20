package br.edu.ifg.entities;

import java.util.List;

public class Rodada {

	private Integer numRodada;
	private List<Jogo> jogos;
	private List<EquipePontuacao> equipePontuacoes;
	
	
	
	public Rodada(Integer numRodada, List<Jogo> jogos, List<EquipePontuacao> equipePontuacoes) {
		super();
		this.numRodada = numRodada;
		this.jogos = jogos;
		this.equipePontuacoes = equipePontuacoes;
	}

	public void definePontuacao(List<Jogo> jogos) {
		for(Jogo j : jogos) {
			if(j.getResultado().equals("Empate")) {
				
			}else {
				for(EquipePontuacao e : this.equipePontuacoes) {
					if(e.getEquipe().getNome().equals(j.getEquipeVencedora().getNome())) {
						this.equipePontuacoes.get(this.equipePontuacoes.indexOf(e)).setPontuacao(e.getPontuacao()+3);;
					}
					if(this.equipePontuacoes.size() < 1) {
						this.equipePontuacoes.add(new EquipePontuacao(j.getEquipeVencedora(), 3));
					}
					if(!this.equipePontuacoes.contains(e)) {
						this.equipePontuacoes.add(new EquipePontuacao(j.getEquipeVencedora(), 3));
					}
				}
			}
		}
	}
	
	public List<EquipePontuacao> getEquipesPontuacoes(){
		return this.equipePontuacoes;
	}
	
}
