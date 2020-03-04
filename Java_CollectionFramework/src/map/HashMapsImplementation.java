package map;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class HashMapsImplementation {

	List<String> englishWords = new ArrayList<String>();
	List<String> spanishWord = new ArrayList<String>();
	Map<String, String> changetoEnglish = new HashMap<String, String>();

	public HashMapsImplementation() {
		super();
	}

	public HashMapsImplementation(List<String> spanishWord) {
		super();

		this.spanishWord = spanishWord;
	}

	public Map<String, String> initalizeMap() {

		for (int i = 0; i < spanishWord.size(); i++) {

			String s = Normalizer.normalize(spanishWord.get(i), Normalizer.Form.NFKD)
					.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
			System.out.println(s);
			changetoEnglish.put(spanishWord.get(i), s);
		}
		return changetoEnglish;
	}

	public void changeMyWord(Map<String, String> myMap, List<String> myPhrase) {

		List<String> p1 = new ArrayList<String>();
		for (int i = 0; i < myPhrase.size(); i++) {
			String s = myPhrase.get(i).toString();

			for (Map.Entry<String, String> entry : myMap.entrySet()) {
				s = s.replace(entry.getKey(), entry.getValue());

			}
			p1.add(s);
		}
		
		ListIterator<String> l1 = p1.listIterator();
		System.out.println("After Convertion the String is : ");
		while (l1.hasNext()) {
			System.out.print(l1.next());
			System.out.print(" ");
		}
	}
}
