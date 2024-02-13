package hashMap;

import java.util.HashMap;

public class Task3 {
	public static void main(String[] args) {
		HashMap<Integer, String> details = new HashMap<>();
		details.put(1417, "Stephy");
		details.put(440, "Dinesh");
		details.put(1410, "Priyanka");
		details.put(1441, "Sandhya");
		details.put(440, "Steve");

		details.values().forEach(a -> System.out.println(a));
		System.out.println("-----------------------------");
		details.keySet().forEach(a -> System.out.println(a));
		System.out.println("-----------------------------");
		details.keySet().forEach(a -> System.out.println(a + " = " + details.get(a)));
		System.out.println("-----------------------------");
		details.forEach((x, y) -> System.out.println(x + " = " + y));
		System.out.println("-----------------------------");
		details.forEach((x, y) -> {
			if (x < 1440) {
				System.out.println(x + " = " + y);
			}
		});
		System.out.println("------------------------------");
		for (String x : details.values()) {
			if (x.startsWith("S")) {
				continue;
			}
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		for (Integer x : details.keySet()) {
			if (x % 2 == 1) {
				System.out.println(details.get(x));
			}
		}
		System.out.println("--------------------------------");
		for (Integer x : details.keySet()) {
			if (x % 2 == 0) {
				System.out.println(details.get(x).charAt(details.get(x).length() - 2));

			}
		}
	}
}
