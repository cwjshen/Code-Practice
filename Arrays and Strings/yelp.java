import java.io.*;
import java.util.*;

public class yelp {
	public static void main(String[] args) {
		int[] a = {5,3,1};
		int[] b = {4,2};

		int a_counter = 0;
		int b_counter = 0;

		ArrayList merged = new ArrayList();

		while (a_counter < a.length && b_counter < b.length) {
			if (a[a_counter] > b[b_counter]) {
				merged.add(a[a_counter]);
				a_counter++;
			}
			if (a[a_counter] < b[b_counter]) {
				merged.add(b[b_counter]);
				b_counter++;
			}

		}

		if (b_counter < b.length) {
			System.out.println("a_counter: " + a_counter);
			while (b_counter < b.length) {
				merged.add(b[b_counter]);
				b_counter++;
			}
		}

		if (a_counter < a.length) {
			System.out.println("b_counter: " + b_counter);
			while (a_counter < a.length) {				
				merged.add(a[a_counter]);
				a_counter++;
			}
		}		

		System.out.println(merged);
	}
}