package ebebekcase;

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Enes Sahin", 980, 35, 2017);
		Employee employee2 = new Employee("Hakan Berk Ozdogan", 1600, 45, 2008);
		Employee employee3 = new Employee("Umut Kenar", 2200, 30, 2002);

		employee1.run();
		employee2.run();
		employee3.run();
	}

}
