
public class Pessoa {
	
	private enum SEXO{
		MASCULINO, FEMININO,NEUTRE;
	}
	
	private int idade;
	private Endereco endereco;
	private String nome;
	
	
	
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", endereco=" + endereco + ", nome=" + nome + "]";
	}
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	

}
