package modelos;

public class Rectangulo extends Figura{
	/**
	 * @version 1.0
	 * 
	 * @author Juanlu
	 */

	/**
	 * @return
	 */
	
	private double base;
	private double altura;
	
	/**
	 * @see modelos.Figura#area()
	 */

	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param base
	 * @param altura
	 * @return
	 */
	
	public double area() {
		return base*altura;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*base*altura;
	}

}
