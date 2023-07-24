public class EmployeeFullTime extends Employee{
    private double moneyBonus;
    private double moneyFine;
    private double hardSalary;

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(int employeeCode, String name, int age, int numberPhone, String email, Address address,
                            double moneyBonus, double moneyFine, double hardSalary) {
        super(employeeCode, name, age, numberPhone, email, address);
        this.moneyBonus = moneyBonus;
        this.moneyFine = moneyFine;
        this.hardSalary = hardSalary;
    }

    public double getMoneyBonus() {
        return moneyBonus;
    }

    public void setMoneyBonus(int moneyBonus) {
        this.moneyBonus = moneyBonus;
    }

    public double getMoneyFine() {
        return moneyFine;
    }

    public void setMoneyFine(int moneyFine) {
        this.moneyFine = moneyFine;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", money bonus: " + moneyBonus + ", money fine: " + moneyFine + ", hard salary: " + hardSalary + "}";
    }

    @Override
    public double realIncome() {
        return (hardSalary + (moneyBonus - moneyFine));
    }
}
