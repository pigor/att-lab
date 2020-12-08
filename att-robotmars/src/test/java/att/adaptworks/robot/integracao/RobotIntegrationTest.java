package att.adaptworks.robot.integracao;

import org.junit.Assert;

import att.adaptworks.robot.Robot;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class RobotIntegrationTest {
	
	int tamanhoX, tamanhoY, posicaoX, posicaoY;
	String movimento;
	Robot robot;
	
	@Dado("que o tamanho do terreno e {int} por {int}")
	public void que_o_tamanho_do_terreno_e(int tamanhoX, int tamanhoY) throws Throwable {
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
	}

	@E("estou na posicao inicial {int},{int}")
	public void estou_na_posicao_inicial(int posicaoX, int posicaoY) throws Throwable {
	    this.posicaoX = posicaoX;
	    this.posicaoY = posicaoY;
	}
	
	@Quando("envio o movimento {string}")
	public void envio_o_movimento(String movimento) throws Throwable {
	    this.movimento = movimento;
	}
	
	@Entao("a posicao final e {string}")
	public void a_posicao_final_e(String posicaoFinal) throws Throwable {
		Robot robot = new Robot(tamanhoX, tamanhoY, posicaoX, posicaoY);
		
		Assert.assertEquals(posicaoFinal, robot.movimentar(movimento));
	}
}
