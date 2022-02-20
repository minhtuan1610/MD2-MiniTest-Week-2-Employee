package Controllers;

import Models.Employee;
import Models.FullTimeEmployee;

public class Method {
    public static void displayEmployeeInfo(Employee[] employees) {
        for (Employee i : employees
        ) {
            String information = i.toString();
            System.out.println(information);
        }
    }

    public static void displayNetSalary(Employee[] employees) {
        for (Employee i : employees
        ) {
            double netSalary = i.getNetSalary();
            System.out.println(i.getEmployeeID() + "-" + i.getEmployeeName() + ": " + netSalary + "VND");
        }
    }

    public double getAverageSalary() {
        return 0;
    }

    public String displayFullTimeStaffWithBelowAverageSalary() {
        return null;
    }

    public double getSumSalaryForPartTimeStaff() {
        return 0;
    }
}
