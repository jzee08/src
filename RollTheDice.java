	import java.util.Random;
public class RollTheDice {

	public static void main(String[] args) {
		// Dice Rolling
		    {
		        Random randomNumbers = new Random(); // Generates random numbers
		        int[] array = new int[ 13 ]; // Declares the array
		        int[] singleArray = new int[13];
		        int dice1;
		        int dice2;
		        int dice3;
		        int total;
		         
		        //Roll the die 36,000 times
		        for ( int roll = 1; roll <=36000; roll++ )
		        {
		            dice1 = 1 + randomNumbers.nextInt ( 6 );
		            dice2 = 1 + randomNumbers.nextInt ( 6 );
		            dice3 = 2 + randomNumbers.nextInt ( 11 );
		            total = dice1 + dice2;
		            ++array[total];
		            ++singleArray[dice3];
		        }
		             
		        System.out.printf( "%s%16s%15s\n", "Face", "Frequency 1", "Frequency 2" );
		         
		        // outputs array values
		        for ( int face = 1; face < array.length; face++ )
		            System.out.printf( "%3d%13d%15d\n", face, array[ face ], singleArray[face] );
		         
		    } // end main
		     
		} // end class DiceRolling
	}


