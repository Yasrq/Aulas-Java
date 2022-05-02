
	public class main {
	public static void main(String[] args) {
//		
//		Pessoa pessoa1 = new Pessoa(); 
//		
//		pessoa1.nome = "Yasmim";
//		pessoa1.numFigurinhas = 1; 
//		
//		pessoa1.receber(3);
//		
//		System.out.println(pessoa1.nome);
//		System.out.println(pessoa1.numFigurinhas);
//		
//		Pessoa pessoa2 = new Pessoa();
//		
//		pessoa2.nome = "Wesley";
//		pessoa2.numFigurinhas = 5; 
//	
//		System.out.println(pessoa2.nome);
//		System.out.println(pessoa2.numFigurinhas);
//		
//		boolean msg = pessoa1.dar(8, pessoa2);
//
//		if(msg==true)
//			System.out.println(pessoa1.nome);
//			System.out.println(pessoa1.numFigurinhas);
//			
//			System.out.println(pessoa2.nome);
//			System.out.println(pessoa2.numFigurinhas);
//				
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Yasmim");
		cliente1.setCpf(343576);
		cliente1.setNumConta(55555);
		 
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getNumConta());
		
		System.out.println(cliente1); 
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("yasmim");
		cliente2.setCpf(887767);
		cliente2.setNumConta(749965);
		
		//cliente1 = cliente2;
		
		
		//comparação de objetos 
		System.out.println(cliente2);
		
		if(cliente1.getNome() == cliente2.getNome()) {
			System.out.println("os objetos são iguais");
		}else {
			System.out.println("os objetos são diferentes");
		}
		if(cliente1 == cliente2) {
			System.out.println("os objetos são iguais");
		}else {
			System.out.println("os objetos são diferentes");
		}
		if(cliente1.equals(cliente2)) {
			System.out.println("os atributos dos objetos são iguais");
		}else {
			System.out.println("os atributos são diferentes");
			
		}
	}
}
	




