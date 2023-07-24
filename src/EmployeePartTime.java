public class EmployeePartTime extends Employee{
    private int workingHouse;

    public EmployeePartTime() {
    }

    public EmployeePartTime(int employeeCode, String name, int age, int numberPhone, String email, Address address, int workingHouse) {
        super(employeeCode, name, age, numberPhone, email, address);
        this.workingHouse = workingHouse;
    }

    public int getWorkingHouse() {
        return workingHouse;
    }

    public void setWorkingHouse(int workingHouse) {
        this.workingHouse = workingHouse;
    }

    @Override
    public String toString() {
        return super.toString() + ", working house: " + workingHouse + "}";
    }

    @Override
    public double realIncome() {
        return workingHouse*100000;
    }
}
