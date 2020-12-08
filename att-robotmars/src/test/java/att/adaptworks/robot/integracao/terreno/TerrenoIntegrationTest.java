package att.adaptworks.robot.integracao.terreno;

import static org.junit.Assert.assertTrue;

import att.adaptworks.robot.Robot;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class TerrenoIntegrationTest {
	int largura, altura, posicaoX, posicaoY;
	
	@Dado("um terreno em marte")
	public void terreno() throws Throwable  {
	    assertTrue(true);
	}

	@Quando("definido uma largura e altura {int},{int}")
	public void definido_largura_altura(int alt, int larg) throws Throwable {
		this.altura = alt;		
	    this.largura = larg;
	}
	
	@E("posição inicial {int},{int}")
	public void posicial_inicial(int x, int y) throws Throwable {
		this.posicaoX = x;
		this.posicaoY = y;
	}
	
	@Então("terreno {string}")
	public void terreno(String arg1) throws Throwable {
		assertTrue(verificarStep(arg1));
	}
	
	@Então("posicao {string}")
	public void posicao(String arg1) throws Throwable {
		assertTrue(verificarStep(arg1));
	}
	
	private boolean verificarStep(String arg1) {
		boolean mensagem = new Robot(this.largura, this.altura, posicaoX, posicaoY).validaConfiguracao();
		return arg1.equals((mensagem ? "valido" : "invalido"));
	}
}
