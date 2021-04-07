
public class empresa {

	private String roteador1antena;
	private String roteador2antena;
	private String roteador4antena;
	private String megas30;
	private String megas50;
	private String megas80;
	private int total_comprado=0;
	
	public empresa(String roteador1antena,String roteador2antena,String roteador4antena,String megas30,String megas50,String megas80)
	{
		this.roteador1antena = roteador1antena;
		this.roteador2antena = roteador2antena;
		this.roteador4antena = roteador4antena;
		this.megas30 = megas30;
		this.megas50 = megas50;
		this.megas80 = megas80;
		
	}
	public void comprarroteador()
	{
	 this.total_comprado++;
	}
	
	public void comprarmegas()
	{
		if(total_comprado>0)
		{
			this.total_comprado--;
		}
	}
	
}
