
public class Pessoa {
	
	public Pessoa() {
}
	
	private enum GENERO{
		MASCULINO, FEMININO;
	}
	
	private String nome;
	private int idade;
	private Endereco endereco;
	private GENERO genero;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public GENERO getGenero() {
		return genero;
	}
	public void setGenero(GENERO genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", genero=" + genero + "]";
	}
	
	
	public Pessoa(String linha) {
		
		String[] arrayLinha = linha.split(",");

		String[] arrayNome = arrayLinha[0].split("=");
		this.nome = arrayNome[1].trim();
		
		String[] arrayIdade = arrayLinha[1].split("=");
		this.idade = Integer.parseInt(arrayIdade[1].trim());
		
		String[] arrayGenero = arrayLinha[2].split("=");
		this.genero = GENERO.valueOf(arrayGenero[1].trim());
	}

	
		
	}
	

