package hbadckeferf;

import java.util.Scanner;

interface Abc {
    void create();
    void display();
    void raiseSalary();
}

class Demo implements Abc {

    String name;
    int age;
    double salary;

    Scanner sc = new Scanner(System.in);

    public void create() {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }

    public void raiseSalary() {
        System.out.print("Enter raise percentage: ");
        double percentage = sc.nextDouble();

        salary = salary + (salary * percentage / 100);

        System.out.println("Salary raised successfully!");
        System.out.println("New Salary: " + salary);
    }

    public static void main(String[] args) {

        Demo bb = new Demo();
        try (Scanner sc = new Scanner(System.in)) {
			int choice;

			do {
			    System.out.println("\n===== Employee Menu =====");
			    System.out.println("1. Create");
			    System.out.println("2. Display");
			    System.out.println("3. Raise Salary");
			    System.out.println("4. Exit");
			    System.out.print("Enter your choice: ");

			    choice = sc.nextInt();
			    sc.nextLine();

			    switch (choice) {

			        case 1:
			            bb.create();
			            break;

			        case 2:
			            bb.display();
			            break;

			        case 3:
			            bb.raiseSalary();
			            break;

			        case 4:
			            System.out.println("Exiting...");
			            break;

			        default:
			            System.out.println("Invalid choice!");
			    }

			} while (choice != 4);
		}
    }
}