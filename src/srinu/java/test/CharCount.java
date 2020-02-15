package srinu.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		Map<Character,Integer> counters = countCharacters("Alabama banana");

		for (Iterator keys = counters.keySet().iterator(); keys.hasNext();) {
		Character ch = (Character)keys.next();
		Integer cnt = counters.get(ch);

		if (cnt.intValue() > 1) {
		System.out.println(ch + ":" + cnt);
		}
		}
		}

	private static Map<Character,Integer> countCharacters(final String str) {
		Map<Character,Integer> counters = new HashMap<Character,Integer>();

		if (str != null) {
			for (int i = 0; i < str.length(); i++) {
				Character ch = Character.toUpperCase(str.charAt(i));
				//System.out.println(":"+ch);
				Integer cnt = counters.get(ch);
				//System.out.println("#"+cnt);
				counters.put(ch, (cnt == null ? 0 : cnt.intValue()) + 1);
			}
		}

		return counters;
	}

}
