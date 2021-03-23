programa
{
	
	funcao inicio()
	{
	 real base,altura,area

	 escreva("\ncalculando a area de um triangulo: ")
	 escreva("\ninsira um valor de base para o triangulo: ")
	 leia(base)
	 escreva("\ninsira um valor para a altura do triangulo: ")
	 leia(altura)

	 se (base>0 e altura> 0)
	 {
	 	area = (base * altura) / 2
	 	escreva("\na area do triangulo é igual: ", area)
	 }
	 senao
	 {
	 	escreva("\nerro! algum dos valores digitados não é valido!:")
	 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */