/**
 * 
 */

/**
 * @author hombregigante
 *
 */
public class RollTheDiceBeta {

	public static void main(String[] args) {


		int i;				// The index of both diceArray1 and diceArray2
		int[] diceArray1; 	// Declare the type of array for dice 1
		int[] diceArray2;	// Declare the type of array for dice 2
		int numberRolls;	// The number of rolls input by the user		
		int two = 0;		// Used to count the number of times each total of the roll of die hits
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;
		int streakStart = 0;	// Records the starting index position of the run
		int currentStreak = 1;	// Records the current run
		int maxStreak = 0;		// The holds the largest streak as the array iterates
		
		System.out.println("Welcome to Roll Those Dice");
		System.out.println("By Joe Phinazee");
		System.out.println("Credit to Carl Argabright");
		// Allows user to choose the size of the array
		System.out.print("\nPlease enter the number of times you would like to roll the dice: ");
		numberRolls = TextIO.getInt();
		// numberRolls = Math.abs(numberRolls); This is another way to guarantee the input is positive

		// This while statement limits the users input to a positive number
		while (numberRolls<0){
			System.out.print("Input cannot be a negative\nPlease enter a positive number: ");
			numberRolls = TextIO.getInt();
		} // end of while statement

		// This is an assignment statement that sets the size of the array
		// to the size of rolls the user inputs
		diceArray1 = new int[numberRolls];
		diceArray2 = new int[numberRolls];
		// This loops through each index of the array and generates a pseudo random number
		// to simulate a dice roll
		for (i = 0; (i < diceArray1.length); i++ ){
			// calculate the value for each die
			diceArray1[i]=(int)((Math.random()*6)+1);
			diceArray2[i]=(int)((Math.random()*6)+1);

			// If you want to mute the output of each roll just
			// add a comment in front of the next two lines
			System.out.printf("Roll #" + i + "  dice1 = " + diceArray1[i] + "  dice2 = " + diceArray2[i] + " Sum = " + (diceArray1[i]+diceArray2[i]));
			System.out.println();

			// These if statements count the number of times each number appears on the face of the die
			if (diceArray1[i] + diceArray2[i] == 2){
				two = two + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 3){
				three = three + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 4){
				four = four + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 5){
				five = five + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 6){
				six = six + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 7){
				seven = seven + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 8){
				eight = eight + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 9){
				nine = nine + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 10){
				ten = ten + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 11){
				eleven = eleven + 1;
			}
			if (diceArray1[i] + diceArray2[i] == 12){
				twelve = twelve + 1;
			}

			// This compares the current record to the previous record 
			// in the array in order to count the run and longest streak

			if (i != 0){
				if ((diceArray1[i]+diceArray2[i]) == (diceArray1[i-1]+diceArray2[i-1])) { // never compare a boolean with a boolean constant, just use it
					currentStreak++; // use ++ in preference to +=1, and this should be before maxRun test
					if (maxStreak < currentStreak) {
						maxStreak = currentStreak;
						streakStart = (i-currentStreak + 1); // this will produces the position for the start of the streak
					} // end of if
				} else { // sets current run back to zero in order to count the next run
					currentStreak = 1;
				} // end of else
			}
		}// end of for loop

		// Print the final results back to the user
		// I used (i-1) because the for loop adds one to i each time it loops
		// and the last roll adds 1 to the index but doesn't create a value for diceArray[i]
		// a workaround for this would be to use the while statement that adds i++ at the end of the loop
		
			//System.out.println("\nindex is at position " + (i-1) + " and the face of the die is " + diceArray1[i-1]);
			System.out.println("\nThe break down of each dice and the precentage the face of the die came up:");
		if (!(two == 0)) {
			System.out.printf("                               2's = " + two + " -- which is " + "%3.1f", ((double)two/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(three == 0)) {
			System.out.printf("                               3's = " + three + " -- which is " + "%3.1f", ((double)three/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(four == 0)) {
			System.out.printf("                               4's = " + four + " -- which is " + "%3.1f", ((double)four/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(five == 0)) {
			System.out.printf("                               5's = " + five + " -- which is " + "%3.1f", ((double)five/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(six == 0)) {
			System.out.printf("                               6's = " + six + " -- which is " + "%3.1f", ((double)six/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(seven == 0)) {
			System.out.printf("                               7's = " + seven + " -- which is " + "%3.1f", ((double)seven/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(eight == 0)) {
			System.out.printf("                               8's = " + eight + " -- which is " + "%3.1f", ((double)eight/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(nine == 0)) {
			System.out.printf("                               9's = " + nine + " -- which is " + "%3.1f", ((double)nine/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(ten == 0)) {
			System.out.printf("                              10's = " + ten + " -- which is " + "%3.1f", ((double)ten/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(eleven == 0)) {
			System.out.printf("                              11's = " + eleven + " -- which is " + "%3.1f", ((double)eleven/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}
		if (!(twelve == 0)) {
			System.out.printf("                              12's = " + twelve + " -- which is " + "%3.1f", ((double)twelve/(double)(numberRolls)*100));
			System.out.println("% of the total rolls");
		}

		System.out.println("The streak data!");
		System.out.println("The longest streak was a streak of " + maxStreak);
		System.out.println("The longest streak was a streak of " + (diceArray1[streakStart]+diceArray2[streakStart]) + "'s and it started at roll " + (streakStart));

		// I always put this at the end of every program
		System.out.println("\n\n\nThe program has completed successfully");

	} // end of main method()

} // end of RollThoseDice public class
