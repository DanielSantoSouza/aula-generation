import java.util.Scanner;

public class idadevarias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,id21=0,id50=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe a sua idade:");
		idade = ler.nextInt();
		while(idade<1 || idade>120)
		{
			System.out.println("informe a sua idade:");
		    idade = ler.nextInt();
		}	
		while(idade!=-99)
		{
			if(idade<21)
			{
				id21++;
			}
			if(idade>50)
			{
				id50++;
			}
			System.out.println("informe com a idade");
			idade = ler.nextInt();
		}
		System.out.println("\ntemos:"+id21+" pessoas com menos de 21 anos...");
		System.out.println("\ntemos:"+id50+" pessoas com mais de 50 anos...");
			
	}

}
