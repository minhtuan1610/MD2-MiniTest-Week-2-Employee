package Models;

public abstract class Employee {
    private String EmployeeID;
    private String EmployeeName;
    private int age;
    private int phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(String employeeID, String employeeName, int age, int phoneNumber, String email) {
        EmployeeID = employeeID;
        EmployeeName = employeeName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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
                "EmployeeID='" + EmployeeID + '\'' +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public abstract double getNetSalary();

    public abstract String addNewEmployee();

}
