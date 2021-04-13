import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[6];
		int contipar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.println("\nentre com o "+(i+1)+"o. numero:");
			num[i] = leia.nextInt();
			
			if(num[i]%2==0)
			{
				contipar = contipar + num[i];
			}else 
			{
				contimpar++;
			}
		}
		for(int i=0;i<6;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]+" esse numero e par");
			}
			else
			{
				System.out.println(num[i]+" esse numero e impar");
			}
		}
		System.out.println("\nsoma dos numeros pares: "+contipar);
		System.out.println("\nquantidade dos numeros impares: "+contimpar);
	}
}

