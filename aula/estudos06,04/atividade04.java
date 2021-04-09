import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int constante,op;
		
		 Scanner leia = new Scanner(System.in);
		
		for(int l=0;l<2;l++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.println("\nentre com o valor da matriz1: ");
				matriz1[l][c] = leia.nextInt();
				System.out.println("\nentre com o valor da matriz2: ");
				matriz2[l][c] = leia.nextInt();
			}
		}
		System.out.println("\nentre com o valor daconstante ");
		constante =leia.nextInt();
		System.out.println("\n1 - somar as duas matrizes ");
		System.out.println("\n2 - subtrair a primeira matriz da segunda ");
		System.out.println("\n3 - adicionar uma constante as duas matrizes ");
		System.out.println("\n4 - imprimir as matrizes ");
		System.out.println("\n5 - sair ");
		System.out.println("\n escolha uma opção para executar ");
		op = leia.nextInt();
		while(op<1 || op>5)
		{
			System.out.println("\nentre com o valor daconstante ");
			System.out.println("\n1 - somar as duas matrizes ");
			System.out.println("\n2 - subtrair a primeira matriz da segunda ");
			System.out.println("\n3 - adicionar uma constante as duas matrizes ");
			System.out.println("\n4 - imprimir as matrizes ");
			System.out.println("\n5 - sair ");
			System.out.println("\n escolha uma opção para executar ");
			op = leia.nextInt();
		}
		if(op!=5)
		{
			
		
			switch(op)
			{
			case 1:
				for(int l=0;l<2;l++)
				{
					for(int c=0;c<2;c++)
					{
						matriz3[l][c]=matriz1[l][c]+matriz2[l][c];
						System.out.println("\nsomatorio: "+matriz3[l][c]);
					}
					
					}					
					break;
				case 2:
					for(int l=0;l<2;l++)
					{
						for(int c=0;c<2;c++)
							{
								matriz3[l][c]=matriz2[l][c]-matriz1[l][c];
								System.out.println("\ndiferença: "+matriz3[l][c]);
							}
					}
						break;
					case 3:
						for(int l=0;l<2;l++)
						{
							for(int c=0;c<2;c++)

									{
										matriz1[l][c]=matriz1[l][c]+constante;
										matriz2[l][2]=matriz2[l][c]+constante;
										System.out.println("\nmatriz1: "+matriz1[l][c]+"\t\tmatriz2: "+matriz2[l][c]);
									}
								}
								break;
							case 4:
								for(int l=0;l<2;l++)
								{
									for(int c=0;c<2;c++)
									{
										System.out.println("\nmatriz1: "+matriz1[l][c]+"\t\tmatriz2: "+matriz2[l][c]);
									}
								}
								break;
						}
				}
				else
				{
					System.out.println("\ntchau tchau...");
				}
				
			}

		}

		