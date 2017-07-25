import java.io.*;
import java.util.*;

public class stringbuilder {
	public static void main (String[] args) {
		// System.out.println(('o' == 'O'));
		System.out.println(removeConsecutiveChar("hellloooooo", 'l'));

	}

	public static String removeConsecutives(String s) {
		StringBuilder sbuilder = new StringBuilder();

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) != s.charAt(i-1)) {
				sbuilder.append(s.charAt(i-1));
			}

			if (i == s.length() - 1) {
				sbuilder.append(s.charAt(i));
			}
		}
		return sbuilder.toString();
	}


	public static String removeConsecutiveChar(String s, char c) {

		StringBuilder sbuilder = new StringBuilder();
		boolean found = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c && found == false) {
				sbuilder.append(s.charAt(i));
				found = true;
			}
			else if (s.charAt(i) == c && found == true) {
				continue;
			}
			else {
				sbuilder.append(s.charAt(i));				
				found = false;				
			}
			System.out.println(sbuilder);
			System.out.println();

		}

		return sbuilder.toString();

	}

}