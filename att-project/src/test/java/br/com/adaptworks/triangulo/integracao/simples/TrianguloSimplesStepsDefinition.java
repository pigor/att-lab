package br.com.adaptworks.triangulo.integracao.simples;

import static org.junit.Assert.assertEquals;

import br.com.adaptworks.triangulo.Triangulo;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class TrianguloSimplesStepsDefinition {
	
	String lado1, lado2, lado3;

	@Dado("que o aluno está na tela do classificador de triângulo")
	public void que_o_aluno_está_na_tela_do_classificador_de_triângulo() {
	    assert(true);
	}

	@Quando("inserir no lado1 o valor {string}")
	public void inserir_no_lado1_o_valor(String string) {
	    lado1 = string;
	}
	@Quando("inserir no lado2 o valor {string}")
	public void inserir_no_lado2_o_valor(String string) {
	    lado2 = string;
	}
	@Quando("inserir no lado3 o valor {string}")
	public void inserir_no_lado3_o_valor(String string) {
		lado3 = string;
	}
	
	@Então("é exibida a mensagem {string}")
	public void é_exibida_a_mensagem(String string) {
		String mensagem = new Triangulo().calcular(lado1, lado2, lado3);
		
		assertEquals(string, mensagem);
	}
}
