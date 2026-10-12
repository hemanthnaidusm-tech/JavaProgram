package abcdndrjfd;

import java.util.Scanner;

class EmployeeData {
    String name;
    int age;
    double salary;

    EmployeeData(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }

    void raiseSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }
}

public class Employeee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeData employee = null;

        while (true) {

            System.out.println("\n1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    scanner.nextLine();

                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter the age: ");
                    int age = scanner.nextInt();

                    System.out.print("Enter the salary: ");
                    double salary = scanner.nextDouble();

                    employee = new EmployeeData(name, age, salary);

                    System.out.println("Employee created successfully!");
                    break;

                case 2:
                    if (employee == null) {
                        System.out.println("No employee found.");
                    } else {
                        employee.display();
                    }
                    break;

                case 3:
                    if (employee == null) {
                        System.out.println("No employee found.");
                    } else {
                        System.out.print("Enter salary raise percentage: ");
                        double percentage = scanner.nextDouble();

                        employee.raiseSalary(percentage);

                        System.out.println("Salary raised successfully!");
                        System.out.println("New Salary: " + employee.salary);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}