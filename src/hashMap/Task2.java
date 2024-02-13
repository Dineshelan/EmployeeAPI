package hashMap;

import java.util.HashMap;

public class Task2 {
	public static void main(String[] args) {
		HashMap<Integer,String> details = new HashMap<>();
		details.put(1417,"Stephy");
		details.put(440,"Dinesh");
		details.put(1410, "Priyanka");
		details.put(1441, "Sandhya");
		details.put(440, "Steve");
		
		for(String x:details.values()) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		for(Integer x:details.keySet()) {
			System.out.println(x);
		}
		System.out.println("----------------------------");
		for(Integer x:details.keySet()) {
			System.out.println(x+" = "+details.get(x));
		}
	}
}