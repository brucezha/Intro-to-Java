import java.util.Scanner;

public class C3E27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program finds out wheteher the point user entered is in the right triangle that is formed by the points (0,0), (0,100) and (200,0)\n");
		System.out.println("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		input.close();

        if ((x > 200.0) || (x < 0.0) || (y > 100.0) || (y < 0.0)) {
            System.out.println("The point is not in the triangle");
        } else if ((0.5 * x + y <= 100.0)) {
                System.out.println("The point is in the triangle");
            } 
        			else {
                System.out.println("The point is not in the triangle");
            }
        
				
	}

}