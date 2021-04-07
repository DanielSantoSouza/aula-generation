
public class internetfibra {
	
	
	private String nomecliente;
	private String idade;
	private String rg;
	private String cep;
	private String telefone;
	
	//metodo construtor
	
	public void internetfibra(String nomecliente,String idade,String rg,String cep,String telefone)

	{
		this.nomecliente = nomecliente;
		this.idade = idade;
		this.rg = rg;
		this.cep = cep;
		this.telefone = telefone;
	}
	public void  imprimirInfo()
	{
		System.out.println("****infomações do cliente****\nnome cliente"+nomecliente+"\nsua idade"+idade+"\nnumero do RG"+rg+"cep"+cep+"\ncontato de telefone"+telefone);
	}
	public String getnomecliente() {
		return nomecliente;
	}
	public void setnomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public String getidade() {
		return idade;			
	}
	public void setidadeidade(String idade) {
		this.idade = idade;
	}
	public String getrg() {
		return rg;			
	}
	public void setrg(String rg) {
		this.rg = rg;
	}
	public String getcep() {
		return cep;			
	}
	public void setcep(String cep) {
		this.cep = cep;
	}
	public String gettelefone() {
		return telefone;			
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}

	
 }
	



