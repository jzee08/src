
public class arrayTest {

	public static void main(String[] args) {
		
		int i = 0;	//index of myArray row
		int j = 0;	// index of the column
		int[][] myArray = new int [100][3];
		
		
		//System.out.print(myArray[i][j]);
		//System.out.print(myArray[0][1]);
		//myArray[2][0] = "roll";
		//myArray[2][1] = "the dice";
		
		
		for (i = 0; i < myArray.length; i++) {
			StringBuilder arrayOutput = new StringBuilder();
			
			for (j = 0; j < myArray[i].length; j++) {
				myArray[i][j] = (int)((Math.random()*6)+1);
				if (j == 0) {
					arrayOutput.append("Roll #" + i + " Dice one rollded a ");
				}
				else {
					arrayOutput.append(" dice two rolled a ");
				}
				arrayOutput.append(myArray[i][j]);
				
			} // end of the j array
			
			System.out.println(arrayOutput);
			
		} // end of the i array
		
	} // end of main method
	
} // end of class