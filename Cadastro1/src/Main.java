import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		Scanner teclado =  new Scanner (System.in);
		
		for (int x = 0; x < 4;x++) {
		
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
		
		try(BufferedWriter reader = new BufferedWriter(new FileWriter("cadastro.txt"))) {
			for(Pessoa pessoa : lista)
				reader.write(pessoa.toString()+"\n");
		}
		
		

	}

}
