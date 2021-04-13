import java.util.Scanner;

public class todosnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int num,soma;
		
		System.out.println("contagem de 1000 até 1999");
		for( num=1000; num<=1999;num++)
		
		do
		{
		System.out.printf("\n %d" ,num);
		}
		while(num<=1999);
		num= num%11;
		if(num>1999);
	}

}
