package exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElements {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Andrew");
		names.add("Neil");
		names.add("Aaron");
		names.add("Dan");
		names.add("Matt");
		names.add("Alison");
		names.add("Kevin");
		names.add("Renee");
		
		Collections.reverse(names);
		System.out.println("The list of names reversed is " + names);

	}

}
