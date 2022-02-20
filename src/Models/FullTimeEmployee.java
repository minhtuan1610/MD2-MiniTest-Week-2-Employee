package Models;

public class FullTimeEmployee extends Employee {
    private double bonusMoney;
    private double fineMoney;
    private double baseSalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String employeeID, String employeeName, int age, int phoneNumber, String email, double bonusMoney, double fineMoney, double baseSalary) {
        super(employeeID, employeeName, age, phoneNumber, email);
        this.bonusMoney = bonusMoney;
        this.fineMoney = fineMoney;
        this.baseSalary = baseSalary;
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getFineMoney() {
        return fineMoney;
    }

    public void setFineMoney(double fineMoney) {
        this.fineMoney = fineMoney;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "EmployeeID='" + getEmployeeID() + '\'' +
                ", EmployeeName='" + getEmployeeName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", bonusMoney=" + bonusMoney +
                ", fineMoney=" + fineMoney +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public double getNetSalary() {
        double result = getBaseSalary() + (getBonusMoney() - getFineMoney());
        return result;
    }

    @Override
    public String addNewEmployee() {

        return null;
    }

}
