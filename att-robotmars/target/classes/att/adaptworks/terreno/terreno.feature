# encoding: UTF-8
# language: pt
Funcionalidade: Configura Robo

  Cenário: Configura terreno invalido
    Dado um terreno em marte
    Quando definido uma largura e altura 0,0
    E posição inicial 0,0
    Então terreno "invalido"