package hbadckeferf;

public class Project{
	
	import java.util.Scanner;

	interface Abc {
	    void create();
	    void display();
	    void raiseSalary();
	}

	class Demoooo implements Abc {

	    String name;
	    int age;
	    String designation;
	    double salary;

	    Scanner sc = new Scanner(System.in);

	    public void create() {

	        String choice;

	        do {
	            System.out.print("Enter the name: ");
	            name = sc.nextLine();

	            System.out.print("Enter the age (18-60): ");
	            age = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter designation (Programmer/Coder/Manager): ");
	            designation = sc.nextLine();

	            if (designation.equalsIgnoreCase("Programmer")) {
	                salary = 25000;
	            }
	            else if (designation.equalsIgnoreCase("Coder")) {
	                salary = 20000;
	            }
	            else if (designation.equalsIgnoreCase("Manager")) {
	                salary = 30000;
	            }
	            else {
	                System.out.println("Invalid designation!");
	            }

	            System.out.print("Do you want to continue? (YES/NO): ");
	            choice = sc.nextLine();

	        } while (choice.equalsIgnoreCase("YES"));
	    }

	    public void display() {

	        System.out.println("\n===== EMPLOYEE DETAILS =====");
	        System.out.println("Your name is        : " + name);
	        System.out.println("Your age is         : " + age);
	        System.out.println("Your salary is      : " + salary);
	        System.out.println("Your designation is : " + designation);
	    }

	    public void raiseSalary() {

	        System.out.print("Enter raise percentage: ");
	        double percentage = sc.nextDouble();

	        salary = salary + (salary * percentage / 100);

	        System.out.println("Salary raised successfully!");
	        System.out.println("Your new salary is: " + salary);

	        sc.nextLine();
	    }

	    public static void main(String[] args) {

	        Demo d = new Demo();

	        int choice;

	        do {

	            System.out.println("\n===== EMPLOYEE MENU =====");
	            System.out.println("1) CREATE");
	            System.out.println("2) DISPLAY");
	            System.out.println("3) RAISE SALARY");
	            System.out.println("4) EXIT");

	            System.out.print("Enter your choice: ");
	            choice = d.sc.nextInt();
	            d.sc.nextLine();

	            switch (choice) {

	                case 1:
	                    d.create();
	                    break;

	                case 2:
	                    d.display();
	                    break;

	                case 3:
	                    d.raiseSalary();
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


