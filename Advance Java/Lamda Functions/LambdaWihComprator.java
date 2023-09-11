

import java.util.*;

class Employee {
	
	int id = 0;
	String name = null;

	Employee(int id, String name) {

		this.id = id; 
		this.name = name;
	}
	
	public String toString() {

		return id + ":" + name;
	}
}

class Demo {
	

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(new Employee(25, "Kanha"));
		al.add(new Employee(15, "Ashish"));
		al.add(new Employee(22, "Rahul"));
			
		System.out.println(al);		

		Collections.sort(al,(obj1, obj2) -> {
			
			return Employee((Employee)obj1).name.compareTo(Employee)obj2.name);
		});

		System.out.println(al);
	}
}
