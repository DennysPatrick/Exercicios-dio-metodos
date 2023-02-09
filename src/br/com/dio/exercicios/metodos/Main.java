package br.com.dio.exercicios.metodos;

public class Main {

	public static void main(String[] args) {
		//Calculator
		System.out.println("Exercicios calculadora");
		
		Calculadora.soma(5, 80);
		Calculadora.subtracao(18, 1.8);
		Calculadora.multiplicacao(9, 9);
		Calculadora.divisao(100, 4);
		
		//Message
		
		Mensagem.obterMensagem(5);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(22);
		
		
		// Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
		
	}

}
