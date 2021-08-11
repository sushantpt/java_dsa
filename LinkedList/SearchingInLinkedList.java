
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		while (true) {
			System.out.print("Enter a num: ");
			input = scanner.nextInt();
			if(input == 0) {
				break;
			}
			numbers.add(input);
		}
		System.out.println("--------------------");
		System.out.print("Enter number to check: ");
		input = scanner.nextInt();
		if(numbers.contains(input)) {
			System.out.println(input + " is in the list.");
		}
		else {
			System.out.println(input + " is not in the list.");
		}

	}

}
