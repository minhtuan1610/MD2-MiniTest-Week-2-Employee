package Controllers;

import Models.Employee;
import Models.FullTimeEmployee;
import Models.PartTimeEmployee;

import java.sql.SQLOutput;
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

    //  Thêm nhân viên full-time
    public static Employee addNewFullTimeStaff() {
        Employee newFullTimeStaff;

        System.out.println("Information of a new staff (ID, name, age):");
        Scanner inputId = new Scanner(System.in);
        String ID = inputId.nextLine();
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        Scanner inputAge = new Scanner(System.in);
        int age = inputAge.nextInt();

        System.out.println("Contact information of the new staff (phone, email):");
        Scanner inputPhoneNumber = new Scanner(System.in);
        int phoneNumber = inputPhoneNumber.nextInt();
        Scanner inputEmail = new Scanner(System.in);
        String email = inputEmail.nextLine();

        System.out.println("Salary of the new staff (bonus, fine, base):");
        Scanner inputBonus = new Scanner(System.in);
        double bonus = inputBonus.nextDouble();
        Scanner inputFine = new Scanner(System.in);
        double fine = inputFine.nextDouble();
        Scanner inputBaseWage = new Scanner(System.in);
        double baseWage = inputBaseWage.nextDouble();

        newFullTimeStaff = new FullTimeEmployee(ID, name, age, phoneNumber, email, bonus, fine, baseWage);
        return newFullTimeStaff;
    }

    //  Thêm nhân viên part-time
    public static Employee addNewPartTimeStaff() {
        Employee newPartTimeStaff;

        System.out.println("Information of a new staff (ID, name, age):");
        Scanner inputId = new Scanner(System.in);
        String ID = inputId.nextLine();
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        Scanner inputAge = new Scanner(System.in);
        int age = inputAge.nextInt();

        System.out.println("Contact information of the new staff (phone, email):");
        Scanner inputPhoneNumber = new Scanner(System.in);
        int phoneNumber = inputPhoneNumber.nextInt();
        Scanner inputEmail = new Scanner(System.in);
        String email = inputEmail.nextLine();

        System.out.println("Work-times of the new staff:");
        Scanner inputWorkHours = new Scanner(System.in);
        double workHours = inputWorkHours.nextDouble();

        newPartTimeStaff = new PartTimeEmployee(ID, name, age, phoneNumber, email, workHours);
        return newPartTimeStaff;
    }

    //  In ra danh sách sau khi thêm mới nhân viên
    public static Employee[] displayNewStaffList(Employee[] employees, Employee newEmployee) {
        Employee[] newListStaff = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newListStaff[i] = employees[i];
        }
        newListStaff[employees.length] = newEmployee;
        return newListStaff;
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

    //  Sắp xếp nhân viên full-time theo mức lương tăng dần
    public static void displayStaffByAscendingSalary(Employee[] employees) {

    }
}
