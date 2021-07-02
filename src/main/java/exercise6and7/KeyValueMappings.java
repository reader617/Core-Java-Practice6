package exercise6and7;

import java.util.HashMap;
import java.util.Map;

public class KeyValueMappings {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(5, "Evan");
		map1.put(10, "Destin");
		map1.put(2, "Adrian");
		map1.put(3, "Jenna");

		System.out.println("The number of key value pairs in the map is " + map1.size());
		System.out.println("The list of keys in the map is " + map1.keySet());
	}

}
