package exercise5;

import java.util.TreeSet;

public class exercise5 {

	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(7);
		set1.add(6);
		set1.add(5);
		set1.add(4);
		set1.add(2);
		set1.add(3);
		set1.add(1);
		set1.add(8);
		set1.add(9);
		set1.add(10);
		
		System.out.println("The elements less than 7 are " + set1.headSet(7));

	}

}
