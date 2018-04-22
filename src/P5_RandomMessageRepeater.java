import java.util.Random;
import java.util.Scanner;

/*
ISYS 320
Name(s): Derek Stone
Date:    April-21-2018
*/

public class P5_RandomMessageRepeater {
	public static void main(String[] args) {
		boolean hasSameRandomMessage = true;
		String secondaryRandomMsg = "";
		String firstRandomMessage = getRandomMessage();
		System.out.println("Randomly first message has been Selected : \n");
		whileRepeater(firstRandomMessage);
		while(hasSameRandomMessage){
			secondaryRandomMsg = getRandomMessage();
			if(!firstRandomMessage.equals(secondaryRandomMsg)){				
				hasSameRandomMessage = false;				
			}			
		}
		System.out.println("\nRandomly second message has been Selected : \n");
		doWhileRepeater(secondaryRandomMsg);		
	}
	
	public static String getRandomMessage(){
		String randomSelectedMessage = "";
		
		String message_1 = "Why would a Pop-Tart want to live inside a toaster?";
		String message_2 = "What would you think about the course of Java?";
		String message_3 = "What do you know about Java 8?";
		Random rand = new Random();
		int a = rand.nextInt( 3 ) + 1;
		if(a == 1){
			randomSelectedMessage = message_1;
		}
		if(a == 2){
			randomSelectedMessage = message_2;
		}
		if(a == 3){
			randomSelectedMessage = message_2;
		}
		//input.close();
		return randomSelectedMessage;
	}
	
	public static void whileRepeater (String str){
		
		int count = 0;
		Scanner input1 = new Scanner(System.in);
		System.out.println(str);
		System.out.println("Do you want to hear it again (-1 for no)? ");
		//String inputline = input.nextLine();
		while(input1.hasNextInt() ){				
			count = input1.nextInt();
			if(count < 0)
				break;
			else{
				System.out.println(str);
				System.out.println("Do you want to hear it again (-1 for no)? ");
			}
		}
		//input1.close();
	}
		
		public static void doWhileRepeater (String str){
			int count = 0;
			boolean hasBegan = false;
			Scanner input = new Scanner(System.in);
			
			do{
				if(hasBegan)
					count = input.nextInt();
				 else
					 hasBegan = true;
				if(count < 0)
					break;
				else{
					System.out.println(str);
					System.out.println("Do you want to hear it again (-1 for no)? ");
				}
				
			}while(input.hasNextInt());
		input.close();
	}

}
