public class C4E3 {
	public static double getDistance(double lat1, double lat2,double long1,double long2) {

	lat1 = Math.toRadians(lat1);
	long1 = Math.toRadians(long1);
	lat2 = Math.toRadians(lat2);
	long2 = Math.toRadians(long2);

	return 6371.01 * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));
	
	}
	
	public static void main(String[] args) {
		System.out.println("This program will caculate the estimated area enclosed by Atlanta, Orlando, Savannah and Charlotte.\n");

		
		// Atlanta, Georgia
		double x1 =  33.7489954;
		double y1 = -84.3879824;
		System.out.println("The coordinate of Atlanta is ("+ x1 + ", "+ y1 +")");
		
		//Orlando, Florida
		double x2 = 28.5383355;
		double y2 = -81.37923649999999;
		System.out.println("The coordinate of Orlando is ("+ x2 + ", "+ y2 +")");

		
		//Savannah, Georgia
		double x3 = 32.0835407;
		double y3 = -81.09983419999998;
		System.out.println("The coordinate of Savannah is ("+ x3 + ", "+ y3 +")");

		
		//Charlotte, North Carolina
		double x4 = 35.2270869;
		double y4 = 	-80.84312669999997;
		System.out.println("The coordinate of Chartlotte is ("+ x4 + ", "+ y4 +")\n");

		double side1 = getDistance(x1, x2, y1, y2);
		System.out.println("Distance between Atlanta and Orlando is: "+side1+" km");
		
		double side2 = getDistance(x1, x3, y1, y3);
		System.out.println("Distance between Atlanta and Savannah is: "+side2+" km");
		
		double side3 = getDistance(x1, x4, y1, y4);
		System.out.println("Distance between Atlanta and Charlotte is: "+side3+" km");
		
		double side4 = getDistance(x2, x3, y2, y3);
		System.out.println("Distance between Orlando and Savannah is: "+side4+" km");
		
		double side5 = getDistance(x2, x4, y2, y4);
		System.out.println("Distance between Orlando and Charlotte is: "+side5+" km");
		
		double side6 = getDistance(x3, x4, y3, y4);
		System.out.println("Distance between Savannah and Charlotte is: "+side6+" km\n");

	//	Atlanta, Orlando, Savannah	
		double a1 = (side1 + side2+ side4)/2;
		double tri1 = Math.sqrt(a1*(a1-side1)*(a1-side2)*(a1-side4));
		System.out.println("The triangle formed by Atlanta, Orlando and Savannah is "+tri1+" km^2");
	
	//Atlanta, Savannah, Charlotte			
		double a2 = (side2 + side6+ side3)/2;
		double tri2 = Math.sqrt(a2*(a2-side2)*(a2-side3)*(a2-side6));
		System.out.println("The triangle formed by Atlanta, Orlando and Charlotte is " +tri2+" km^2\n" );

		double area = tri1+tri2;
	    System.out.println("The estimated area enclosed by these four cities is "+area+" km^2");
	}

}
