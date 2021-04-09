package estudo;

public class ordemcrescente {
	
	public static void main(String[]args) {
		
		int  [] lista = {33,240,130};
		
		int aux;
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if(lista[j] > lista[j+1]) {
					aux = lista[j];
					lista[j] = lista[j+1];
					lista[j+1] = aux;
				
				}
			}
		}
		int k = 0;
		while(k < lista.length) {
			System.out.println(lista[k] + ",");
			k++;
		}
	}

}
