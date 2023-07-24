public abstract class  Employee {
    private int employeeCode;
    private String name;
    private int age;
    private int numberPhone;
    private String email;
    private Address address;

    public Employee() {
    }

    public Employee(int employeeCode, String name, int age, int numberPhone, String email, Address address) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
        this.address = address;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode= " + employeeCode +
                ", name= " + name + '\'' +
                ", age= " + age +
                ", numberPhone= 0" + numberPhone + '\'' +
                ", email= " + email + '\'' +
                ", address: " + address;
    }

    public abstract double realIncome();


}
