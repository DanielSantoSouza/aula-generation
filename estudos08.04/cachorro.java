
public class cachorro {

	public String nome;
	public static String idade;
	public static String som;
	public Integer devecorrer;
	
	public cachorro(String nome)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.devecorrer = devecorrer;
		
	}

	public cachorro(String nome2, String idade2, String som2) {
		// TODO Auto-generated constructor stub
	}

	public cachorro() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public static String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public Integer getDevecorrer() {
		return devecorrer;
	}

	public void setDevecorrer(Integer devecorrer) {
		this.devecorrer = devecorrer;
	}
	
 }
