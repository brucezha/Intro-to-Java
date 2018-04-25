import java.util.Scanner;

public class C2E19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points for a triangle: ");
		double x1= input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		input.close();
		
		double side1 =  Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1), 0.5);
		double side2 =  Math.pow((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2), 0.5);
		double side3 =  Math.pow((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3), 0.5);
		double s = (side1 + side2 + side3)/2;
		double area = Math.pow(s*(s - side1)*(s - side2)*(s - side3), 0.5);
		
		System.out.println("The area of the triangle is "+area);
	}

}