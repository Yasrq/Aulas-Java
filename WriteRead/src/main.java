import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		 
		
			String y = "texto";
			//escrever//
			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) {
			//Variavel do tipo BufferedWriter
					
			escrever.write(y);
         
                        //ler - usuário//
			try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt")))  {
				String line;
				String string = "";
				//enquanto - condição//
				while((line = reader.readLine())!=null) {
					string += line + "\n";
				}
				
				System.out.println(string);
				
				
				
			
				
			
		
			}
		}
	}
}
