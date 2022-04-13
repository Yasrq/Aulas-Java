
public class Pessoa {
	String nome; 
	int numFigurinhas;
	
	
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas; 
	}
	
	boolean dar(int numFigurinhas, Pessoa pessoa) 
	{
		//boolean msg;
		if(this.numFigurinhas < numFigurinhas) {
			System.out.println("O número de figurinhas que vc tem é menor do que o que vc quer dar!!!");
			return false; 
			//msg = false;
				
		}else {
			this.numFigurinhas -= numFigurinhas; 
			pessoa.receber(numFigurinhas);
			return true;  
			//msg = true;
		
		}
		//return msg; 
	}
}