package br.edu.ifg.application;

import java.time.LocalDateTime;
import java.util.Arrays;

import br.edu.ifg.entities.Arbitro;
import br.edu.ifg.entities.Campeonato;
import br.edu.ifg.entities.Equipe;
import br.edu.ifg.entities.EquipeArbitros;
import br.edu.ifg.entities.EquipePontuacao;
import br.edu.ifg.entities.Jogador;
import br.edu.ifg.entities.Jogo;
import br.edu.ifg.entities.Rodada;
import br.edu.ifg.entities.Tecnico;
import br.edu.ifg.enums.Divisao;
import br.edu.ifg.enums.TipoJogador;

public class ProgramTest {

	public static void main(String[] args) {
		testeJogo();
		testeRodada();
	}
	
	
	public static void testeRodada() {	
		System.out.println("------------");
		System.out.println("Teste Rodada");
		System.out.println();
		//Como otimizar esta inser��o?
		Jogo j1 = new Jogo(new Equipe("Flamengo"), new Equipe("Goi�s"));
		Jogo j2 = new Jogo(new Equipe("Vila Nova"), new Equipe("Bras�lia"));
		Jogo j3 = new Jogo(new Equipe("Criciuma"), new Equipe("Palmeiras"));
		Jogo j4 = new Jogo(new Equipe("M�xico"), new Equipe("Am�rica Latina"));
		Jogo j5 = new Jogo(new Equipe("Sagittarius A*"), new Equipe("�frica"));
		Jogo j6 = new Jogo(new Equipe("�sia"), new Equipe("Europa"));	
		Jogo j7 = new Jogo(new Equipe("EUA"), new Equipe("China"));
		Jogo j8 = new Jogo(new Equipe("Jap�o"), new Equipe("Korea"));
		Jogo j9 = new Jogo(new Equipe("Jalap�o"), new Equipe("Serra Dourada"));
		Jogo j10 = new Jogo(new Equipe("Pantanal"), new Equipe("Serra da Mesa"));
		//Como otimizar estas opera��es?
		j1.geraPlacarFinal();
		j2.geraPlacarFinal();
		j3.geraPlacarFinal();
		j4.geraPlacarFinal();
		j5.geraPlacarFinal();
		j6.geraPlacarFinal();
		j7.geraPlacarFinal();
		j8.geraPlacarFinal();
		j9.geraPlacarFinal();
		j10.geraPlacarFinal();
		Rodada r1 = new Rodada(1, Arrays.asList(
				j1,j2,j3,j4,j5,j6,j7,j8,j9,j10));
		r1.definePontuacao();
		System.out.println();
		r1.getEquipesPontuacoes();
		
	}
	
	public static void testeJogo() {
		System.out.println("------------");
		System.out.println("Teste Jogo");
		System.out.println();
		Equipe equipeA =  new Equipe("Semana", Arrays.asList(new Jogador("Segunda", TipoJogador.TITULAR),
				new Jogador("Ter�a", TipoJogador.TITULAR),
				new Jogador("Quarta", TipoJogador.TITULAR),
				new Jogador("Quinta", TipoJogador.TITULAR),
				new Jogador("Sexta", TipoJogador.TITULAR),
				new Jogador("S�bado", TipoJogador.TITULAR),
				new Jogador("Domingo", TipoJogador.TITULAR)), 
				Arrays.asList(new Tecnico("Primo"),
						new Tecnico("Tia"),
						new Tecnico("Irm�"),
						new Tecnico("M�e")),
				"Goianira"
				);
		 Equipe equipeB = new Equipe("M�s" ,Arrays.asList(new Jogador("Janeiro", TipoJogador.TITULAR),
					new Jogador("fevereiro", TipoJogador.TITULAR),
					new Jogador("mar�o", TipoJogador.TITULAR),
					new Jogador("abril", TipoJogador.TITULAR),
					new Jogador("maio", TipoJogador.TITULAR),
					new Jogador("junho", TipoJogador.TITULAR),
					new Jogador("setembro", TipoJogador.TITULAR)),
					Arrays.asList(new Tecnico("Primo"),
							new Tecnico("Tia"),
							new Tecnico("Irm�"),
							new Tecnico("M�e")),
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
		System.out.println("�rbitro aleat�rio: "+j1.getArbitro().getNome());
		System.out.println("Resultado do game: "+j1.getResultado());
	}
	
}
