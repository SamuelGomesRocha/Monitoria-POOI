package br.edu.ifg.application;

import java.time.LocalDateTime;
import java.util.Arrays;

import br.edu.ifg.entities.Arbitro;
import br.edu.ifg.entities.Campeonato;
import br.edu.ifg.entities.Equipe;
import br.edu.ifg.entities.EquipeArbitros;
import br.edu.ifg.entities.Jogador;
import br.edu.ifg.entities.Jogo;
import br.edu.ifg.entities.Rodada;
import br.edu.ifg.entities.Tecnico;
import br.edu.ifg.enums.Divisao;
import br.edu.ifg.enums.TipoJogador;

public class ProgramTest {

	public static void main(String[] args) {
		testeJogo();
	}
	
	
	public static void testeRodada() {
		
	}
	
	public static void testeJogo() {
		System.out.println("------------");
		System.out.println("Teste Jogo");
		System.out.println();
		Equipe equipeA =  new Equipe("Semana", Arrays.asList(new Jogador("Segunda", TipoJogador.TITULAR),
				new Jogador("Terça", TipoJogador.TITULAR),
				new Jogador("Quarta", TipoJogador.TITULAR),
				new Jogador("Quinta", TipoJogador.TITULAR),
				new Jogador("Sexta", TipoJogador.TITULAR),
				new Jogador("Sábado", TipoJogador.TITULAR),
				new Jogador("Domingo", TipoJogador.TITULAR)), 
				Arrays.asList(new Tecnico("Primo"),
						new Tecnico("Tia"),
						new Tecnico("Irmã"),
						new Tecnico("Mãe")),
				"Goianira"
				);
		 Equipe equipeB = new Equipe("Mês" ,Arrays.asList(new Jogador("Janeiro", TipoJogador.TITULAR),
					new Jogador("fevereiro", TipoJogador.TITULAR),
					new Jogador("março", TipoJogador.TITULAR),
					new Jogador("abril", TipoJogador.TITULAR),
					new Jogador("maio", TipoJogador.TITULAR),
					new Jogador("junho", TipoJogador.TITULAR),
					new Jogador("setembro", TipoJogador.TITULAR)),
					Arrays.asList(new Tecnico("Primo"),
							new Tecnico("Tia"),
							new Tecnico("Irmã"),
							new Tecnico("Mãe")),
					"Goiania"
					);
		
		Jogo j1 = new Jogo(equipeA, equipeB, "Goianira", LocalDateTime.now());
		j1.geraPlacarFinal();
		j1.defineEquipeVisitante();
		j1.defineArbitro(new EquipeArbitros(Arrays.asList(
				new Arbitro("A"),
				new Arbitro("B"),
				new Arbitro("C"),
				new Arbitro("D")
				)));
		System.out.println("Árbitro aleatório: "+j1.getArbitro().getNome());
		System.out.println("Resultado do game: "+j1.getResultado());
	}
	
}
