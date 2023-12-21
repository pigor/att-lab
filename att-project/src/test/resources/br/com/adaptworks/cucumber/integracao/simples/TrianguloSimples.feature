# encoding: UTF-8
# language: pt
Funcionalidade: Calculo de Triângulo

  Cenário: Calculando triângulo equilátero
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com 1
    E eu preencho o lado2 com 3
    E eu preencho o lado3 com 3
    Entao apresenta mensagem "Triângulo Equilátero"
    
  Cenário: Calculando triângulo escaleno
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com 3
    E eu preencho o lado2 com 5
    E eu preencho o lado3 com 7
    Entao apresenta mensagem "Triângulo Escaleno"
    
   Cenário: Calculando triângulo escaleno
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com 3
    E eu preencho o lado2 com 3
    E eu preencho o lado3 com 5
    Entao apresenta mensagem "Triângulo Isósceles"
    
   Cenário: Calculando triângulo inválido - valor zero
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com 3
    E eu preencho o lado2 com 0
    E eu preencho o lado3 com 5
    Entao apresenta mensagem ""
    
   Cenário: Calculando triângulo inválido - valor negativo
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com 3
    E eu preencho o lado2 com -3
    E eu preencho o lado3 com 5
    Entao apresenta mensagem ""
    
   Cenário: Calculando triângulo inválido
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com 1
    E eu preencho o lado2 com 2
    E eu preencho o lado3 com 3
    Entao apresenta mensagem ""
