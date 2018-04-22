import java.util.Random;
import java.util.Scanner;
/*
ISYS 320
Name(s): Derek Stone
Date:    April-21-2018
*/

public class CoinFlipper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0;
		String head = "H";
		String tail = "T";
		int num = 1 ;
		int totalCount = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Stop when we flip how many heads consecutively? ");
		int count = input.nextInt();
		int headCount = 0;
		while(headCount != count) {	
			totalCount++;
			if(num >= 1 && num%5 ==0){
				System.out.println();
				num = 1;
			} else {
				num++;
			}
			Random rand = new Random();
			a = rand.nextInt( 2 ) ;
			if(a == 0){
				System.out.print("H ");
				headCount++;
			}
			if(a == 1){
				System.out.print("T ");
				headCount = 0;
			}
		}
		System.out.println("\nWe did it in "+totalCount+" flips.");

	}

}
