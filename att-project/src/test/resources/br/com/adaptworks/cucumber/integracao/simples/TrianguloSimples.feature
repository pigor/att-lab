# encoding: UTF-8
# language: pt
Funcionalidade: Calculo de Triângulo

  Cenário: Calcular triângulo com valores negativos
  	Dado que o aluno está na tela do classificador de triângulo
  	Quando inserir no lado1 o valor "-2"
  	E inserir no lado2 o valor "-3"
  	E inserir no lado3 o valor "-5"
  	Então é exibida a mensagem ""
  	
  Cenário: Calcular triângulo inválido
  	Dado que o aluno está na tela do classificador de triângulo
  	Quando inserir no lado1 o valor "1"
  	E inserir no lado2 o valor "2"
  	E inserir no lado3 o valor "3"
  	Então é exibida a mensagem ""
  	
  Cenário: Calcular triângulo com letras
  	Dado que o aluno está na tela do classificador de triângulo
  	Quando inserir no lado1 o valor "A"
  	E inserir no lado2 o valor "B"
  	E inserir no lado3 o valor "C"
  	Então é exibida a mensagem ""
  	
  Cenário: Calcular triângulo com valores vazio
  	Dado que o aluno está na tela do classificador de triângulo
  	Quando inserir no lado1 o valor ""
  	E inserir no lado2 o valor ""
  	E inserir no lado3 o valor ""
  	Então é exibida a mensagem ""
  	
  Cenário: Calcular triângulo com símbolos
  	Dado que o aluno está na tela do classificador de triângulo
  	Quando inserir no lado1 o valor "%"
  	E inserir no lado2 o valor "#"
  	E inserir no lado3 o valor "!"
  	Então é exibida a mensagem ""
  	
  Cenário: Calcular triângulo equilátero
  	Dado que o aluno está na tela do classificador de triângulo
  	Quando inserir no lado1 o valor "2"
  	E inserir no lado2 o valor "2"
  	E inserir no lado3 o valor "2"
  	Então é exibida a mensagem "Triângulo Equilátero"
  	
  Cenário: Calcular triângulo isósceles
  	Dado que o aluno está na tela do classificador de triângulo
  	Quando inserir no lado1 o valor "3"
  	E inserir no lado2 o valor "2"
  	E inserir no lado3 o valor "2"
  	Então é exibida a mensagem "Triângulo Isósceles"
  	
  Cenário: Calcular triângulo escaleno
  	Dado que o aluno está na tela do classificador de triângulo
  	Quando inserir no lado1 o valor "11"
  	E inserir no lado2 o valor "12"
  	E inserir no lado3 o valor "13"
  	Então é exibida a mensagem "Triângulo Escaleno"
  	