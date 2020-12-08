# encoding: UTF-8
# language: pt

Funcionalidade: Envia Movimento
					 
	Cenário: Mover para o Norte
		Dado que o tamanho do terreno e 10 por 10
		E estou na posicao inicial 0,0
		Quando envio o movimento "2N"
		Entao a posicao final e "0,2"