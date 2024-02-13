package arrayList;

import java.util.ArrayList;

public class Numbers {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(24);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(75);
		nums.add(69);
		System.out.println(nums);
		nums.set(3, 28);
		System.out.println(nums);
		nums.remove(4);
	    System.out.println(nums);
		System.out.println(nums.get(2));
		System.out.println(nums.size());
	}

}
