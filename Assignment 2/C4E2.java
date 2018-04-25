import java.util.Scanner;

public class C4E2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program allows users to enter two coordinates in degrees and caculate the Great Circle Distance between the two");
	
		System.out.println("Enter point 1 (latitude and longitude) in degrees, please do not include commas between two numbers: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees, please do not include commas between two numbers: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		input.close();
		
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		
		double d = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("The distance between the two points is "+d+ " km");
	}
}
