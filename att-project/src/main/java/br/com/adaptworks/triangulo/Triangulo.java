package br.com.adaptworks.triangulo;

public class Triangulo {

	public String classificar(String lado1, String lado2, String lado3) {
		try {
			Integer l1 = Integer.parseInt(lado1);
			Integer l2 = Integer.parseInt(lado2);
			Integer l3 = Integer.parseInt(lado3);
			
			return classificar(l1, l2, l3);
			
		} catch(NumberFormatException e) {
			return "";
		}
	}

	public String classificar(Integer l1, Integer l2, Integer l3) {
		if(verificarTrianguloValido(l1, l2, l3)) {
			if(l1 == l2 && l2 == l3) {
				return "Triângulo Equilátero";
			}
			
			if(l1 != l2 && l2 != l3 && l1 != l3) {
				return "Triângulo Escaleno";
			}
			
			return "Triângulo Isósceles";
		}
		
		return "";
	}

	private boolean verificarTrianguloValido(Integer l1, Integer l2, Integer l3) {
		return (l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l2 + l1);
	}
}
