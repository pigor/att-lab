package br.com.adaptworks.triangulo.specs;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import br.com.adaptworks.triangulo.Triangulo;


@RunWith(ConcordionRunner.class)
public class TrianguloTabelaFixture {

	public String calcularTriangulo(int lado1, int lado2, int lado3) {
		return new Triangulo().classificar(lado1, lado2, lado3);
	}
}