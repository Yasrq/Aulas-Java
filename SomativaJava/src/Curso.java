
public class Curso extends Usuario{

	
	private String titulo;
	private double qtdHorasCurso;
	private double valorHoraCurso;
	private Professor professor;
	
	public Curso(String titulo, double qtdHorasCurso, double valorHoraCurso, Professor professor) {
		super();
		this.titulo = titulo;
		this.qtdHorasCurso = qtdHorasCurso;
		this.valorHoraCurso = valorHoraCurso;
		this.professor = professor;
	}

	public Curso() {
	}

	Curso curso = new Curso();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getQtdHorasCurso() {
		return qtdHorasCurso;
	}

	public void setQtdHorasCurso(double qtdHorasCurso) {
		this.qtdHorasCurso = qtdHorasCurso;
	}

	public double getValorHoraCurso() {
		return valorHoraCurso;
	}

	public void setValorHoraCurso(double valorHoraCurso) {
		this.valorHoraCurso = valorHoraCurso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", qtdHorasCurso=" + qtdHorasCurso + ", valorHoraCurso=" + valorHoraCurso
				+ ", professor=" + professor + ", curso=" + curso + "]";
	}
	
	
}
