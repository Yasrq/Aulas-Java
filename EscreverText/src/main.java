import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

		public class main {

			public  static  void  main (String [] args) throws  IOException {
				
				Sabonete sabonete1 = new Sabonete("lavanda", "lilás");
				Sabonete sabonete2 = new Sabonete("maracujá", "amarelo");
				Sabonete sabonete3 = new Sabonete("blueberry", "azul");
				
				List<Sabonete> listaDeSabonete = new ArrayList<Sabonete>();
				
				listaDeSabonete.add(sabonete1);
				listaDeSabonete.add(sabonete2);
				listaDeSabonete.add(sabonete3);
				
				try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
					for(Sabonete sabonete : listaDeSabonete)
						escrever.write(sabonete.toString());
				
				String s  = " texto para ser gravado no arquivo";
				
				try(BufferedWriter write = new  BufferedWriter (new  FileWriter("saida.txt"))){
					escrever.write (s);
				}

				
				
			
				}
			}
		}
		

		
	


