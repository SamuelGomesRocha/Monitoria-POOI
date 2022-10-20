package br.edu.ifg.entities;

import java.util.List;

import br.edu.ifg.enums.Divisao;

public class Campeonato {
	
	private Divisao divisao;
	private String anoCampeonato;
	private List<Rodada> rodadas;
	
	public Campeonato() {
		
	}
	
	public Campeonato(Divisao divisao, String anoCampeonato, List<Rodada> rodadas) {
		super();
		this.divisao = divisao;
		this.anoCampeonato = anoCampeonato;
		this.rodadas = rodadas;
	}

	private void defineCampeao() {
		EquipePontuacao equipeCampea = new EquipePontuacao();
		for(Rodada r : this.rodadas) {
			for(EquipePontuacao e : r.getEquipesPontuacoes()) {
				if(e.getPontuacao() > equipeCampea.getPontuacao()) {
					equipeCampea = e;
				}
			}
		}
		System.out.println("Campeonato: "+divisao);
		System.out.println("Equipe campeã: "+equipeCampea.getEquipe().getNome());
	}
	
	private void definePromocao() {
		
	}
	
	private void defineRebaixamento() {
		
	}

}
