import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;



public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Cadastre 4 pessoas pfv ");
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		Scanner teclado =  new Scanner (System.in);
			
			for(int x = 0; x < 4;x++) {
		
			Pessoa pessoa = new Pessoa(); 
			
			System.out.println("Digite seu nome");
			pessoa.setNome(teclado.next());
			
			
			System.out.println("Digite sua idade");
			pessoa.setIdade(teclado.nextInt());
			
			pessoa.setEndereco(new Endereco());
			
			System.out.println("Digite sua rua");
			pessoa.getEndereco().setRua(teclado.next());
			
			System.out.println("Digite seu bairro");
			pessoa.getEndereco().setBairro(teclado.next());
			
			System.out.println("Digite seu numero");
			pessoa.getEndereco().setNumero(teclado.nextInt());
			
			lista.add(pessoa);		
		}
		
			//gravar lista no txt//
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("cadastro.txt"))) {
			for(Pessoa pessoa : lista)
				escrever.write(pessoa.toString()+"\n");
		}
		
			
		//ler txt//
		try(BufferedReader reader = new BufferedReader(new FileReader("cadastro.txt"))) {
			String linha;
					
				
			System.out.println("Sexo");
			System.out.println("Feminino = 1 ou Masculino = 2");
			int opcao=0;
			while(opcao!=1 && opcao!=2){
				opcao = cadastro.NextLine();
				if(opcao==2)
					Pessoa.setGenero(Genero.FEMININO);
				
				else if(opcao==2)
					Pessoa.setGenero(Genero.MASCULINO);
				
				
				
				
			}

		}
	}
}
