package br.com.adaptworks.triangulo.integracao.simples;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import br.com.adaptworks.triangulo.Triangulo;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TrianguloSimplesStepsDefinition {
	
	String lado1, lado2, lado3;
	
	@Dado("que eu estou na pagina de consulta de triangulo")
	public void que_eu_estou_na_pagina_de_consulta_de_triangulo() throws Throwable {
	    assertTrue(true);
	}

	@Quando("eu preencho o lado1 com {string}")
	public void eu_preencho_o_lado1_com(String arg1) throws Throwable {
	    lado1 = arg1;
	}
	
	@E("eu preencho o lado2 com {string}")
	public void eu_preencho_o_lado2_com(String arg1) throws Throwable {
	    lado2 = arg1;
	}
	
	@E("eu preencho o lado3 com {string}")
	public void eu_preencho_o_lado3_com(String arg1) throws Throwable {
	    lado3 = arg1;
	}

	@Entao("apresenta mensagem {string}")
	public void apresenta_mensagem(String arg1) throws Throwable {
		String mensagem = new Triangulo().classificar(lado1, lado2, lado3);
		
		Assert.assertEquals(arg1, mensagem);
	}
}
