import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        int choice = -1;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Display a list of employees of the company: ");
            System.out.println("2. Actual salary of employees: ");
            System.out.println("3. Average salary of employees throughout the company: ");
            System.out.println("4. List of fulltime employees whose salary is lower than the company's average salary: ");
            System.out.println("5. Total salary payable to part-time employees: ");
            System.out.println("6. List of full-time employees with increasing salary: ");
            System.out.println("0. Exit: ");
            System.out.println("Enter choice:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                e.printStackTrace();
            }


            switch (choice){
                case 1:
                    System.out.println("List employee: ");
                    manager.displayEmployee();
                    System.out.println("-------*****--------");
                    break;
                case 2:
                    System.out.println("Actual salary of employees:");
                    manager.showRealSalary();
                    System.out.println("-------*****--------");
                    break;
                case 3:
                    System.out.println("Average salary of employee: ");
                    System.out.println(manager.aveSalary());
                    System.out.println("-------*****--------");
                    break;
                case 4:
                    System.out.println("List full-time employee of salary is lower than average:");
                    for (Employee employee: manager.listEmployeeLowerAveSalary()){
                    System.out.println(employee);
                }
                    System.out.println("-------*****--------");
                    break;
                case 5:
                    System.out.println("Total salary part-time employee:");
                    System.out.println(manager.totalSalaryPayEmployeePartTime());
                    System.out.println("-------*****--------");
                    break;
                case 6:
                    System.out.println("List full-time employee: ");
                    manager.displayEmployeeFullTme();
                    System.out.println("-------*****--------");
                    break;

            }
        }while (choice!=0);

    }
}
