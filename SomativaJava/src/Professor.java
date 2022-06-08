
public class Professor extends Usuario{
	
	private Double salario;
	
	public Professor() {
	}

	Professor professor = new Professor();
	
	
	public Professor(Double salario) {
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", professor=" + professor + "]";
	}
	
	
	
	
	

}

	
	
	
