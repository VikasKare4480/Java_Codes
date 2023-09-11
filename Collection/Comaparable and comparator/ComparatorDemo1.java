import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {

	String empName = null;
	float sal = 0;

	Employee(String empName, float sal) {
	
		this.sal = sal;
		this.empName = empName;
	}

	public String toString() {

		return empName+ ":" + sal;
	}	
}


class SortByName implements Comparator<Employee> {

	public int compare(Employee obj1, Employee obj2) {

		return obj1.empName.compareTo(obj2.empName); // Ascending order 

		// return -(obj1.empName.compareTo(obj2.empName));
	}
}

class SortBySal implements Comparator<Employee> {

	public int compare(Employee obj1, Employee obj2) {

		return (int) (obj1.sal - obj2.sal);

	}
}

class ComparatorDemo {

	public static void main(String[] args){
	
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee("Vikas",200000));
		al.add(new Employee("Tejas",250000));
		al.add(new Employee("Shahuraj",15000));
		al.add(new Employee("Akshay",100000));


		System.out.println("Original \n");
		System.out.println(al);
		
		// Collections.sort(al);

		Collections.sort(al,new SortByName());
		System.out.println("Sort By Name \n" + al); // error bcoz these are the user defined 


		Collections.sort(al,new SortBySal());
		System.out.println("Sort By Sal \n" + al);

		
	}
}

