package Models;

public class PartTimeEmployee extends Employee {
    private double workHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String employeeID, String employeeName, int age, int phoneNumber, String email, double workHours) {
        super(employeeID, employeeName, age, phoneNumber, email);
        this.workHours = workHours;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "EmployeeID='" + getEmployeeID() + '\'' +
                ", EmployeeName='" + getEmployeeName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", workHours=" + workHours +
                '}';
    }

    @Override
    public double getNetSalary() {
        double result = getWorkHours() * 100000.0;
        return result;
    }

    @Override
    public String addNewEmployee() {
        return null;
    }
}
