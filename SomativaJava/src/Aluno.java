
public class Aluno extends Usuario{
	
	private double valorPagarCurso;
	private Curso curso;
	private FormaPag formaPag;
	
	
	public Aluno() {
	}
	
	Aluno aluno = new Aluno();

	public Aluno(double valorPagarCurso, Curso curso, FormaPag formaPag) {
		super();
		this.valorPagarCurso = valorPagarCurso;
		this.curso = curso;
		this.formaPag = formaPag;
	}

	public double getValorPagarCurso() {
		return valorPagarCurso;
	}

	public void setValorPagarCurso(double valorPagarCurso) {
		this.valorPagarCurso = valorPagarCurso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public FormaPag getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(FormaPag formaPag) {
		this.formaPag = formaPag;
	}

	@Override
	public String toString() {
		return "Aluno [valorPagarCurso=" + valorPagarCurso + ", curso=" + curso + ", formaPag=" + formaPag + ", aluno="
				+ aluno + "]";
	}

	
	
	

}


