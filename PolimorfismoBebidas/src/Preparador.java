
public class Preparador {

	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a bebida " + bebida.getNome());
		
		//preparar bebida//
		bebida.preparar();
	
		if(bebida.getAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
	
		System.out.println("Bebida preparada com sucesso! \n");
	}
}
