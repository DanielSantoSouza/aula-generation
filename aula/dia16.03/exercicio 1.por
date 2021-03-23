programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		
		inteiro idade, mes, dia
          cadeia pessoa
          
          escreva ("\nseu nome: ")
          leia(pessoa)
          escreva ("\nsua idade: ")
          leia(idade)
          escreva ("\nmes que você faz aniversario: ")
          leia (mes)
          escreva ("\nem qual dia vc nasceu: ")
          leia(dia)

          escreva ("\nmeu nome é: ", pessoa)
          escreva ("\nminha idade é: ",idade)
          
          mes = idade * 12
          dia = idade * 365

          escreva("\n", pessoa, "possui: ", idade, "de idade ")
          escreva("\npossui: ", mes, "meses de vida ")
          escreva("\npossui: ", dia, "dias de vida ")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 731; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */