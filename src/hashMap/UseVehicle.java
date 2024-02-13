package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseVehicle {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Bus", 2000000, "Green", 4, true);
		Vehicle v2 = new Vehicle("Train", 43400000, "Brown", 12, true);
		Vehicle v3 = new Vehicle("Car", 6590000, "Red", 4, true);
		Vehicle v4 = new Vehicle("Bike", 150000, "Black", 2, false);
		Vehicle v5 = new Vehicle("Truck", 1200000, "Blue", 8, false);
		Vehicle v6 = new Vehicle("Aeroplane", 6700000, "White", 6, true);
		Vehicle v7 = new Vehicle("Bicycle", 5000, "Yellow", 2, false);

		HashMap<String, Vehicle> vehicle = new HashMap<>();
		vehicle.put(v1.getName(), v1);
		vehicle.put(v2.getName(), v2);
		vehicle.put(v3.getName(), v3);
		vehicle.put(v4.getName(), v4);
		vehicle.put(v5.getName(), v5);
		vehicle.put(v6.getName(), v6);
		vehicle.put(v7.getName(), v7);

		for (String x : vehicle.keySet()) {
			System.out.println(x);
		}
		System.out.println("--------------------------------------------------------------------------------");
		for (Vehicle x : vehicle.values()) {
			System.out.println(x);
		}
		System.out.println("--------------------------------------------------------------------------------");
		vehicle.keySet().forEach(x -> {
			if (vehicle.get(x).getPrice() > 1000000) {
				System.out.println(vehicle.get(x));
			}
		});
		System.out.println("--------------------------------------------------------------------------------");
		vehicle.forEach((x, y) -> {
			if (y.getPrice() > 4000000) {
				System.out.println(y);
			}
		});
		System.out.println("--------------------------------------------------------------------------------");
		vehicle.keySet().forEach(x -> {
			if (vehicle.get(x).getNoOfWheels() > 2 && vehicle.get(x).isAc() == true) {
				System.out.println(vehicle.get(x));

			}
		});
		System.out.println("---------------------------------------------------------------------------------");
		vehicle.keySet().forEach(x -> {
			if (vehicle.get(x).getName().startsWith("T")) {
				vehicle.get(x).setPrice(vehicle.get(x).getPrice() + (vehicle.get(x).getPrice() * 10 / 100));
				System.out.println(vehicle.get(x));
			}
		});
		System.out.println("--------------------------------------------------------------------------------");
		Iterator<String> a = vehicle.keySet().iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}
		System.out.println("--------------------------------------------------------------------------------");
		Iterator<Vehicle> b = vehicle.values().iterator();
		while (b.hasNext()) {
			if (b.next().getNoOfWheels() <  8) {
				b.remove();
			}
		}
		vehicle.values().forEach(x -> System.out.println(x));
	}

}