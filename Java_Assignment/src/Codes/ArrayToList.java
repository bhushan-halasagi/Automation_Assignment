package Codes;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

class ArrayToList {
	public static void main(String[] args) {
		String[] array = { "Java", "Python", "C" };
		System.out.println("Array: " + Arrays.toString(array));

		// convert array to list
		List languages = new ArrayList<>(Arrays.asList(array));

		System.out.println("List: " + languages);
	}
}