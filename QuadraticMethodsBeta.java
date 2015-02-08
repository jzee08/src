/**
 * A simple program that calculates the discriminate of a quadratic equation.
 * By looking at the discriminate we can find some information about what the
 * various types of solutions might be.
 * 
 * @author Joe Phinazee
 *
 */
public class QuadraticMethodsBeta {

	public static void main(String[] args) {
		double userInput[];
		double discriminate;

		System.out.println(); // prints a blanks plane at the top of the program
		
		// calls the getUserInput method to acquire the three terms used in finding the discriminate
		userInput = getUserInput();

		
		discriminate = getDiscriminate(userInput[0], userInput[1], userInput[2]);
		System.out.println("The discriminate is: " + discriminate);

		//These if statements will determine what types of roots the solution will have
		if (discriminate < 0){
			System.out.println("Two zeros that are comlpex conjugates exist");
		}
		else if (discriminate == 0){
			System.out.println("one real zero of multiplicity two exists");
		}
		else if (discriminate > 0){
			if (isSquare(discriminate)){
				System.out.println("The discriminate > 0 and a perfect square, then the solutions are rational and different");
			}
			else {
				System.out.println("then the solutions are irrational and different");
			} // end else
		} // end if
		else if (isSquare(discriminate)){
			System.out.println("The value of isSquare is: " + isSquare(discriminate));
		}
		System.out.println("The value of isSquare is: " + isSquare(discriminate));

		System.out.println("Your calculation has completed succesfully!");
	} // end of main method

	
	/** Gets three terms in the form of Ax^2+Bx+C from the user and passes the value back to
	 * to the main method and into the variable userInput.
	 * @return
	 */
	public static double[] getUserInput(){

		// declare the variables to be used for this method
		double array[] = new double [3]; // Declare and initialize an array that can hold 3 elements
		char ch = 'A'; // Identify each term of the equation to the standard form for input


		// Allow the user to add each element or term to the array
		for (int i = 0; i < array.length; i++) {

			System.out.print("Enter a number for the " + "'" + ch + "'" + " term: ");
			array [i] = TextIO.getDouble();
			while (array[i] == 0){
				System.out.print("Please re-enter a number not equal to zero: ");
				array [i] = TextIO.getDouble();
			}
			ch++;
		} // finished adding the 3 terms to the array

		// Print the value of each element in the array back the user
		for (int j = 0; j < array.length; j++) {
			if (j == 0) { // begin if (i == 0)
				ch = 'A';
				System.out.print("\nThe terms you entered are: ");
			} // end if (i == 0)
			System.out.print(ch + " = " + array[j] + ",  ");
			ch++;
		}

		System.out.println("\n\nuserInput method ran successfully\n");
		return(array);
	} // end of sayHello method

	
	/**
	 * Calculates the discriminate "d = (b^2-4ac)" of a quadratic equation with the terms
	 * passed from the variable "userInput[]" in the main method.
	 * @param a The first term of the equation.
	 * @param b The second term of the equation.
	 * @param c The third term of the equation.
	 * @return The discriminate of the quadratic back to the main method
	 * into the variable "discriminate"
	 */
	public static double getDiscriminate(double a, double b, double c){
		double d;
		b = Math.pow(b, 2);
		d = (b-(4*a*c));
		
		System.out.println("The get Discriminate method has completed successfully");
		return(d);
	} // end of getDiscriminate method
	
	
	 
	/** Used to determine if the discriminate is a perfect square
	 * @param x
	 * @return true or false as boolean
	 */
	public static boolean isSquare(double x){
		return Math.sqrt((double)x) % 1d == 0d;
	} // end of isSquare method
	
	
} // end of QuadraticMethodsBeta class
