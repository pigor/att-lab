# encoding: UTF-8
# language: pt

Funcionalidade: Configura Robo
					 
	Cenário: Configura Terreno
		Dado um terreno em marte
		Quando definido uma largura e altura "0,0"
		E posicao inicial "0,0"
		Então as configurações são "terreno invalido"
		
	Cenário: Configura Terreno
		Dado um terreno em marte
		Quando definido uma largura e altura "10,10"
		E posicao inicial "-1,0"
		Então as configurações são "posicao invalido"
					 
	Cenário: Configura Terreno
		Dado um terreno em marte
		Quando definido uma largura e altura "10,10"
		E posicao incial "100,100"
		Então as configurações são "posicao invalido" 