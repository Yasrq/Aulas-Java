
public class Main {

	public static final double PI = 3.14;
	
	private enum Sexo{
		MASCULINO, FEMININO;
	}
	
	public static void main(String[] args) {
		
		double pi = Main.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		
		System.out.println(num);
		
		//alternativa de usar o objeto com string//
		String s = "TERCA";
		
		//conver��o da vari�vel "ter�a"//
		hoje = DiaDaSemana.valueOf(s);
		
		System.out.println(hoje.getNum() );
	
		//vari�veis padronizadas, constantes//
		Sexo sexo = Sexo.FEMININO;
		sexo = Sexo.MASCULINO;
	}

}
