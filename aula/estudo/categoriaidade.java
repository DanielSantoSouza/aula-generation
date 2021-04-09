package estudo;
import java.io.*;
import java.util.Scanner;
public class categoriaidade {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int infantil,juvenil,adulto;
		System.out.println("entre com a sua idade:");
	    int idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("você esta na categoria infatil.");
		}
		else
		{
			 if(idade>=15 && idade<=17)
			      System.out.println("você esta na categoria juvenil.");
		   else
			    if(idade>=18 && idade<=25)
			    	System.out.println("você esta na categoria adulta.");
			    else
			    	System.out.println("não temos categorias para essa idadde ainda.");	
		}
	}

}
