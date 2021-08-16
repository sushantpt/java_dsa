package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FindWordFromFile {

	HashMap<String, Integer>wordCount = new HashMap<String, Integer>();

	Scanner scanner = new Scanner(System.in);
	String input = null; 

	while(true) {
		System.out.print("Enter a string: ");
		input = scanner.nextLine();

		if(input.equals("q")) break;

		if(wordCount.containsKey(input)) {
			int count = wordCount.get(input);  // get the total occurence of word that is in input
			wordCount.put(input, count + 1);
		}
		else {
			wordCount.put(input, 1);
		}
	}
	// search on the list of word
	System.out.println("--------------------------");
	System.out.print("Enter a word to search: ");
	input = scanner.nextLine();
	if(wordCount.containsKey(input)) {
		int count = wordCount.get(input);
		System.out.println(input + " appears " + count + " times.");
	}
	else {
		System.out.println(input + " is not in the hashmap.");
	}

}
}
