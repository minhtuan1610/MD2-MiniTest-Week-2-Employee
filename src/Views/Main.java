package Views;

import Controllers.Method;
import Models.Employee;
import Models.FullTimeEmployee;
import Models.PartTimeEmployee;

public class Main {
    public static Employee[] employees = new Employee[6];

    public static void main(String[] args) {
        //  Nhân viên full-time
        employees[0] = new FullTimeEmployee("a1", "Batman", 35, 123456789,
                "batman@gmail.com", 1000000.0, 50000.0, 1000000.0);
        employees[1] = new FullTimeEmployee("a2", "BatWoman", 22, 213456789,
                "batwoman@gmail.com", 1100000.0, 51000.0, 2000000.0);
        employees[2] = new FullTimeEmployee("a3", "Batgirl", 35, 312456789,
                "batgirl@gmail.com", 1200000.0, 52000.0, 3000000.0);
        //  Nhân viên part-time
        employees[3] = new PartTimeEmployee("b1", "GreenArrow", 34, 412356789,
                "thegreenarrow@gmail.com", 5.5);
        employees[4] = new PartTimeEmployee("b2", "TheFlash", 28, 512346789,
                "theflash@gmail.com", 2.5);
        employees[5] = new PartTimeEmployee("b3", "Supergirl", 24, 612345789,
                "supergirl@gmail.com", 8.0);
        //  Hiển thị thông tin của tất cả các nhân viên
        Method.displayEmployeeInfo(employees);

    }
}
