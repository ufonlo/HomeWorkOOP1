package Exampl;

import java.util.Arrays;
import java.util.ArrayList;

public class LongestNameFinder {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Hennadii", "Maxim", "Marina"));

		System.out.println(longestName(names));
		longestName(new ArrayList<>());

	}

	public static String longestName(ArrayList<String> names) {
		if (names.size() == 0) {
			throw new IllegalArgumentException("size = 0");
		}
		int index = 0;
		int i = 0;
		for (String name : names) {
			if (name.length() > names.get(index).length()) {
				index = i;
			}
			i++;
		}
		return names.get(index);
	}

}
