package streamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Dinesh", 40000, 24, true, "Chennai", "Java Deveoper");
		Employee e2 = new Employee("Prem", 65000, 29, true, "Siruseri", "Business Associate");
		Employee e3 = new Employee("Anisha", 34000, 27, false, "Anna Nagar", "Human Resource");
		Employee e4 = new Employee("Sandhya", 56000, 26, false, "Anna Nagar", "Springboot Developer");
		Employee e5 = new Employee("trypnm", 28000, 25, true, "Thiruvanmiyur", "Java Deveoper");

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);

		Employee max = emp.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(max.getName());
		System.out.println("------------------");
		List<String> a = emp.stream().filter(x->x.getAge()>25).map(x->x.getName()).collect(Collectors.toList());
		System.out.println(a);
		System.out.println("------------------");
		List<Employee> b = emp.stream().filter(x-> x.getName().contains("a")||
				                x.getName().contains("e")||
				                x.getName().contains("o")||
				                x.getName().contains("u")||
				                x.getName().contains("i")).peek(x->x.setSalary((x.getSalary()*10/100)+x.getSalary())).collect(Collectors.toList());
				                System.out.println(b);
				                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	emp.stream().map(x->x.getLocation()).forEach(x->System.out.println(x));
	System.out.println("-----------------------------");
	Map<Integer,Employee> e = emp.stream().filter(x-> x.getAge()>25).collect(Collectors.toMap(x->x.getSalary(),y->y ));
	System.out.println(e);
	
				                
				                
				
	}

}
