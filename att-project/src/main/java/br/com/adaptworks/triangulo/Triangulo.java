package br.com.adaptworks.triangulo;

public class Triangulo {

	public String classificar(int lado1, int lado2, int lado3) {
		if(verificarTrianguloValido(lado1, lado2, lado3)) {
			if(lado1 == lado2 && lado2 == lado3) {
				return "Triângulo Equilátero";
			}
			
			if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				return "Triângulo Escaleno";
			}
			
			return "Triângulo Isósceles"; 
		}
		return "";
	}

	private boolean verificarTrianguloValido(int lado1, int lado2, int lado3) {
		return lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2);
	}
}
