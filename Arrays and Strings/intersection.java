import java.io.*;
import java.util.*;

public class intersection {

	public static ArrayList<String> find_intersection(String[] set1, String[] set2) {
		HashMap<String, Integer> set1_map = new HashMap<String, Integer>();
		ArrayList<String> solution = new ArrayList<String>();
		for (String s : set1) {
			if (!set1_map.containsKey(s)) {
				set1_map.put(s, 1);
			}
			else {
				set1_map.put(s, set1_map.get(s) + 1);
			}
		}
		for (String s : set2) {
			if (set1_map.containsKey(s)) {
				if (set1_map.get(s) > 0) {
					set1_map.put(s, set1_map.get(s) - 1);
					solution.add(s);		
				}				
			}
		}

		return solution;

	}

	public static ArrayList<String> find_intersection_set(String[] set1, String[] set2) {
		HashSet<String> set1_set = new HashSet<String>();
		HashSet<String> solution_set = new HashSet<String>();
		ArrayList<String> solution_list = new ArrayList<String>();
		for (String s : set1) {
			set1_set.add(s);
		}
		for (String s : set2) {
			if (set1_set.contains(s)) {
				solution_set.add(s);
			}
		}
		for (String s : solution_set) {
			solution_list.add(s);
		}
		return solution_list;



	}

	public static void main(String[] args) {
		String[] set1 = {"kobe", "lebron", "lebron"};
		String[] set2 = {"linsanity", "lebron", "lebron", "lel"};

		System.out.println(find_intersection_set(set1, set2));
		return;
	}
}