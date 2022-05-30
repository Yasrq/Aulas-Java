import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

public class Aplicacao {

	public  static  void  main (String [] args) throws  IOException {
				
				
				//objetos criados//
				sabonete sabonete1 = new sabonete("lavanda", "lilás");
				sabonete sabonete2 = new sabonete("maracujá", "amarelo");
				sabonete sabonete3 = new sabonete("blueberry", "azul");
				
				//gravar em um list//
				List<sabonete> listaDesabonete = new ArrayList<sabonete>();
				
				listaDesabonete.add(sabonete1);
				listaDesabonete.add(sabonete2);
				listaDesabonete.add(sabonete3);
				
				
				try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Sabonete.txt"))) {
					for(sabonete sabonete : listaDesabonete)
						escrever.write(sabonete.toString()+"\n");
				}
					List<sabonete> listaDesabonetes = new ArrayList<>();	
				
				
				try(BufferedReader reader = new BufferedReader(new FileReader("Sabonete.txt"))) {
						String line;
							
							
							while((line = reader.readLine())!= null) {
								sabonete sabonete = new sabonete(line);
								listaDesabonetes.add(sabonete);							
							}
				}
				
				for(sabonete sabonete : listaDesabonetes)
					System.out.println(sabonete);
			
		}

}
