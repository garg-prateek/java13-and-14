
public class RecordDemo {

	record Employee(String name, int sal) {
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Garg", 120);

		System.out.println(employee);

		System.out.println(employee.name);
		System.out.println(employee.sal);
		System.out.println(employee.hashCode());

		Employee e2 = new Employee("Hello", 150);

		System.out.println(e2.hashCode());

		Employee employ = new Employee("Garg", 120);
		System.out.println(employ.equals(employee));
		System.out.println(employ.hashCode());

	}

}
