//For prime number exercises 5.16/5.20/6.10 10th show
//	only the first 50, then
//	populate an array containing the prime numbers less than 1000, and
//	in a repeat loop ask the user to enter one number at a time to test if it is prime (if not show the factors) by searching the array.  Searching arrays is described in Chapter 7.

public class C5E16E20C6E10 {
	
	public static void main(String args[]) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("The first 50 primes numbers are");
		int i=0;
		int[] arr = new int[1000];
		
//Populate an array with prime numbers less than 1000
		for (int number =2;  number<1000; number++) {
			if(isPrime(number)) {
				arr[i] = number;
				i++;
				}
			}	
		
//Show the first 50 prime numbers with 8 of them in each row	
		for(int n=1; n<=50; n++) {
			if (n%8 == 0)
				System.out.println(arr[n]);
			else
				System.out.print(arr[n]+ " ");
		}
		
// In a repeat loop, check user input number				
		int repeat = 1;
		while(repeat != 0)
		{
		System.out.println("\nEnter a number between 1 and 1000 to check if it is a prime number");
		
		int value = input.nextInt();
		
		//Check edge cases
		if(value > 1000 || value < 0)
			System.out.println("Please enter a number that is within the range of 1 and 1000");
		else if(searchPrime(arr, value))
			System.out.println("The number entered is a prime number");
		else
		{
			System.out.println("The number entered is not a prime number, the smallest factors are ");
			showFactors(value);
		}
		
		//Prompt user to continue or exit
		System.out.print("\nEnter 0 to exit, or 1 to continue ");
		repeat = input.nextInt();
	}
	input.close();
	System.out.println("Have a good day!");
	}
	
//Prime number check
	public static boolean isPrime(int n) {
		for (int i=2; i <=n/2; i++) {
			if (n%i ==0) {
				return false;
			}
		}
		return true;
	}

//binary search for the prime number from the array list
	public static boolean searchPrime(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2; 
			if (key < list[mid])
					high = mid - 1;
			else if (key > list[mid])
				low = mid + 1; 
			else
					return true;
			}
		return false; // Not found
	}
	
//Show factors when input value is not a prime number	
	public static void showFactors(int num) {	
		int factor = 2;
		while (factor <= num) {
			if(num % factor == 0) {
				num = num / factor;
				System.out.print(factor+" ");
			}
			else {
				factor ++;
			}
		}
	}
}
