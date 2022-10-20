package br.edu.ifg.entities;

import java.util.List;

public class EquipeArbitros {

	private List<Arbitro> arbitros;

	public EquipeArbitros() {
		
	}
	
	public EquipeArbitros(List<Arbitro> arbitros) {
		super();
		this.arbitros = arbitros;
	}

	public List<Arbitro> getArbitros() {
		return arbitros;
	}
	
	
	
}
