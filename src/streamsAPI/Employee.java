package streamsAPI;

public class Employee {
	private String name;
	private int salary;
	private int age;
	private boolean isMale;
	private String location;
	private String role;
	public Employee(String name, int salary, int age, boolean isMale, String location, String role) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.isMale = isMale;
		this.location = location;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String toString() {
		return "name=" + name + ", salary=" + salary + ", age=" + age + ", isMale=" + isMale + ", location="
				+ location + ", role=" + role;
	}
	
}
