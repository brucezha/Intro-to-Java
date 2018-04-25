/* (The Triangle class) Design a class named Triangle that extends                *
* GeometricObject. The class contains:                                           *
* ■ Three double data fields named side1, side2, and side3 with default          *
*   values 1.0 to denote three sides of the triangle.                            *
* ■ A no-arg constructor that creates a default triangle.                        *
* ■ A constructor that creates a triangle with the specified side1, side2, and   *
*   side3.                                                                       *
*                                                                                *
* ■ The accessor methods for all three data fields.                              *
* ■ A method named getArea() that returns the area of this triangle.             *
* ■ A method named getPerimeter() that returns the perimeter of this triangle.   *
* ■ A method named toString() that returns a string description for the triangle.*
*                                                                                *
* For the formula to compute the area of a triangle, see Programming Exercise    *
* 2.19. The toString() method is implemented as follows:                         *
*                                                                                *
* return "Triangle: side1 = " + side1 + " side2 = " + side2 +                    *
* " side3 = " + side3;                                                           *
*/            

import java.util.Scanner;

public class C11E1 {

	public static void main(String[] args) {
		System.out.println("This program is to define a Triangle class and a IllegalTriangleException class to display entered triangle area, perimeter, color, and whether it is filled or not, it would throw an exception sides violate triangle rule.");
		
		Scanner input = new Scanner(System.in);
		int repeat = 1;
		
		while (repeat == 1) {
			System.out.print("Enter three sides ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			System.out.print("What is the color? ");
			String color = input.next();
			System.out.print("Is the triangle filled? (true or false) ");
			boolean filled = input.nextBoolean();
			
			if (side1 > 0 && side2 > 0 && side3 > 0) {
				try {
					Triangle triangle = new Triangle(side1, side2, side3);
					triangle.setColor(color);
					triangle.setFilled(filled);
				    
					System.out.println(triangle);
					System.out.println("Area: " + triangle.getArea());
					System.out.println("Perimeter: " + triangle.getPerimeter());
					System.out.println("Color: " + triangle.getColor());
					System.out.println("Filled: " + triangle.isFilled());
				}
				
				catch (IllegalTriangleException e) {
					System.out.println("IllegalTriangleException: the sum of any two sides must be more than the third.");
				}
			}
			else {
				System.out.println("Each side must be positive.");
			}

			System.out.print("Do you want to repeat the program(1 for yes or 0 for no)?: ");
			repeat = input.nextInt();
		}
		input.close();
		System.out.println("Have a good day.");

	}

}

class IllegalTriangleException extends Exception {
	public IllegalTriangleException(String string) {
		super(string);
	}
}

class Triangle extends GeometricObject {
private double side1;
private double side2;
private double side3;

Triangle() throws IllegalTriangleException {
side1 = side2 = side3 = 1.0;
}

Triangle(double side1, double side2, double side3) throws IllegalTriangleException
 { 
	if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}
	else {
		throw new IllegalTriangleException("The sum of two sides should always be bigger than the other one");
	}

}

public double getSide1() {
return side1;
}

public double getSide2() {
return side2;
}

public double getSide3() {
return side3;
}

public double getArea() {
double s = (side1 + side2 + side3) / 2;
return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}

public double getPerimeter() {
return side1 + side2 + side3;
}

public String toString() {
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
	" side3 = " + side3;
}
}


class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;


	public GeometricObject() {
		dateCreated = new java.util.Date();
	}



	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isFilled() {
		return filled;
	}


	public void setFilled(boolean filled) {
		this.filled = filled;
	}


	public java.util.Date getDateCreated() {
		return dateCreated;
	}


	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + 
			" and filled: " + filled;
	}
}