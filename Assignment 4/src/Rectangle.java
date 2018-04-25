// This is a class named Rectangle to represent a rectangle.
// It contains
//■ Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
//■ A no-arg constructor that creates a default rectangle.
//■ A constructor that creates a rectangle with the specified width and height.
//■ A method named getArea() that returns the area of this rectangle.
//■ A method named getPerimeter() that returns the perimeter.
//It will also catch exceptions if there is any


public class Rectangle {
//Two double data fields named width and height that specify the width and height of the rectangle.	
	double width;
	double height;

//A no-arg constructor that creates a default rectangle.	
	Rectangle(){
		width = 1;
		height = 1;
	}
	
// A constructor that creates a rectangle with the specified width and height.
	Rectangle(double newWidth, double newHeight){
		if(newWidth <= 0) throw new IllegalArgumentException(newWidth + " entered is not valid, it needs to be a postive number!");
		else width = newWidth;
		
		if (newHeight <= 0) throw new IllegalArgumentException(newHeight + " entered is not valid, it needs to be a postive number!");
		else height = newHeight;
	}
	
// A method named getArea() that returns the area of this rectangle.
	double getArea() {
		return width * height;
	}
	
// A method named getPerimeter() that returns the perimeter.
	double getPerimeter() {
		return 2 * (width + height);
	}
}
