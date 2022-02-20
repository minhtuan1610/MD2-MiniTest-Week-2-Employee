package Controllers;

import Models.Employee;

public class Method {
    public static void displayEmployeeInfo(Employee[] employees) {
        for (Employee i : employees
        ) {
            String information = i.toString();
            System.out.println(information);
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
