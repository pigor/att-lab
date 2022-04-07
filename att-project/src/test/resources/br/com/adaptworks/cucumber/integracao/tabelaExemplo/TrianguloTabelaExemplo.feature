# encoding: utf-8
# language: pt
# Este exemplo utiliza o Scenario Outline que foi traduzido como Esquema do Cenário.
# Um Scenario Outline deve sempre utilizar a subistituição dos valores por <coluna_tabela>
# e deve conter, obrigatoriamente, um item de Exemples (Exemplos)
# https://github.com/cucumber/cucumber/wiki/Scenario-Outlines
Funcionalidade: Calculo de triangulos

  Esquema do Cenario: Calculo de todos os tipos de triangulo
    Dado os tres campos de entrada
    Quando eu informo o lado1 com valor <lado1>
    E eu informo o lado2 com valor <lado2>
    E eu informo o lado3 com valor <lado3>
    Entao exibe a mensagem "<resultado>"

    Exemplos: 
      | lado1 | lado2 | lado3 | resultado            |
      |     1 |     2 |     1 | Triângulo Equilátero |
      |     5 |     3 |     4 | Triângulo Escaleno   |
      |     2 |     3 |     3 | Triângulo Isósceles  |
