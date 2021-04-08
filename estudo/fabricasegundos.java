package estudo;
import java.io.*;
import java.util.Scanner;
public class fabricasegundos {
	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br= new BufferedReader (isr);

			int seg,min,hr;
			System.out.println("informe segundos: ");
			seg=Integer.parseInt (br.readLine());
			
			hr=seg/3600;
			min=seg/60 - hr * 60;
			seg=seg-min*60-hr *3600;
			
			System.out.println(hr+" horas "+min+" minutos "+seg+" segundos");
			
					
	}

}
