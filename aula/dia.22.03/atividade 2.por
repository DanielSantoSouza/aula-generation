programa
{
	
	funcao inicio()
	{
		inteiro lancamento[10],soma=0,x,contmaior=0
		real media

		para(x=0;x<10;x++)
		{
			escreva("digite o lançamento: ")
			leia(lancamento[x])

			soma= soma+lancamento[x]

			se(lancamento[x] == 6)
			{
				contmaior++
			}
		}
		para(x=0;x<10;x++)
		{
			escreva("lançamento ",x+1,": ",lancamento[x])
			
		}
		media = soma / 10
		escreva("media de lançamento: ",media)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */