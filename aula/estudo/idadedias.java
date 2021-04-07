package estudo;
import java.util.Scanner;
public class idadedias {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("entre com sua idade em dias");
		int dias = ler.nextInt();
		int anos = dias / 365;
		int meses = (dias % 365) /30;
	    dias = meses % 30;
		
	    
	    System.out.println("voce tem " + anos+" anos"+meses+" meses"+dias+" dias");
	}

}
