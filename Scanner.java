package abcdndrjfd;
import java.util.Scanner;

	class Employee {
	    String name;
	    int age;
	    double salary = 10000;

	    void create(Scanner sc) {
	        System.out.print("Enter the name: ");
	        name = sc.next();
	        System.out.print("Enter the age: ");
	        age = sc.nextInt();
	    }

	    void display() {
	        System.out.println(name + " " + age + " " + salary);
	    }

	    void raiseSalary() {
	        salary = salary + salary * 10 / 100;
	    }
	}

	public class Demo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Employee e = new Employee();
	        int choice;

	        do {
	            System.out.println("1) create 2) display 3) raise salary 4) Exit");
	            choice = sc.nextInt();

	            if (choice == 1) {
	                e.create(sc);
	            } else if (choice == 2) {
	                e.display();
	            } else if (choice == 3) {
	                e.raiseSalary();
	            }
	        } while (choice != 4);
	    }
	}


