//

import java.util.Scanner;



public class fruitstand {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What fruit will you buy? (apples, bananas, mangos):  ");
		Scanner scanner = new Scanner(System.in);
		String fruittype = scanner.nextLine();
		
		System.out.println("How many fruit?  ");
		double NumberofFruit = keyboard.nextDouble();
		double cost;
		do {
			if (fruittype.equals("apples")) {
				double price = 0.3;
				cost = price * NumberofFruit;
				System.out.println("The total cost is:  " + cost); 
			}
			else if(fruittype.equals("bananas")){
				double price = 0.4;
				cost = price * NumberofFruit;
				System.out.println("The total cost is:  " + cost); 
				}
			else if(fruittype.equals("mangos")){
				double price = 0.5;
				cost = price * NumberofFruit;
				System.out.println("The total cost is:  " + cost); 
				}
			else {
				System.out.println("invalid fruit type");
				System.out.println("What fruit will you buy? (apples, bananas, mangos):  ");
				fruittype = scanner.nextLine();
				System.out.println("How many fruit?  ");
				NumberofFruit = keyboard.nextDouble();
		}
		}while(!fruittype.equals("apples") && !fruittype.equals("bananas") && !fruittype.equals("mangos") );
		

	}

}
