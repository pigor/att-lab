package br.com.adaptworks.triangulo.integracao.tabela;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import br.com.adaptworks.triangulo.Triangulo;
import io.cucumber.java.DataTableType;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TrianguloTabelaStepsDefinition {

	// atributos criados para compartilhar os lados em todos os metodos
	Integer lado1, lado2, lado3;
	List<LadosTriangulo> lados;
	
	@DataTableType
    public LadosTriangulo convert(Map<String, String> entry){
      return new LadosTriangulo(
         entry.get("lado1"),
         entry.get("lado2"),
         entry.get("lado3")
      );
    }

	@Dado("que eu estou na pagina de consulta de triangulo")
	public void que_eu_estou_na_pagina_de_consulta_de_triangulo() throws Throwable {
		assertTrue(true);
	}

	@Quando("eu preencho os seguintes lados")
	public void eu_preencho_os_seguintes_lados(List<LadosTriangulo> lados) throws Throwable {
		this.lados = lados;
	}

	@Entao("apresenta mensagem {string}")
	public void apresenta_mensagem(String arg1) throws Throwable {
		/*
		 * Para que possamos utilizar todos os registros da tabela e necessario
		 * efetuar um for each nos lados do triangulo.
		 * A execucao desta classe sera igual a quantidade de dados que existir na tabela
		 */
		for (LadosTriangulo ladosTriangulo : lados) {
			lado1 = ladosTriangulo.lado1;
			lado2 = ladosTriangulo.lado2;
			lado3 = ladosTriangulo.lado3;

			assertEquals(arg1, new Triangulo().classificar(lado1, lado2, lado3));
		}
	}
}

class LadosTriangulo {
	Integer lado1, lado2, lado3;
	
	LadosTriangulo(String lado1, String lado2, String lado3) {
		this.lado1 = Integer.parseInt(lado1);
		this.lado2 = Integer.parseInt(lado2);
		this.lado3 = Integer.parseInt(lado3);
	}
}
