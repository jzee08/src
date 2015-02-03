/**
 * 
 */

/**
 * @author hombregigante
 *
 */
public class RollTheDiceBeta {

	public static void main(String[] args) {


		int i;				// The index of diceArray
		int[] diceArray; 	// Declare the type of array for dice 1
		int numberRolls;	// The number of rolls input by the user
		int one = 0;		// used to count the number of times
		int two = 0;		// that each face as it hits
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int streakStart = 0;	// Records the start of the run
		int currentStreak = 1;	// Records the current run
		int maxStreak = 0;		// The holds the largest streak as the array iterates

		// Allows user to allocate the size of the array
		System.out.print("\nPlease enter the number of times you would like to roll the dice: ");
		numberRolls = TextIO.getInt();
		// numberRolls = Math.abs(numberRolls); This is one way to do it

		// This while statement limits the users input to a positive number
		while (numberRolls<0){
			System.out.print("Input cannot be a negative\nPlease enter a positive number: ");
			numberRolls = TextIO.getInt();
		} // end of while statement

		// This is an assignment statement that sets the size of the array
		// to the size of rolls the user inputs
		diceArray = new int[numberRolls];
		
		// This loops through each index of the array and generates a pseudo random number
		// to simulate a dice roll
		for (i = 0; (i < diceArray.length); i++ ){
			// calculate the value for each die
			diceArray[i]=(int)((Math.random()*6)+1);
			
			// If you want to mute the output of each roll just add a comment in
			// front of the next two lines
			System.out.printf("Roll #" + i + "  face of the die is " + diceArray[i]);
			System.out.println();
			
			// These if statements count the number of times each number appears on the face of the die
			if (diceArray[i] == 1){
				one = one + 1;
			}
			if (diceArray[i] == 2){
				two = two + 1;
			}
			if (diceArray[i] == 3){
				three = three + 1;
			}
			if (diceArray[i] == 4){
				four = four + 1;
			}
			if (diceArray[i] == 5){
				five = five + 1;
			}
			if (diceArray[i] == 6){
				six = six + 1;
			}
			
		    // This is compares the current record to the previous record 
			// in the array in order to count the run and longest streak
			
			if (i != 0){
			if (diceArray[i] == diceArray[i-1]) { // never compare a boolean with a boolean constant, just use it
		        currentStreak++; // use ++ in preference to +=1, and this should be before maxRun test
		        if (maxStreak < currentStreak) {
		            maxStreak = currentStreak;
		            streakStart = (i-1); // this will produce a 1-based position
		        } // end of if
		    } else { // sets current run back to zero in order to count the next run
		        currentStreak = 0;
		    } // end of else
			}
		}// end of for loop
		
		// Print the final results back to the user
		// I used (i-1) because the for loop adds one to i each time it loops
		// and the last roll adds 1 to the index but doesn't create a value for diceArray[i]
		// a workaround for this would be to use the while statement that adds i++ at the end of the loop
		System.out.println("\nindex is at position " + (i-1) + " and the face of the die is " + diceArray[i-1]);
		System.out.println("\nThe break down of each dice and the precentage the face of the die came up:");
		System.out.printf("                              1's = " + one + " -- which is " + "%3.1f", ((double)one/(double)(numberRolls)*100));
		System.out.println("% of the total rolls");
		System.out.printf("                              2's = " + two + " -- which is " + "%3.1f", ((double)two/(double)(numberRolls)*100));
		System.out.println("% of the total rolls");
		System.out.printf("                              3's = " + three + " -- which is " + "%3.1f", ((double)three/(double)(numberRolls)*100));
		System.out.println("% of the total rolls");
		System.out.printf("                              4's = " + four + " -- which is " + "%3.1f", ((double)four/(double)(numberRolls)*100));
		System.out.println("% of the total rolls");
		System.out.printf("                              5's = " + five + " -- which is " + "%3.1f", ((double)five/(double)(numberRolls)*100));
		System.out.println("% of the total rolls");
		System.out.printf("                              6's = " + six + " -- which is " + "%3.1f", ((double)six/(double)(numberRolls)*100));
		System.out.println("% of the total rolls");

		
		System.out.println("The streak data!");
		
		System.out.println("The longest streak was a streak of " + maxStreak);
		System.out.println("The longest streak was a streak of " + diceArray[streakStart] + "'s and it started at roll " + streakStart);
		// I always put this at the end of every program
		System.out.println("\n\n\nThe program has completed successfully");
	}

}
