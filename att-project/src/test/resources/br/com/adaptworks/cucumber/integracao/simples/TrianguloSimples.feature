# encoding: UTF-8
# language: pt
Funcionalidade: Calculo de Triângulo

  Cenário: Calculando triângulo equilátero
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com "3"
    E eu preencho o lado2 com "3"
    E eu preencho o lado3 com "3"
    Entao apresenta mensagem "Triângulo Equilátero"
    
  Cenário: Calculando triângulo isósceles
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com "5"
    E eu preencho o lado2 com "5"
    E eu preencho o lado3 com "9"
    Entao apresenta mensagem "Triângulo Isósceles"
    
  Cenário: Calculando triângulo escaleno
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com "6"
    E eu preencho o lado2 com "3"
    E eu preencho o lado3 com "4"
    Entao apresenta mensagem "Triângulo Escaleno"
    
  Cenário: Calculando triângulo inválido
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com ""
    E eu preencho o lado2 com ""
    E eu preencho o lado3 com ""
    Entao apresenta mensagem ""
    
  Cenário: Calculando triângulo inválido 2
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com "10"
    E eu preencho o lado2 com ""
    E eu preencho o lado3 com ""
    Entao apresenta mensagem ""
    
  Cenário: Calculando triângulo inválido 3
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com "10"
    E eu preencho o lado2 com "10"
    E eu preencho o lado3 com ""
    Entao apresenta mensagem ""
    
  Cenário: Calculando triângulo com valores inválidos
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com "1"
    E eu preencho o lado2 com "2"
    E eu preencho o lado3 com "3"
    Entao apresenta mensagem ""
    
  Cenário: Calculando triângulo com valores zerados
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com "0"
    E eu preencho o lado2 com "2"
    E eu preencho o lado3 com "2"
    Entao apresenta mensagem ""
    
  Cenário: Calculando triângulo com valores negativos
    Dado que eu estou na pagina de consulta de triangulo
    Quando eu preencho o lado1 com "-2"
    E eu preencho o lado2 com "2"
    E eu preencho o lado3 com "2"
    Entao apresenta mensagem ""
