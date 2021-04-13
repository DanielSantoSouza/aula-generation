
public class empresa {

	private String roteador;
	private String megas;

	private int total_comprado=0;
	
	public empresa(String roteador,String megas)
	{
		this.roteador = roteador;
		this.megas = megas;
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
	public void setRoteador(String roteador) {
		this.roteador = roteador;
	}
	public void setMegas(String megas) {
		this.megas = megas;
	}
	public void setTotal_comprado(int total_comprado) {
		this.total_comprado = total_comprado;
	}	
	
}
