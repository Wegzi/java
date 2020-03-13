package exercicio1;

public abstract class Poligono extends Figura  {
	public double base = 0;
	public double altura = 0;

	@Override
	public double calcArea() {
		return base * altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
