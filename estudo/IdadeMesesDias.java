package estudo;
import java.util.Scanner;
public class IdadeMesesDias {
public static void main(String[] args) {
	
 Scanner ler = new Scanner (System.in);
 System.out.println("seu nome:");
 String nome = ler.next();
 System.out.println("informe sua idade:");
 System.out.println("anos:");
 int anos = ler.nextInt();
 System.out.println("meses");
 int meses = ler.nextInt();
 System.out.println("dias");
 int dias = ler.nextInt();
 
 int quantdiasanos = anos * 365;
 int quantdiasmeses = meses * 30;
 
 int resultado = quantdiasanos + quantdiasmeses + dias;
 System.out.println(nome+",voce tem "+resultado+" dias");
}
}
