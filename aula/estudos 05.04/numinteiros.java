import java.util.Scanner;

public class numinteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,somamult3=0,contmult3=0;
		float mediamult3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		num = leia.nextInt();
		
		do
		{
			if(num%3==0)
			{
				somamult3 = somamult3+ num;
				contmult3++;
			}
			System.out.println("\ninforme o valor: ");
			num = leia.nextInt();
			
		}while(num!=0);
		
		mediamult3 = somamult3 / contmult3;
		System.out.println("\nO valor dos n�meros multiplos de 3 foi de: "+mediamult3);
	}

}
