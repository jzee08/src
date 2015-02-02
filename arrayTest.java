
public class arrayTest {

	public static void main(String[] args) {
		
		int i;	//index of myArray
		
		double[] myArray = new double [4];
		
		for (i = 0; (i < myArray.length); i++ ){
			
			myArray[i] = 10;
			System.out.println(myArray[i] + " ");
			System.out.println("i = " + i);
		} // end of for loop
		
		// Summing all elements
	      double total = 0;
	      for (i = 0; i < myArray.length; i++) {
	         total += myArray[i];         
	      } // end of for loop
	      System.out.println("The total is " + total);
	
	   // Finding the largest element
	      double max = myArray[0];
	      for (i = 1; i < myArray.length; i++) {
	         if (myArray[i] > max) max = myArray[i];
	      }
	      System.out.println("Max is " + max);
	      
	
	}// end of main class
}
