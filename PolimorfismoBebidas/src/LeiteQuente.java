
public class LeiteQuente extends Bebida{
//sub classe Bebida herda da super classe Bebida//
	
	public LeiteQuente() {
		
		super("Leite Quente", true);
		}

	@Override
	public void preparar() {
		
		super.preparar();
		System.out.println("Colocando o leite no copo");
	}
	

}
