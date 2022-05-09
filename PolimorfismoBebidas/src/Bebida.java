
public class Bebida {
	
	private String nome;
	private Boolean aquecer;
	
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
