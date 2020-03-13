package exercicio1;

public class Quadrado extends Poligono implements Diagonal {

	@Override
	public double calcArea() {
		return Math.pow(altura, 2);
	}

	@Override
	public double calcPerimetro() {
		return altura + altura + altura + altura;
	}

	@Override
	public double calcularDiagonal() {
		return getBase() * Math.sqrt(2);
	}
}
