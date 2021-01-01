import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import edu.duke.FileResource;

public class CountWords {

	public static void main(String[] args) throws IOException {
		CountHelper obj = new CountHelper();

//		if (args.length != 0) {
//			String cmd = args[0].toLowerCase();
//			switch (cmd) {
//			case "count-words":
//				if (args.length > 1) {
//					System.out.println("ERROR! No such command exists");
//				} else {
//					obj.countWords();
//				}
//				break;
//			case "count-words-display":
//				if (args.length > 1) {
//					System.out.println("ERROR! No such command exists");
//				} else {
//					obj.countWordsAndDisplay();
//				}
//				break;
//			case "help":
//				obj.help();
//				break;
//			default:
//				System.out.println("ERROR! no such command exists!");
//			}
//		} else {
//			obj.help();
//		}

		obj.help();
		System.out.println("Enter your choice: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();

		while (!choice.equalsIgnoreCase("exit")) {
			if (choice.equalsIgnoreCase("help"))
				obj.help();
			else if (choice.equalsIgnoreCase("count-words"))
				obj.countWords();
			else if (choice.equalsIgnoreCase("count-words-display"))
				obj.countWordsAndDisplay();
			else
				System.out.println("Invalid input!");

			System.out.println("Enter your choice: ");
			scan = new Scanner(System.in);
			choice = scan.nextLine();

		}
		scan.close();

	}
}
