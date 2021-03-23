programa
{
	
	funcao inicio()
	{
         
          real ip,liberado, reprovado,poluentes,grupo1,grupo2,grupo3
           

          escreva("\ninforme o valor de poluentes:")
          leia(ip)

          se(ip>= 0.05 e ip<=0.25)
          {
          	escreva("\nNivel acetial...")
          }
          senao se(ip>=0.30 e ip<=0.40)
          {
          	escreva("\nNivel acima do permitido pare as ativdades temporarialmente...")
          }
          senao se(ip>=0.50)
          {
          	escreva("\nNivel acima do permitido encerre todas ás atividades por tempo indeterminado...")
          	 
          }
         
          
          



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 606; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */