package streamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(22);
		nums.add(36);
		nums.add(45);
		nums.add(10);
		nums.add(59);
		nums.stream().forEach(x -> System.out.println(x));
		System.out.println("--------------------------");
		nums.stream().filter(x -> x % 2 == 0).forEach(y -> System.out.println(y));
		System.out.println("---------------------------");
		long num = nums.stream().filter(x -> x % 2 == 0 && x % 3 == 0).count();
		System.out.println(num); // Count the values
		System.out.println("--------------------------");
		List<Integer> a = nums.stream().filter(x -> x % 5 == 0).collect(Collectors.toList());
		System.out.println(a);
		System.out.println("---------------------------");
		int b = nums.stream().max(Comparator.comparingInt(Integer::intValue)).get();
		System.out.println("Max Number: " + b); // Find Max Number
		System.out.println("---------------------------");
		int c = nums.stream().min(Comparator.comparingInt(Integer::intValue)).get();
		System.out.println("Min Number: " + c); // Find Min Number
		System.out.println("----------------------------");
		List<Integer> num1 = nums.stream().sorted(Comparator.comparingInt(Integer::intValue)).collect(Collectors.toList());
		System.out.println(num1); // Ascending order
		System.out.println("-----------------------------");
		List<Integer> num2 = nums.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).collect(Collectors.toList());
		System.out.println(num2); // Descending order
		System.out.println("-----------------------------");
		nums.stream().distinct().forEach(x -> System.out.println(x)); // removes duplicate
		System.out.println("-----------------------------");
		nums.stream().filter(x->x%2==0).skip(2).forEach(x->System.out.println(x)); // skips the values based on how many times you want to skip
		System.out.println("-----------------------------");
		nums.stream().filter(x->x%3==0).limit(2).forEach(x->System.out.println(x)); // limits how many values needed 

	}

}
