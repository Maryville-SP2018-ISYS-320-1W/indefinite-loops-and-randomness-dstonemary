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
 Repeats: 9
 Expected output: 91
 (b)
 Repeats: 0
 Expected output: 
 (c)
 Repeats: Infinite 
 Expected output: 250
 (d)
 Repeats: 5
 Expected output: bbbbbabbbbb
   
 */

/*
 Was your prediction correct?
 Note : get the output after comment code of 'C' block as it was looping infinitely  
 (a) Correct
 (b) Correct
 (c) Correct [y % 3 always be not equal to ZERO and loop will iterate infinitely] 
 (d) Wrong as there is no print statement for the output word 

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		// a
		int x = 1;
		while( x < 100 ) {
		    System.out.print(x + " ");
		    x += 10;
		}
		
		// b
		int max = 10; 
		while( max < 10 ) {
		    System.out.println("count down: " + max );
		    max--;
		}
		
		// c
		int y = 250;
		while( y % 3 != 0 ) {
		    System.out.println( y );
		}
		
		// d
		String word = "a";
		while( word.length() < 10 ) {
		    word = "b" + word + "b";
		}
		System.out.println(word);
		
		
		System.out.println("ENDING LOOP TEST");
	}

}
