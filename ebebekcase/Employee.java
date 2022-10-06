package ebebekcase;

public class Employee {
	public String name;
	public double salary;
	public double workHours;
	public int hireYear;

	public Employee(String name, double salary, double workHours, int hireYear) { // Constuctor
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;

	}

	public void run() {
		finalStep();
		System.out.println("-----------------------");
	}

	// tax() : Maasa uygulanan vergiyi hesaplayacaktir.
	public double tax() {
		double taxRate = 0.03;

		if (salary > 1000) {
			return salary * taxRate;
		} else {
			return 0;
		}
	}

	// bonus() : Maasa uygulanan bonusu hesaplayacaktir.
	public double bonus() {
		double bonusSalary = 0;

		if (workHours > 40) {
			bonusSalary = 30.0 * (workHours - 40);
			return bonusSalary;
		} else {
			return 0;
		}
	}

	// raiseSalary() : Calisanin ise baslangic yilina gore maas artisini hesaplayacaktir.
	public double raiseSalary() {
		double raiseRate1 = 0.05; // 10 yildan az bir suredir calisan.
		double raiseRate2 = 0.10; // 10 yildan fazla 20 yildan az calisan.
		double raiseRate3 = 0.15; // 20 ve uzeri yil calisan.
		double newSalary = salary + bonus() - tax();

		if ((2021 - hireYear) < 10) {
			return newSalary * raiseRate1;
		} else if ((2021 - hireYear) >= 10 && (2021 - hireYear) < 20) {
			return newSalary * raiseRate2;
		} else if ((2021 - hireYear) >= 20) {
			return newSalary * raiseRate3;
		} else {
			return 0;
		}
	}

	// totalSalary() : Calisanin maasinin son halini hesaplayacaktir.
	public double newSalary() {
		return salary + bonus() + raiseSalary() - tax();
	}

	// finalStep() : Calisana ait bilgileri ekrana bastiracaktir.
	public void finalStep() {
		System.out.println("Name Surname : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Work Hours : " + workHours);
		System.out.println("Hire Year : " + hireYear);
		System.out.println("Tax : " + tax() + " TL");
		System.out.println("Bonus : " + bonus() + " TL");
		System.out.println("Raise Salary : " + raiseSalary() + " TL");
		System.out.println("Total Salary : " + newSalary() + " TL");
	}

}