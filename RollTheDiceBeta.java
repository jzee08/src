/**
 * 
 */

/**
 * @author hombregigante
 *
 */
public class RollTheDiceBeta {
	
		public static void main(String[] args) {
			
			
			int die1;			// The array die1
			int die2;			// The array die2
			int[] diceArray1; 	// Declare the array for dice 1
			int[] diceArray2;	// Declare the array for dice 2
			//int diceResults;	// Results of each roll
			int numberRolls;	// The number of rolls input by the user
			int sumOfRoll;
			
			// Allow user to allocate the size of the array
			System.out.print("\nPlease enter the number of times you would like to roll the dice: ");
			numberRolls = TextIO.getInt();
			// numberRolls = Math.abs(numberRolls); This is one way to do it
			while (numberRolls<0){
				System.out.print("Input cannot be a negative\nPlease enter a positive number: ");
				numberRolls = TextIO.getInt();
			}
			
			
			diceArray1 = new int[numberRolls];
			diceArray2 = new int[numberRolls];
			
			
			for (die1 = 0, die2 = 0; (die1 < numberRolls && die2 < numberRolls); die1++, die2++){
				// calculate the value for each die
				diceArray1[die1]=(int)((Math.random()*6)+1);
				diceArray2[die2]=(int)((Math.random()*6)+1);
				sumOfRoll = (diceArray1[die1]+diceArray2[die2]);
				System.out.printf("Roll #" + die1 + "  | Dice1 = " + diceArray1[die1] + " | "
				+ "Dice2 = " + diceArray2[die2] + " The sum of the two dice is " + sumOfRoll);
				System.out.println();
			}// end of for loop
			
			System.out.println("value of die1 " + die1);
			
			
			System.out.println("\n\n\nThe program has completed successfully");
	}

}
