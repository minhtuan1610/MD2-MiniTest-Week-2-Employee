package Controllers;

import Models.Employee;
import Models.FullTimeEmployee;
import Models.PartTimeEmployee;

import java.util.Scanner;

public class Method {
    //  Hiển thị thông tin nhân viên
    public static void displayEmployeeInfo(Employee[] employees) {
        for (Employee i : employees
        ) {
            String information = i.toString();
            System.out.println(information);
        }
    }

    //  Hiển thị lương thực lĩnh của từng kiểu nhân viên
    public static void displayNetSalary(Employee[] employees) {
        for (Employee i : employees
        ) {
            double netSalary = i.getNetSalary();
            System.out.println(i.getEmployeeID() + "-" + i.getEmployeeName() + ": " + netSalary + " VND");
        }
    }

    //  Thêm mới nhân viên
    public static void addNewStaff() {
        Scanner scanner = new Scanner(System.in);
    }

    //  Tính lương trung bình của các nhân viên
    public static double getAverageSalary(Employee[] employees) {
        double sum = 0;
        double avg;
        for (Employee i : employees
        ) {
            sum += i.getNetSalary();
        }
        avg = sum / employees.length;
        return avg;
    }

    //  Hiển thị nhân viên full-time có mức lương dưới mức trung bình
    public static void displayFullTimeStaffWithBelowAverageSalary(Employee[] employees, double averageSalary) {
        for (Employee i : employees
        ) {
            if (i instanceof FullTimeEmployee) {
                if (i.getNetSalary() < averageSalary) {
                    String employeeInfo = i.toString();
                    System.out.println(employeeInfo);
                }
            }
        }
    }

    //  Tính tổng tiền trả cho nhân viên part-time
    public static void displaySumSalaryForPartTimeStaff(Employee[] employees) {
        double sum = 0;
        for (Employee i : employees
        ) {
            if (i instanceof PartTimeEmployee) {
                sum += i.getNetSalary();
            }
        }
        System.out.println("The sum of salary for part-time employee is: " + sum);
        ;
    }

}
