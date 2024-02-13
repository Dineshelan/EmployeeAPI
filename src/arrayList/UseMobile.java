package arrayList;

import java.util.ArrayList;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", 80000, "White", "S23", 2023);
		Mobile m2 = new Mobile("Apple", 95000, "Black", "13Pro", 2022);
		Mobile m3 = new Mobile("Redmi", 20000, "Red", "b2", 2021);
		Mobile m4 = new Mobile("Realme", 25000, "Purple", "R6", 2019);
		Mobile m5 = new Mobile("Poco", 43560, "Blue", "M2", 2020);
		Mobile m6 = new Mobile("Motrola", 15000, "Orange", "duo2", 2022);
		Mobile m7 = new Mobile("Pixel", 75000, "Neon", "G4", 2018);
		Mobile m8 = new Mobile("OnePlus", 45000, "Matte Black", "Nord", 2021);
		Mobile m9 = new Mobile("Vivo", 34000, "Yellow", "V5", 2016);
		Mobile m10 = new Mobile("Oppo", 23000, "Teal", "F23", 2017);

		ArrayList<Mobile> mob = new ArrayList<>();
		mob.add(m1);
		mob.add(m2);
		mob.add(m3);
		mob.add(m4);
		mob.add(m5);
		mob.add(m6);
		mob.add(m7);
		mob.add(m8);
		mob.add(m9);
		mob.add(m10);

		for (int i = 0; i < mob.size(); i++) {
			System.out.println(mob.get(i));
		}
		System.out.println("----------------------------------------------------------------------------------------");
		for (Mobile x : mob) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		mob.forEach(a -> {
			if (a.getPrice() > 15000 && a.getEdition() < 2020) {
				System.out.println(a);
			}
		});
		System.out.println("-----------------------------------------------------------------------------------------");
		ArrayList<Mobile> newmob = new ArrayList<>();
		mob.forEach(x -> {
			if (x.getBrand().startsWith("S")) {
				newmob.add(x);
			}
		});
		newmob.forEach(z -> System.out.println(z));

		System.out
				.println("------------------------------------------------------------------------------------------");
		ArrayList<Mobile> newmob1 = new ArrayList<>();
		for (int i = 0; i < mob.size(); i++) {
			if (mob.get(i).getColour().equals("Black") || mob.get(i).getColour().equals("Blue")) {
				newmob1.add(mob.get(i));
			}
		}
		newmob1.forEach(v -> System.out.println(v));
		
		System.out.println("------------------------------------------------------------------------------------------");
		for(Mobile x: mob) {
			if(x.getEdition()>2022) {
				System.out.println(x.getBrand());
			}
		}
	}
}
