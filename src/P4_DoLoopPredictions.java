/*
	ISYS 320
	Name(s): Derek Stone
	Date:    April-21-2018
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 â€œzero,â€� â€œinfinity,â€� and â€œunknownâ€� are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats: 10
 Expected output: 91
 (b)
 Repeats: Infinity
 Expected output: [---NEGATIVE 0 -1 -2 -3 ...... infinity----]
 (c)
 Repeats: Infinity
 Expected output: 250
 (d)
 [Found the output after comment the above block b & c]
 Repeats: 5
 Expected output: bbbbbabbbbb
   
 */

/*
 Was your prediction correct?
 Note : Get output after comment the code of block b & c 
 (a) Correct 
 (b) Correct
 (c) Correct
 (d) Correct output but after commenting code block b & c 

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		// a
		int x = 1;
		do {
		    System.out.print( x + " ");
		    x = x + 10;
		} while( x < 100 );
		
//		//b
		int max = 1;
		do {
		    System.out.println( "count down: " + max );
		    max--;
		} while( max < 10 );
//		
		//c
		int y = 250;
		do {
		    System.out.println( y );
		} while( y % 3 != 0 );
		
		//d
		String word = "a";
		do {
		    word = "b" + word + "b";
		} while( word.length() < 10 );
		System.out.println( word );
		
		System.out.println("ENDING LOOP TEST");

	}

}
