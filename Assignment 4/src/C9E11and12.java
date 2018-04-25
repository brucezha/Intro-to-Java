/*(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a 2 * 2 system of linear equations:
ax+by=e x= ed-bf y= af-ec cx + dy = f ad - bc ad - bc
The class contains:
■ Private data fields a, b, c, d, e, and f.
■ A constructor with the arguments for a, b, c, d, e, and f.
■ Six getter methods for a, b, c, d, e, and f.
■ A method named isSolvable() that returns true if ad - bc is not 0.
■ Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. 
Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
If ad - bc is 0, report that “The equation has no solution.” See Programming Exercise 3.3 for sample runs.

**9.12 (Geometry: intersecting point) Suppose two line segments intersect. 
*The two end- points for the first line segment are (x1, y1) and (x2, y2) 
*and for the second line segment are (x3, y3) and (x4, y4). 
*Write a program that prompts the user to enter these four endpoints and displays the intersecting point. 
*As discussed in Program- ming Exercise 3.25, the intersecting point can be found by solving a linear equation. 
*Use the LinearEquation class in Programming Exercise 9.11 to solve this equation. 
*See Programming Exercise 3.25 for sample runs. 
 */

//This is a test program for 9.11
import java.util.Scanner;

public class C9E11and12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//prompts the user to enter a, b, c, d, e, and f and displays the result.
		System.out.println("Please enter value for a, b, c, d, e, and f");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
				
		LinearEquation LE = new LinearEquation(a,b,c,d,e,f);
		
		if(LE.isSolvable()) {
			System.out.println("X is "+ LE.getX() +", Y is " + LE.getY());
		}
		else System.out.println("The equation has no solution.");
		
		System.out.println("\nNow please enter four endpoints for the two line segments as (x1, y1), (x2, y2) and (x3, y3), (x4, y4)");
		System.out.print("x1: ");
		double x1 = input.nextDouble();
		System.out.print("y1: ");
		double y1 = input.nextDouble();
		System.out.print("x2: ");
		double x2 = input.nextDouble();
		System.out.print("y2: ");
		double y2 = input.nextDouble();
		System.out.print("x3: ");
		double x3 = input.nextDouble();
		System.out.print("y3: ");
		double y3 = input.nextDouble();
		System.out.print("x4: ");
		double x4 = input.nextDouble();
		System.out.print("y4: ");
		double y4 = input.nextDouble();
		input.close();
		
		double p1 = y1-y2;
		double p2 = x2 - x1;
		double p3 = y3 - y4;
		double p4 = x4 - x3;
		double p5 = p1 * x1 + p2 * y1;
		double p6 = p3 * x3 + p4 * y3;
		LinearEquation LE1 = new LinearEquation(p1,p2,p3,p4,p5,p6);

		System.out.println("The intersecting point is ("+ LE1.getX()+", "+ LE1.getY()+")");;
		
	}

}
