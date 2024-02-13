package hashMap;

import java.util.HashMap;

public class Task1 {
	public static void main(String[] args) {
		HashMap<Integer,String> details = new HashMap<>();
		details.put(1417,"Stephy");
		details.put(440,"Dinesh");
		details.put(1410, "Priyanka");
		details.put(1441, "Sandhya");
		details.put(440, "Steve");
		details.remove(1417);
		System.out.println(details.keySet());
		System.out.println("--------------------------------");
		System.out.println(details.values());
		System.out.println("---------------------------------");
		System.out.println(details);
	}

}
