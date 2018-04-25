//a single program to have the user enter the 10 numbers only once. 
//get the minimum and its index, report it, then the sort the list and show it.

public class C7E9E10E20 {
	public static void main(String[] args) {
	    double[] arr = new double[10];
	    
	    java.util.Scanner input = new java.util.Scanner(System.in);
	    System.out.print("Please enter ten numbers: ");

	    for (int i = 0; i < arr.length; i++) 
	      arr[i] = input.nextDouble();
		  
	    input.close();

	    //finding the minimum value and its index
	    double min = arr[0];
	    int minIndex = 0;

	    for (int i = 1; i < arr.length; i++)
	      if (min > arr[i]) {
	        min = arr[i];
	        minIndex = i;
	      }
	    
	    System.out.println("The minimum value is " +  min);
	    
	    System.out.println("The index of the minimum value is " + minIndex);
	    
	    sortList(arr);
	    System.out.print("The sorted list is: ");
	    for (int i = 0; i < arr.length; i++)
		      System.out.print(arr[i] + "  ");
	  }

	//sorting the list
	static void sortList(double[] list) {
	    double currentMin;
	    int currentMinIndex;

	    for (int i = 0; i < list.length-1; i++) {
	          // Find the minimum in the list[i..list.length-1]
	    	  currentMin = list[i];
	      currentMinIndex = i;

	      for (int j = i + 1; j < list.length; j++) {
	        if (currentMin > list[j]) {
	          currentMin = list[j];
	          currentMinIndex = j;
	        }
	      }

	      // Swap list[i] with list[currentMinIndex] if necessary;
	      if (currentMinIndex != i) {
	        list[currentMinIndex] = list[i];
	        list[i] = currentMin;
	      }
	    }
	  }
}