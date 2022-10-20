package br.edu.ifg.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;


public class Jogo {

	private Equipe equipeA;
	private Equipe equipeB;
	private String local;
	private LocalDateTime dataHora;
	private String resultado;
	private Arbitro arbitro;
	private Equipe equipeVencedora;
	
	public Jogo() {
		
	}
	
	public Jogo(Equipe equipeA, Equipe equipeB, String local, LocalDateTime dataHora) {
		super();
		this.equipeA = equipeA;
		this.equipeB = equipeB;
		this.local = local;
		this.dataHora = dataHora;
	}


	public void geraPlacarFinal() {
		Random rand = new Random();
		Integer ra = rand.nextInt(10);
		Integer rb = rand.nextInt(10);
		defineResultado(ra, rb);
		System.out.println(equipeA.getNome()+": "+ra+" | "+equipeB.getNome()+": "+rb);
	}
	
	public void defineResultado(Integer ra, Integer rb) {
		if(ra > rb) {
			this.resultado = "Vencedor: "+equipeA.getNome();
			this.equipeVencedora = equipeA;
		}
		if(rb > ra) {
			this.resultado = "Vencedor: "+equipeB.getNome();
			this.equipeVencedora = equipeB;
		}
		if(ra.equals(rb)) {
			this.resultado = "Empate";
			this.equipeVencedora = null;
		}
	}
	
	public void defineEquipeVisitante() {
		if(equipeA.getNatalidade().equals(this.local)){
			System.out.println("Equipe visitante: "+equipeB.getNome()+" | Equipe visitada: "+equipeA.getNome());
		}else {
			System.out.println("Equipe visitante: "+equipeA.getNome()+" | Equipe visitada: "+equipeB.getNome());
		}
	}
	
	public void defineArbitro(EquipeArbitros arbitros) {
		arbitro = arbitros.getArbitros().get(new Random().nextInt(4));
	}


	public Equipe getEquipeA() {
		return equipeA;
	}


	public Equipe getEquipeB() {
		return equipeB;
	}


	public String getLocal() {
		return local;
	}


	public LocalDateTime getDataHora() {
		return dataHora;
	}


	public String getResultado() {
		return resultado;
	}


	public Arbitro getArbitro() {
		return arbitro;
	}

	public Equipe getEquipeVencedora() {
		return equipeVencedora;
	}
	

	
	
}
