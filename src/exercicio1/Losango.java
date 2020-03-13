package exercicio1;

public class Losango extends Poligono {


	@Override
	public double calcArea() {
		return getBase() * getAltura();
	}

	@Override
	public double calcPerimetro() {
		 return 4 * getBase();

	}

}
