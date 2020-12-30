import java.util.HashMap;

import edu.duke.FileResource;

public class CountHelper {
	private HashMap<String, Integer> map;
	private int total;

	public CountHelper() {
		map = new HashMap<>();
	}

	public void count(FileResource fr) {
		for (String w : fr.words()) {
			total++;
			w = w.toLowerCase();
			if (!map.containsKey(w))
				map.put(w, 1);
			else
				map.put(w, map.get(w) + 1);
		}
	}

	public void countWords() {
		FileResource fr = new FileResource();
		count(fr);
		System.out.println("Total words: " + total);

	}

	public void countWordsAndDisplay() {
		FileResource fr = new FileResource();
		count(fr);
		System.out.println("Total words: " + total);
		for (String w : map.keySet()) {
			System.out.println(map.get(w) + "\t" + w);
		}

	}

	public void help() {
		System.out.printf("Usage :-\n");
		System.out.printf("$ ./CountWords help  # Opens the help menu\n");
		System.out.printf("$ ./CountWords count-words  # launch program and display the number of words\n");
		System.out.printf(
				"$ ./CountWords count-words-display  # launch program and display the number of words along with words and their number of occurance\n");
	}
}
