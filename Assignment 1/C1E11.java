
public class C1E11 {
	public static void main(String[] args) {
		int population = 312032486;
		System.out.println("Current population is "+population);
		int year = 365*24*60*60;
		for (int i=1; i<=5; i++) {
		population = population + (year/7 - year/13 + year/45);
		System.out.println("The population of next "+ i + " year is "+population );
		}
	}
}
