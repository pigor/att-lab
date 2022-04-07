# encoding: UTF-8
# language: pt
Funcionalidade: Calculo de Triângulo

  Cenário: Calculando triângulo equilátero
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho os seguintes lados
      | lado1 | lado2 | lado3 |
      |     2 |     3 |     2 |
      |     3 |     2 |     2 |
    Entao apresenta mensagem "Triângulo Isósceles"
