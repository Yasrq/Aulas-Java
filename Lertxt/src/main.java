import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		

			try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt")))  {
				String line;
				String string = "";
				
				while((line = reader.readLine())!=null) {
					string += line + "\n"; //pula uma linha//
				}
				
				System.out.println(string);
				
				String teste = "Sabonete: cheiro=Azedo, cOR=Verde";
				
				Sabonete sabonete2 = new Sabonete(teste);
				
				System.out.println(sabonete2);
				 
				
		}
	}
}
