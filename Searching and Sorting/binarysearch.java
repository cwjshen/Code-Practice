import java.util.*;
import java.io.*;

public class binarysearch {

	public static int binary_search (int[] numbers, int searchfor, int lower, int upper) {
		int middle = (lower + upper + 1) / 2;

		if (searchfor > numbers[middle]) {
			lower = middle + 1;			
			return binary_search(numbers, searchfor, lower, upper);
		}
		else if (searchfor < numbers[middle]) {
			upper = middle - 1;
			return binary_search(numbers, searchfor, lower, upper);			
		}
		else {
			return numbers[middle];
		}
	}

	public static void main(String[] args) {
		int[] numbers = {3,6,2,5,1,4,8,7,9};
		Arrays.sort(numbers);		
		System.out.println(binary_search(numbers, 2, 0, 8));
		return;
	}
	
}

// 1 2 3 4 5 6 7 8

// lower = 0
// middle = 4
// upper = 7
// searchfor = 2

// 2 < numbers[4] -> upper = 4 - 1 = 3
// binary search on lower = 0, upper = 3

// 1 2 3 4
// lower = 0
// middle = 2
// upper = 3
// searchfor = 2

// 2 < numbers[2]
// upper = 2 - 1 = 1

// binary search on lower = 0, upper = 1
// lower = 0
// middle = 1
// upper = 1
// searchfor = 2
// return 2