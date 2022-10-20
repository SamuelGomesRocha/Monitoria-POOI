package br.edu.ifg.entities;

import java.util.List;

public class Rodada {

	private Integer numRodada;
	private List<Jogo> jogos;
	private List<EquipePontuacao> equipes;
	
	public void definePontuacao(List<Jogo> jogos) {
		for(Jogo j : jogos) {
			if(j.getResultado().equals("Empate")) {
				
			}else {
				for(EquipePontuacao e : equipes) {
					if(e.getEquipe().getNome().equals(j.getEquipeVencedora().getNome())) {
						equipes.get(equipes.indexOf(e)).setPontuacao(e.getPontuacao()+3);;
					}
					if(equipes.size() < 1) {
						equipes.add(new EquipePontuacao(j.getEquipeVencedora(), 3));
					}
					if(!equipes.contains(e)) {
						equipes.add(new EquipePontuacao(j.getEquipeVencedora(), 3));
					}
				}
			}
		}
	}
	
	
	
}
