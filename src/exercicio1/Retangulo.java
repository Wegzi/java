package exercicio1;

public class Retangulo extends Poligono implements Diagonal{

	@Override
	public double calcArea() {
		return getBase() * getAltura();
	}

	@Override
	public double calcPerimetro() {
		return 2 * getBase() + 2 * getAltura();

	}
	 @Override
	    public double calcularDiagonal() {
	        return 
	        
	            Math.sqrt( 
	                Math.pow(getBase(), 2) 
	                +
	                Math.pow(getAltura(), 2)
	            );
	    }
}
