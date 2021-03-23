programa
{
	
	funcao inicio()
	{
		inteiro vet[5],x,maior=0

		para (x=0;x<4;x++)
		{
			escreva("\nentre com um numero: ")
			leia(vet[x])	
			se(vet[x]>maior)
			{
				maior=vet[x]
			}
		}
		para(x=0;x<4;x++)
		{
			

			escreva("\nvalor posição",x,":",vet[x])
		}
		escreva("\nMaior:",maior)					
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */