package exercicio1;

public class Circulo extends Figura {
	public double raio = 0;

	public Circulo(double r) {
		raio = r;
	}

	@Override
	public double calcArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double calcPerimetro() {
		return 2 * Math.PI * raio;
	}

}
