public class Endereco {

 private String bairro;
 private String rua; 
 private int numero;
 
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Endereco [bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + "]";
	} 
	 
	
	String[] arrayLinha = linha.split(",");

	String[] arrayBairro = arrayLinha[0].split("=");
	this.bairro = arrayBairro[1].trim();
	
	String[] arrayRua = arrayLinha[1].split("=");
	this.rua = arrayRua[1].trim();
	
	String[] arrayNumero = arrayLinha[2].split("=");
	this.numero = Integer.parseInt(arrayNumero[1].trim());
	
 	
		
	}
}

