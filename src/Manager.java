import java.util.*;

public class Manager {
    private Scanner scanner;
    private List<Employee> employeeList;
    private final List<Employee> employees;

    public Manager() {
        scanner = new Scanner(System.in);
        employeeList = new LinkedList<>();
        employees = createTenEmployee();
    }


    public List<Employee> createTenEmployee() {
        Employee employee1 = new EmployeeFullTime(3654, "Tuyên", 23, 973792506,
                "tuyen@gmail.com", new Address("Hà Nội", "Ba Vì", "Minh Quang", "Nhà số 4"), 500000, 200000, 10000000);
        Employee employee2 = new EmployeeFullTime(
                3455, "Hoàn", 25, 968792506,
                "hoan@gmail.com", new Address("Hà Nội", "Ba Đình", "Minh Thành", "Nhà số 23"), 100000, 200000, 7110000);
        Employee employee3 = new EmployeeFullTime(
                3356, "Chiến", 20, 973412506,
                "chien@gmail.com", new Address("Hà Nội", "Hà Đông", "Vân Quán", "Nhà số 9 xóm 4 "), 50000, 2000000, 5200000);
        Employee employee4 = new EmployeeFullTime(3697, "Oanh", 19, 936792506,
                "yingying@gmail.com", new Address("Hà Nội", "Hoàng Mai", "Hà Nhân", "Nhà số 1 thôn Đồng Tâm"), 153000, 20000, 10500000);
        Employee employee5 = new EmployeeFullTime(
                3154, "Đông", 27, 473792506, "dongta@gmail.com", new Address("Hà Nội", "Thanh Trì", "Khánh Thượng", "Nhà số 404 ngõ 12"), 470000, 205000, 5025400);
        Employee employee6 = new EmployeePartTime(
                3484, "Thành", 23, 364974157, "thanh@gmail.com", new Address("Hà Nội", "Hà Đông", "Tân Triều", "Nhà số 123 ngõ 3"), 80);
        Employee employee7 = new EmployeePartTime(
                3644, "Triệu", 20, 366574157, "th@gmail.com", new Address("Hà Nội", "Hà Đông", "Tân Triều", "Nhà số 11 ngõ 9"), 60);
        Employee employee8 = new EmployeePartTime(
                3384, "Trung", 23, 874654157, "tr@gmail.com", new Address("Hà Nội", "Hoàng Mai", "Đại Từ", "Nhà số 123 ngõ 3"), 85);
        Employee employee9 = new EmployeePartTime(
                3084, "Anh", 25, 924974157, "anh@gmail.com", new Address("Hà Nội", "Hoàng Mai", "Mỹ Đình", "Nhà số 123 ngõ 3"), 70);
        Employee employee10 = new EmployeePartTime(
                3404, "Quang", 23, 363454157, "quang@gmail.com", new Address("Hà Nội", "Thanh Trì", "Phú Nhuận", "Nhà số 3 ngõ 17"), 83);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        employeeList.add(employee10);

        return employeeList;
    }

    public void displayEmployee(){
        for (Employee employee: employeeList){
            System.out.println(employee);
        }
    }
    public double totalSalary(){
        double total = 0;
        for (Employee employee : employeeList) {
            total += employee.realIncome();
        }
        return total;
    }
    public double aveSalary() {
        return totalSalary()/employeeList.size();
    }

    public List<Employee> listEmployeeLowerAveSalary() {
        employeeList = listEmployeeFullTime();
        List<Employee> employees = new LinkedList<>();
        for (Employee value : employeeList) {
            if (((EmployeeFullTime)value).getHardSalary() < aveSalary()) {
                employees.add(value);
            }
        }
        return employees;
    }

    public double totalSalaryPayEmployeePartTime() {
        double total = 0;
        for (Employee element : employees) {
            if (element instanceof EmployeePartTime) {
                total += element.realIncome();
            }
        }
        return total;
    }

    private List<Employee> listEmployeeFullTime() {
        List<Employee> list = new LinkedList<>();
        for (Employee employee : employeeList) {
            if (employee instanceof EmployeeFullTime) {
                list.add(employee);
            }
        }
        return list;
    }
private List<Employee> employeeFullTime;
    private void sortEmployeeFullTime() {
        employeeFullTime = listEmployeeFullTime();
        employeeFullTime.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (((EmployeeFullTime) o1).getHardSalary() > ((EmployeeFullTime) o2).getHardSalary())
                    return 1;
                else if (((EmployeeFullTime) o1).getHardSalary() < ((EmployeeFullTime) o2).getHardSalary())
                    return -1;
                else return 0;
            }
        });
    }
    public void displayEmployeeFullTme(){
        sortEmployeeFullTime();
        for (Employee employee: employeeFullTime){
            System.out.println(employee);
        }
    }

    public void showRealSalary(){
        System.out.println("Actual salary received by the employees in the company");
        for (Employee element:
             employeeList) {
            System.out.println(element.realIncome());
        }
    }




}
