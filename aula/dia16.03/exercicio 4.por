programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		
		real nota1,nota2,nota3,media

		escreva("entre com a nota 1: ")
		leia(nota1)
		escreva("entre com a nota 2: ")
		leia(nota2)
		escreva("entre com a nota 3: ")
		leia(nota3)

		media=(nota1+nota2+nota3)/3

		escreva("\nmedia: ",media)//5.5 7.0

		se(media>=7.0 e media<=10)
          {
          	escreva("\naluno aprovado!!!")
          }	
          senao se(media>=5.0 e media<7.0)
          {
          	escreva("\naluno de exame!!!")
          		
          }
          }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */