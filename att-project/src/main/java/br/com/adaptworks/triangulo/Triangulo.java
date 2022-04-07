package br.com.adaptworks.triangulo;

public class Triangulo {

	public String calcular(int lado1, int lado2, int lado3) {
		return classificarTriangulo(lado1, lado2, lado3);
	}
	
	public String calcular(String lado1, String lado2, String lado3) {
		try {			
			int l1 = Integer.parseInt(lado1);
			int l2 = Integer.parseInt(lado2);
			int l3 = Integer.parseInt(lado3);
			
			return classificarTriangulo(l1, l2, l3);
			
		} catch(NumberFormatException e) {
			return "";
		}
	}

	private String classificarTriangulo(int l1, int l2, int l3) {
		if(validaTriangulo(l1, l2, l3)) {				
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

	private boolean validaTriangulo(int l1, int l2, int l3) {
		return (l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2);
	}
}
