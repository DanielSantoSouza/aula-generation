programa
{
	
	funcao inicio()
	{
	inteiro num,soma=0

	para(num=1; num<=500; num ++)
	{
	//escreva(num," ")
	se(num %3==0 e num %2==1)
	{
		
	escreva(num," ")
	soma = soma + num 
	
	}
	
	}
	escreva("\n",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */