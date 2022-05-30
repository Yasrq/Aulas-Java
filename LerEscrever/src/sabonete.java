public class sabonete {

	String cheiro;
	String cor;
	
	
	@Override
	public String toString() {
		return "Sabonete: cheiro=" + cheiro + ", cor=" + cor;
	}
	
	public sabonete(String cheiro, String cor) {
		super();
		this.cheiro = cheiro;
		this.cor = cor;
	}


	public sabonete(String linha) {

		String[] arrayAuxiliar1 = linha.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim();
		
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
		
		
	}
	
	
	
}
