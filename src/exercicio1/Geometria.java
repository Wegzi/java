package exercicio1;
import java.util.ArrayList;

public class Geometria {
	ArrayList<Figura> figura = new ArrayList<Figura>();
	
	Circulo circulo = new Circulo(0);
//	Losango losango = new Losango(0, 0);
//	Quadrado quadrado = new Quadrado(0, 0);
//	Retangulo retangulo = new Retangulo(0, 0);
//	Triangulo triangulo = new Triangulo(0, 0);
	
	public Geometria() {
		figura.forEach((n) -> System.out.println(n.calcArea()));	
	}
	 
}
