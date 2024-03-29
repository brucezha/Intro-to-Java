//(The Rectangle class) Following the example of the Circle class in Section 9.2, design a class named Rectangle to represent a rectangle. The class contains:
//■ Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
//■ A no-arg constructor that creates a default rectangle.
//■ A constructor that creates a rectangle with the specified width and height.
//■ A method named getArea() that returns the area of this rectangle.
//■ A method named getPerimeter() that returns the perimeter.
//Draw the UML diagram for the class and then implement the class. Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.

//This is the test program that creates two Rectangle objects—one with width 4 and height 40 
//and the other with width 3.5 and height 35.9. 
//It will display the width, height, area, and perimeter of each rectangle in this order.

public class C9E1 {

	public static void main(String[] args) {
		//creates two Rectangle objects—one with width 4 and height 40 
		Rectangle rectangle1 = new Rectangle(4,40);
		
		//and the other with width 3.5 and height 35.9. 
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		
		//display the width
		System.out.println("The width of the first rectangle is " + rectangle1.width);
		
		//display the height
		System.out.println("The height of the first rectangle is " + rectangle1.height);
		
		//display the area
		System.out.println("The area of the first rectangle is " + rectangle1.getArea());		

		//display the perimeter
		System.out.println("The perimeter of the first rectangle is " + rectangle1.getPerimeter());
		
		//display the width
		System.out.println("\nThe width of the second rectangle is " + rectangle2.width);
				
		//display the height
		System.out.println("The height of the second rectangle is " + rectangle2.height);
				
		//display the area
		System.out.println("The area of the second rectangle is " + rectangle2.getArea());		

		//display the perimeter
		System.out.println("The perimeter of the second rectangle is " + rectangle2.getPerimeter());
	}

}
