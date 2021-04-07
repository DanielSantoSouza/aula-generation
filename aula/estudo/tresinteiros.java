package estudo;

import java.util.Scanner;

public class tresinteiros {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite n1:");
		int n1=leitor.nextInt();
		System.out.println("digite n2;");
		int n2=leitor.nextInt();
		System.out.println("digite n3");
		int n3=leitor.nextInt();
		
		int maior;
		
		if(n3>n2 && n3>n1) {
			maior = n3;
			System.out.println("maior"+maior);
		}else if (n2>n1 && n2>n3 ) {
			maior = n2;
			System.out.println("maior:"+ maior);
		}else {
			maior = n1;
		}
		
		leitor.close();				
	}

}
