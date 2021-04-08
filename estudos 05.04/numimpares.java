import java.util.Scanner;

public class numimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, contpar = 0, contimpar = 0, contador;
		
		Scanner ler = new Scanner(System.in);
		
		for(contador = 1; contador <= 10; contador++)
		{
			System.out.printf("informe o numero %d: \n\n", contador);
	        num = ler.nextInt();
	        
	        if(num % 2 == 0)
	        {
	        	contpar++;
	        }
	        else
	        {
	        	contimpar++;	        	
			}
			
		}
		
		System.out.println("\n temos: "+contpar+" numeros pares...");
		System.out.println("\n temos: "+contimpar+" numeros impares...");

	}

}
