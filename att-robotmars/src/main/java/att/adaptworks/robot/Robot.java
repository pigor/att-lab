package att.adaptworks.robot;

public class Robot {

	private int tamanhoX, tamanhoY, posicaoX, posicaoY;
	
	public Robot(int tamanhoX, int tamanhoY, int posicaoX, int posicaoY) {
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	public String movimentar(String movimento) {
		// Verificar se o terreno e a posicao inicial sao validos
		
		String[] movimentos = movimento.split(" ");
		
		for (String proximoMovimento : movimentos) {
			Integer passos = Integer.parseInt(proximoMovimento.substring(0, proximoMovimento.length()-1));
			String direcao = proximoMovimento.substring(proximoMovimento.length()-1, proximoMovimento.length());
			
			// Logica de movimentacao
		}
		
		// Logica de definicao da posicao final
		
		return null;
	}

	public boolean validaConfiguracao() {
		return false;
	}
}
