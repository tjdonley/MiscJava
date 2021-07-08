
import java.util.Scanner;
public class CalculateTuitionProgram {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the cost of tuition for one credit");
		double costOfCredit = keyboard.nextDouble();
		System.out.println("Enter the number of credits");
		double NumOfCredits = keyboard.nextDouble();
		System.out.println("The cost of tuition is: " + costOfCredit * NumOfCredits);
	}

}
 