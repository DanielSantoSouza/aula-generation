import java.util.Scanner;

public class testeempresafibra {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner leia = new Scanner(System.in);
			
			System.out.println("-------teste da classe internetfibra-----");
			internetfibra cliente = new internetfibra("daniel santos","24","93.005.200-5","08594-250","1194816-5812: ");
			cliente.comprarmegas();//1
			cliente.comprarroteador();//1
			cliente.imprimirInfo();
			
			System.out.println("\n-----teste da classe empresa-----");
			leia.nextLine();
			System.out.println("digite o seu nome: ");
			String nome = leia.nextLine();
			System.out.println("digite sua idade: ");
			String idade = leia.nextLine();
			System.out.println("digite o numero do seu rg: ");
			String rg = leia.nextLine();
			System.out.println("digite o seu cep: ");
			String cep = leia.nextLine();
			System.out.println("digite o seu numero de telefone: ");
			String telefone = leia.nextLine();
			System.out.println("informe quantas megas você vai querer assinar: ");
			String megas = leia.nextLine();
			System.out.println("com quantas antenas você quer seu rotiador: ");
			String roteador = leia.nextLine();
			}
			System.out.println("cadastro finalizado entraremos em contato em até 24 horas: ");
			
			
		}

	}


