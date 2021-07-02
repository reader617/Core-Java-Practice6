package exercise8;

import java.util.Map;
import java.util.TreeMap;

public class KeySort {

	public static void main(String[] args) {
		ReverseOrderComparator rs = new ReverseOrderComparator();
		Map<String, String> map1 = new TreeMap<>(rs);
		map1.put("Jesper", "Blue");
		map1.put("Kaz", "Gold");
		map1.put("Inej", "Green");
		map1.put("Nina", "Yellow");
		map1.put("Wylan", "Orange");
		map1.put("Matthais", "Gray");
		
		System.out.println("Map using reverse order comparator " + map1);

	}

}
