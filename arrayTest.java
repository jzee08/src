
public class arrayTest {

	public static void main(String[] args) {
		
		int i = 0;	//index of myArray row
		int j = 0;	// index of the column
<<<<<<< HEAD
		int[][] myArray = new int [100][2];
		//int numberRolls = 0;
=======
		int[][] myArray = new int [5][3];
>>>>>>> FETCH_HEAD
		
		
		//System.out.print("\nPlease enter the number of times you would like to roll the dice: ");
		//numberRolls = TextIO.getInt();
		System.out.print(myArray[i][j]);
		//System.out.print(myArray[0][1]);
		//myArray[2][0] = "roll";
		//myArray[2][1] = "the dice";
		
		
		for (i = 0; i < myArray.length; i++) {

			StringBuilder arrayOutput = new StringBuilder();
			

			myArray[0][0] = (int)((Math.random()*6)+1);

			for (j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = (int)((Math.random()*6)+1);
				if (j == 0) {
					arrayOutput.append("Roll #" + i + " Dice = ");
				}
				else {
					arrayOutput.append(" Dice 2 = ");
				}
				
			} // end of the j array
			
			System.out.println(arrayOutput);
			
		} // end of the i array
<<<<<<< HEAD
		//int total = 0;
		//System.out.println("testing a sum " + (total += myArray[i][j]));
=======
		int total = 0;
		System.out.println("testing a sum " + (myArray[i-1] == myArray[j-1]));
>>>>>>> FETCH_HEAD
		
	} // end of main method
	
} // end of class