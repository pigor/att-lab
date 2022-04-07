package br.com.adaptworks.triangulo.integracao.tabelaExemplo;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import br.com.adaptworks.triangulo.Triangulo;
import io.cucumber.java.gl.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TrianguloTabelaExemploStepsDefinition {

	// atributos criados para compartilhar os lados em todos os metodos
	Integer lado1, lado2, lado3;
	
	
	@Dado("os tres campos de entrada")
	public void os_tres_campos_de_entrada() throws Throwable {
	    Assert.assertTrue(true);
	}
	
	@Quando("eu informo o lado1 com valor {int}")
	public void eu_informo_o_lado1_com_valor(int l1) throws Throwable {
	    lado1 = l1;
	}

	@E("eu informo o lado2 com valor {int}")
	public void eu_informo_o_lado2_com_valor(int l2) throws Throwable {
	    lado2 = l2;
	}	

	@Quando("eu informo o lado3 com valor {int}")
	public void eu_informo_o_lado3_com_valor(int l3) throws Throwable {
	    lado3 = l3;
	}
	
	@Entao("exibe a mensagem {string}")
	public void exibe_a_mensagem(String mensagem) throws Throwable {
		Triangulo triangulo = new Triangulo();
		String resultado = triangulo.calcular(lado1, lado2, lado3);
	    assertEquals(mensagem, resultado);
	}
	
}
