public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();

//        manager.createTenEmployee();
//        System.out.println("Trước khi sắp xếp");
//        manager.displayEmployee();
//
//
//        System.out.println("Display the average salary of the whole company.");
//        System.out.println(manager.aveSalary());
//        System.out.println("------------------");
//
//        System.out.println("Display employees whose salary is below the company's average.");
//        for (Employee employee: manager.listEmployeeLowerAveSalary()){
//            System.out.println(employee);
//        }
//        System.out.println("------------------");
//
//
//
//        System.out.println("Sau khi sắp xếp");
//        manager.displayEmployeeFullTme();


        for (Employee employee: manager.listEmployeeLowerAveSalary()){
            System.out.println(employee);
        }
        System.out.println("-----------------");
        manager.displayEmployeeFullTme();

    }
}
