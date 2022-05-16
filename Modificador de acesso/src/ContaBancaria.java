
public class ContaBancaria {

        private int numConta; 
        private boolean ativo; 
        private double saldo; 
        
        
        
       public void name(double valor) {
    	   saldo += valor; 
}
       
       public double  saldo () {
    	   return saldo; 
    	       	   
}
       public void dar(double valor) {
    	   if (saldo >= valor) 
    	 saldo = valor;   
    	   
}

	public void receber(double d) {
		// TODO Auto-generated method stub
		
	}
       
                          }
