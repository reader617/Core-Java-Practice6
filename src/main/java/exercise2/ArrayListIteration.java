package exercise2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIteration {

	public static void main(String[] args) {
		int sum = 0;
		List<Integer> nums = new ArrayList<>();
		nums.add(6);
		nums.add(10);
		nums.add(15);
		nums.add(5);
		nums.add(12);
		nums.add(2);
		nums.add(7);
		
		for (Integer i: nums) {
			sum += i;
		}
		
		System.out.println("The sum of the numbers in list is: " + sum);

	}

}
