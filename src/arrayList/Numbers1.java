package arrayList;

import java.util.ArrayList;

public class Numbers1 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(24);
		nums.add(65);
		// for (int i = 0; i < nums.size(); i++) {
		// System.out.println(nums.get(i));

		// }
		// for (Integer x : nums) {
		// System.out.println(x);
		// }
		// for(Integer x : nums) {
		// if(x%2==1) {
		// System.out.println(x);
		// }

		nums.forEach(a -> {
			if (a % 2 == 1) {
				System.out.println(a);
			}
		});
	}
}
