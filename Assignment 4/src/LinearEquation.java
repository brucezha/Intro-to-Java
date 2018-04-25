// This is a class named LinearEquation for a 2 * 2 system of linear equations:
//ax+by=e; cx+dy=f; x= ed-bf / ad-bc; y = af-ec / ad-bc
//The class contains:
//■ Private data fields a, b, c, d, e, and f.
//■ A constructor with the arguments for a, b, c, d, e, and f.
//■ Six getter methods for a, b, c, d, e, and f.
//■ A method named isSolvable() that returns true if ad - bc is not 0.
//■ Methods getX() and getY() that return the solution for the equation.


public class LinearEquation {
	//■ Private data fields a, b, c, d, e, and f.
	private double a,b,c,d,e,f;
	
	//■ A constructor with the arguments for a, b, c, d, e, and f.
	LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	//■ Six getter methods for a, b, c, d, e, and f.
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	//■ A method named isSolvable() that returns true if ad - bc is not 0.
	public boolean isSolvable() {
		return a*d-b*c != 0;
	}
	
	//■ Methods getX() and getY() that return the solution for the equation.
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}
	
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
	
}
