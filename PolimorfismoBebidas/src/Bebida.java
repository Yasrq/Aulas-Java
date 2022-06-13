
public class Bebida {
	//Variável privada para outras classes//
	private String nome;
	private Boolean aquecer;
	//get e set das variáveis//
	public Bebida(String nome, Boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	public void preparar() { 
		System.out.println("Pegando o copo");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAquecer() {
		return aquecer;
	}

	public void setAquecer(Boolean aquecer) {
		this.aquecer = aquecer;
	}

}
