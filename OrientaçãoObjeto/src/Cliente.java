import java.util.Objects;

public class Cliente {
	private String nome;
	private int cpf;
	private int numConta;
	
	public Cliente() {

	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf1(int cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
		
	}

	public void setCpf(int cpf2) {
	
		
		
	}

	
	
	
}



