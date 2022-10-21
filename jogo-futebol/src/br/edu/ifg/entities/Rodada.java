package br.edu.ifg.entities;

import java.util.ArrayList;
import java.util.List;

public class Rodada {

	private Integer numRodada;
	private List<Jogo> jogos;
	private List<EquipePontuacao> equipePontuacoes = new ArrayList<EquipePontuacao>();
	
	public Rodada(Integer numRodada, List<Jogo> jogos) {
		super();
		this.numRodada = numRodada;
		this.jogos = jogos;
	}
	
	public Rodada(Integer numRodada, List<Jogo> jogos, List<EquipePontuacao> equipePontuacoes) {
		super();
		this.numRodada = numRodada;
		this.jogos = jogos;
		this.equipePontuacoes = equipePontuacoes;
	}

	public void definePontuacao() {
		for(Jogo j : jogos) {
			if(j.getResultado().equals("Empate")) {
				
			}else {
				if(this.equipePontuacoes.size() < 1) { 
					this.equipePontuacoes.add(new EquipePontuacao(j.getEquipeVencedora(), 3));
				}else {
					if(!this.equipePontuacoes.contains(new EquipePontuacao(j.getEquipeVencedora(), 3))) {
						this.equipePontuacoes.add(new EquipePontuacao(j.getEquipeVencedora(), 3));
					}
					else {
					//Como fazer com que times que já existem ganhem mais pontos?
						this.equipePontuacoes.get(equipePontuacoes.indexOf(new EquipePontuacao(j.getEquipeVencedora(), 3))).setPontuacao(
								this.equipePontuacoes.get(equipePontuacoes.indexOf(new EquipePontuacao(j.getEquipeVencedora(), 3))).getPontuacao()+3
								);
					}
			  }
			}
		}
	}
	
	public List<EquipePontuacao> getEquipesPontuacoes(){
		for(EquipePontuacao e : equipePontuacoes) {
			System.out.println(e.getEquipe().getNome()+" - pontuação: "+e.getPontuacao());
		}
		return this.equipePontuacoes;
	}
	
}
