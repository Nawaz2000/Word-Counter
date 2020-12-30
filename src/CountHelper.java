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

	public void print() {
		FileResource fr = new FileResource();
		count(fr);
		System.out.println("Total words: " + total);
		for (String w : map.keySet()) {
			System.out.println(map.get(w) + "\t" + w);
		}
	}

	public void help() {
		System.out.printf("Usage :-\n");
		System.out.printf("$ ./todo count-words  # launch program\n");
	}
}
