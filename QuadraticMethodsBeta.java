import java.text.DecimalFormat;

/**
 * A simple program that calculates the discriminate of a quadratic equation.
 * By looking at the discriminate we can find some information about what the
 * various types of solutions might be.
 * 
 * @author Joe Phinazee
 *
 */
public class QuadraticMethodsBeta {

	public static DecimalFormat df = new DecimalFormat("#.###");
	public static double[] userInput;
	public static double discriminate;

	public static void main(String[] args) {
		boolean playAgain = true;

		while (playAgain){
			System.out.println(); // prints a blanks plane at the top of the program

			// calls the getUserInput method to acquire the three terms used in finding the discriminate
			// and prints the values entered back to the user for confirmation
			userInput = getUserInput();

			// calls the getDiscriminate method and displays the result back to the user
			discriminate = getDiscriminate(userInput[0], userInput[1], userInput[2]);
			System.out.println("The discriminate is: " + discriminate + "\n");

			//These if statements will determine what types of roots the solution will have
			if (discriminate < 0){
				System.out.println("Two zeros that are comlpex conjugates exist");
				isComplexPrint();

			}
			else if (discriminate == 0){
				System.out.println("Since the discriminate is equal to zero only one real root exists "
						+ "and has a multiplictiy two");
				isDoubleRootPrint();

			}
			else if (discriminate > 0){
				if (isSquare(discriminate)){
					System.out.println("Since the discriminate is > 0 and a perfect square, the "
							+ "solutions are rational and different\n");
					isUnequalPrint();
				}
				else {
					System.out.println("Since the discriminate is > 0 and not a perfect square the "
							+ "solutions are irrational and different\n");
				} // end else
			} // end if

			System.out.println("\n\nYour calculation has completed succesfully!");

			System.out.print("\n\nDo you want to make another calculation? 'YES' or 'NO': ");
			playAgain = TextIO.getBoolean();
		} // End of while loop

		System.out.println("Thank you, have a nice day!");
	} // end of main method


	// Method one
	/** Gets three terms in the form of Ax^2+Bx+C from the user and passes the value back to
	 * to the main method and into the variable userInput.
	 * @return type array with 3 elements A,B,C
	 */
	public static double[] getUserInput(){

		// declare the variables to be used for this method
		double array[] = new double [3]; // Declare and initialize an array that can hold 3 elements
		char ch = 'A'; // Identify each term of the equation to the standard form for input

		// Allow the user to add each element or term to the array
		for (int i = 0; i < array.length; i++) {

			System.out.print("Enter a number for the " + "'" + ch + "'" + " term: ");
			array [i] = TextIO.getDouble();
			while (array[i] == 0){ // restricts input of the A term so that it cannot be equal to zero
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
		return(array);
	} // end of getUserInput method


	// Method two
	/**
	 * Calculates the discriminate "d = (b^2-4ac)" of a quadratic equation with the terms
	 * passed from the variable "userInput[]" in the main method.
	 * @param a The first term of the equation.
	 * @param b The second term of the equation.
	 * @param c The third term of the equation.
	 * @return The discriminate of the quadratic in type double back to the main method
	 * into the variable "discriminate"
	 */
	public static double getDiscriminate(double a, double b, double c){
		Double d;
		b = Math.pow(b, 2);
		d = (b-(4*a*c));
		return(d);
	} // end of getDiscriminate method


	// Method three
	/**
	 * The isUnequal method solves the quadratic equation while the discriminate is a positive
	 * number and not a perfect square in order to handle unequal roots.
	 * @return an array with the two zeros as an array of 2 elements
	 */
	public static double[] isUnequal(){
		double[] x = new double[2];
		// stores the zeros into an array of two elements
		x[0] = (Double)(((-1*userInput[1]) + (Math.sqrt(discriminate)))/(2*userInput[0]));
		x[1] = (Double)(((-1*userInput[1]) - (Math.sqrt(discriminate)))/(2*userInput[0]));

		return(x); // returns back to where method was called
	}


	// Method four
	/**
	 * isUnequalPrint method uses the isUnequal method to return the value of
	 * the two unequal zeros back to the standard output for the user to verify the result
	 * @return 
	 */
	public static void isUnequalPrint(){

		double x[] = new double [2];
		x = isUnequal();
		System.out.print("The solution is two distinct real numbers: x = " + x[0] + " and x = " + x[1] + "\n");
	}


	// Method five
	/**
	 * isComplex is a method that deals with the quadratic equation when the discriminate is less
	 * than zero.
	 * @return returns x in the form of an array with two elements 
	 * representing the real and imaginary parts of the solution.
	 */
	public static double[] isComplex(){
		double[] x = new double [2];
		x[0] = -userInput[1]/(2*userInput[0]);
		x[1] = Math.sqrt(Math.abs(discriminate))/(2*userInput[0]);
		return(x);
	}

	// Method six
	/**
	 * isComplexPrint is a method that prints the result of a quadratic equation
	 * when complex conjugates exist.
	 * @return void
	 */
	public static void isComplexPrint(){
		double[] x = isComplex();
		System.out.print("The solutions are x = "+ df.format(x[0])+ " + " + df.format(x[1]) + "i");
		System.out.println(" and x = "+ df.format(x[0])+ " - " + df.format(x[1]) + "i");


	} // end isComplexPrint method

	// Method seven
	/**
	 * When the root is doubled the value of the quadratic looks like (x-6)(x-6)=0
	 * The doubled root is found when the discriminate is a perfect square trinomial
	 * This method solves for the discriminate and checks to see if it is a perfect square
	 * @return one real number of type double back to the method where it was called
	 */
	public static double isDoubleRoot(){
		double x;	
		x = (-1*(userInput[1]))/(2*userInput[0]);
		return(x); // returns type double back to the method where it was called
	} // end isDoubleRoot method


	// Method eight
	/**
	 * The isDoubledRootPrint method returns the value of the method isDoubleRoot back to the
	 * Standard output
	 *
	 */
	public static void isDoubleRootPrint(){
		double x = isDoubleRoot();
		System.out.println("\nThe solution is a doubled root where x = " + x);
	} //isDoubleRootPrint method

	/** Used to determine if the discriminate is a perfect square
	 * @param x
	 * @return true or false as boolean
	 */
	public static boolean isSquare(double x){
		return Math.sqrt((double)x) % 1d == 0d;
	} // end of isSquare method


} // end of QuadraticMethodsBeta class
