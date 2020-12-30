import java.io.IOException;
import java.util.HashMap;

import edu.duke.FileResource;

public class CountWords {

	public static void main(String[] args) throws IOException {
		CountHelper obj = new CountHelper();

		if (args.length != 0) {
			String cmd = args[0].toLowerCase();
			switch (cmd) {
			case "count-words":
				if (args.length > 1) {
					System.out.println("ERROR! No such command exists");
				} else {
					obj.print();
				}
				break;
			default:
				System.out.println("ERROR! no such command exists!");
			}
		} else {
			obj.help();
		}
//		obj.print();
	}
}
