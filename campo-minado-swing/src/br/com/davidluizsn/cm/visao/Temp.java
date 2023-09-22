package br.com.davidluizsn.cm.visao;

import br.com.davidluizsn.cm.modelo.Tabuleiro;

public class Temp {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(3, 3, 9);
		
		tabuleiro.registrarObservador(e -> {
			if(e.isGanhou()) {
				System.out.println("Ganhou :)");
			} else {
				System.out.println("Perdeu :(");
			}
		});
		
		tabuleiro.alterarMarcar(0, 0);
		tabuleiro.alterarMarcar(0, 1);
		tabuleiro.alterarMarcar(0, 2);
		tabuleiro.alterarMarcar(1, 0);
		tabuleiro.alterarMarcar(1, 1);
		tabuleiro.alterarMarcar(1, 2);
		tabuleiro.alterarMarcar(2, 0);
		tabuleiro.alterarMarcar(2, 1);
		tabuleiro.abrir(2, 2);
		tabuleiro.alterarMarcar(2, 2);
	}
	
}
