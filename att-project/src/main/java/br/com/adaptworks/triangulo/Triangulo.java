package br.com.adaptworks.triangulo;

public class Triangulo {

	public String classificar(int lado1, int lado2, int lado3) {
		if((lado1 < lado2 + lado3)
			&& (lado2 < lado1 + lado3)
			&& (lado3 < lado2 + lado1)){			
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

	public String classificar(String l1, String l2, String l3) {
		try {
			int lado1 = Integer.parseInt(l1);
			int lado2 = Integer.parseInt(l2);
			int lado3 = Integer.parseInt(l3);
			
			return classificar(lado1, lado2, lado3);
			
		} catch(NumberFormatException e) {
			return "";
		}
	}
}
